package io.github.graphql.proxy

import com.kobylynskyi.graphql.codegen.model.graphql.{ GraphQLOperationRequest, GraphQLRequest, GraphQLResponseField, GraphQLResponseProjection }
import io.github.graphql.{ CollectionUtils, ExecuteException, OkHttp, ServerConfig }
import io.github.graphql.deserializer.ScalaDeserializer

import java.lang.reflect.{ InvocationHandler, Method, ParameterizedType }
import scala.reflect.runtime.{ universe => ru }
import scala.reflect.runtime.universe._

final class ScalaResolverProxyV2[Request <: GraphQLOperationRequest : Manifest, Out: Manifest] private
(val config: ServerConfig, val projection: GraphQLResponseProjection) extends InvocationHandler
  with ScalaDeserializer {

  private[this] lazy val constructor = getRuntimeMirror.reflectClass(getRequestScalaType.typeSymbol.asClass)
    .reflectConstructor(getRequestScalaType.members.find(_.isConstructor).get.asMethod)

  private val request: GraphQLOperationRequest = constructor.apply(null).asInstanceOf[GraphQLOperationRequest]

  private[this] def getRuntimeMirror: ru.Mirror = runtimeMirror(getClass.getClassLoader)

  private[this] def getRequestScalaType: ru.Type = typeOf[Request]

  override def invoke(proxy: AnyRef, method: Method, args: Array[AnyRef]): Any =
    if (classOf[AnyRef] == method.getDeclaringClass) {
      try {
        method.invoke(this, args)
      } catch {
        case t: Throwable =>
          throw ExecuteException("invoke failed: ", t.getLocalizedMessage, t)
      }
    } else {
      proxyInvoke(method, args)
    }

  private def proxyInvoke(method: Method, args: Array[AnyRef]): Any = {
    val `type` = method.getGenericReturnType
    val isCollection = `type` match {
      case _: ParameterizedType => true
      case _ => false
    }
    val parameters = method.getParameters.toList
    if (parameters.nonEmpty) {
      val parameterNames = parameters.map(_.getName)
      val arguments = args.toList
      request.getInput.putAll(CollectionUtils.listToMap(parameterNames, arguments))
    }

    // use shapeless LabelledGeneric
    def fieldValue(name: String): Any = {
      val im = ru.runtimeMirror(projection.getClass.getClassLoader)
      getRuntimeMirror.classSymbol(projection.getClass).toType.members.filter(!_.isMethod).
        filter(_.name.decodedName.toString.trim.equals(name)).map(s => {
        im.reflect(projection).reflectField(s.asTerm).get
      }).head
    }

    val fields: java.util.List[GraphQLResponseField] = fieldValue("fields").asInstanceOf[java.util.List[GraphQLResponseField]]

    if (projection != null && (fields == null || fields.isEmpty)) {
      throw ExecuteException("projection verification failed: ", "fields of projection cannot be empty")
    }

    val graphQLRequest = new GraphQLRequest(request, projection)
    OkHttp.syncRunQuery(config, isCollection, graphQLRequest)(extractData[Out])
  }

}

object ScalaResolverProxyV2 {

  def apply[Request <: GraphQLOperationRequest : Manifest, Out: Manifest](config: ServerConfig, projection: GraphQLResponseProjection):
  ScalaResolverProxyV2[Request, Out] = new ScalaResolverProxyV2[Request, Out](config, projection)
}
