package io.github.graphql

import com.kobylynskyi.graphql.codegen.model.graphql.{ GraphQLOperationRequest, GraphQLRequest, GraphQLResponseField, GraphQLResponseProjection }

import java.lang.reflect.{ Field, InvocationHandler, Method, ParameterizedType }
import java.util
import scala.reflect.runtime.universe._
import scala.reflect.runtime.universe

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2021/3/9
 */
class ScalaResolverProxyPlus[Q <: GraphQLOperationRequest : Manifest, Out: Manifest] extends InvocationHandler {

  private[this] lazy val constructor = getRuntimeMirror.reflectClass(getRequestScalaType.typeSymbol.asClass)
    .reflectConstructor(getRequestScalaType.members.find(_.isConstructor).get.asMethod)

  private var config: ServerConfig = _
  private var projection: GraphQLResponseProjection = _
  private val request: GraphQLOperationRequest = constructor.apply(null).asInstanceOf[GraphQLOperationRequest]

  def this(config: ServerConfig, projection: GraphQLResponseProjection) = {
    this()
    this.config = config
    this.projection = projection
  }

  private[this] def getRuntimeMirror: universe.Mirror = runtimeMirror(getClass.getClassLoader)

  private[this] def getRequestScalaType: universe.Type = typeOf[Q]

  override def invoke(proxy: Any, method: Method, args: Array[AnyRef]): Any =
    if (classOf[Any] == method.getDeclaringClass) try method.invoke(this, args)
    catch {
      case t: Throwable =>
        throw ExecuteException("invoke failed: ", t.getLocalizedMessage, t)
    }
    else proxyInvoke(method, args)

  private def proxyInvoke(method: Method, args: Array[AnyRef]): Any = {
    var field: Field = null
    var fields: util.List[GraphQLResponseField] = null
    val `type` = method.getGenericReturnType
    val isCollection = `type` match {
      case _: ParameterizedType => true
      case _ => false
    }
    val parameters = method.getParameters.toList
    if (parameters.nonEmpty) {
      val parameterNames = parameters.map(_.getName)
      val arguments = args.toList
      request.getInput.putAll(JavaCollectionUtils.listToMap(parameterNames, arguments))
    }

    try {
      field = projection.getClass.getSuperclass.getDeclaredField("fields")
      field.setAccessible(true)
      fields = field.get(projection).asInstanceOf[util.List[GraphQLResponseField]]
    } catch {
      case e@(_: NoSuchFieldException | _: IllegalAccessException) =>
        throw ExecuteException("access fields failed: ", e.getLocalizedMessage, e)
    } finally if (field != null) field.setAccessible(false)

    if (projection != null && (fields == null || fields.isEmpty)) projection = projection.all$(config.responseProjectionMaxDepth)
    val graphQLRequest = new GraphQLRequest(request, projection)
    OkHttp.syncRunQuery[Out](config, isCollection, graphQLRequest)
  }

}
