package io.github.graphql.proxy

import com.kobylynskyi.graphql.codegen.model.graphql.{ GraphQLOperationRequest, GraphQLRequest, GraphQLResponseField, GraphQLResponseProjection }
import io.github.graphql.{ CollectionUtils, ExecuteException, OkHttp, ServerConfig }
import io.github.graphql.deserializer.JavaDeserializerAdapter

import java.lang.reflect.{ Field, InvocationHandler, Method, ParameterizedType }
import java.util

final class ScalaResolverProxyV1[Request <: GraphQLOperationRequest : Manifest] private
(val config: ServerConfig, val projection: GraphQLResponseProjection) extends InvocationHandler
  with JavaDeserializerAdapter {

  private lazy val request: GraphQLOperationRequest = manifest[Request].runtimeClass.getConstructor(classOf[String]).
    newInstance(null).asInstanceOf[GraphQLOperationRequest]

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
    val entityClass = `type` match {
      case parameterizedType1: ParameterizedType =>
        val parameterizedType = parameterizedType1.getActualTypeArguments
        parameterizedType(0).asInstanceOf[Class[_]]
      case _ => `type`.asInstanceOf[Class[_]]
    }

    if (isPrimitive(entityClass)) {
      assert(projection == null)
    } else {
      assert(projection != null)
    }

    val parameters = method.getParameters.toList
    if (parameters.nonEmpty) {
      val parameterNames = parameters.map(_.getName)
      val arguments = args.toList
      request.getInput.putAll(CollectionUtils.listToMap(parameterNames, arguments))
    }
    // TODO remove reflect
    var field: Field = null
    var fields: util.List[GraphQLResponseField] = null
    try {
      field = projection.getClass.getSuperclass.getDeclaredField("fields")
      field.setAccessible(true)
      fields = field.get(projection).asInstanceOf[util.List[GraphQLResponseField]]
    } catch {
      case e@(_: NoSuchFieldException | _: IllegalAccessException) =>
        throw ExecuteException("access fields failed: ", e.getLocalizedMessage, e)
    } finally if (field != null) field.setAccessible(false)

    if (projection != null && (fields == null || fields.isEmpty)) {
      throw ExecuteException("projection verification failed: ", "fields of projection cannot be empty")
    }

    val graphQLRequest = new GraphQLRequest(request, projection)
    OkHttp.syncRunQuery(config, graphQLRequest, entityClass)(extractData)
  }

}

object ScalaResolverProxyV1 {

  def apply[Request <: GraphQLOperationRequest : Manifest](config: ServerConfig, projection: GraphQLResponseProjection):
  ScalaResolverProxyV1[Request] = new ScalaResolverProxyV1[Request](config, projection)
}
