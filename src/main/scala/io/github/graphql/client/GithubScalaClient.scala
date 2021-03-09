package io.github.graphql.client

import com.kobylynskyi.graphql.codegen.model.graphql.{ GraphQLOperationRequest, GraphQLResponseProjection }
import io.github.graphql.{ ScalaResolverProxy, ServerConfig }

import java.lang.reflect.Proxy
import io.github.graphql.ScalaResolverProxyPlus

class GithubScalaClient {

  private var config: ServerConfig = _
  private var resolver: Class[_] = _
  private var projection: GraphQLResponseProjection = _

  private def getResolverObject[Q <: GraphQLOperationRequest : Manifest]: AnyRef = {
    val invocationHandler = new ScalaResolverProxy[Q](config, projection)
    Proxy.newProxyInstance(resolver.getClassLoader, Array[Class[_]](resolver), invocationHandler)
  }

  private def getResolverObject[Q <: GraphQLOperationRequest : Manifest, Out: Manifest]: AnyRef = {
    val invocationHandler = new ScalaResolverProxyPlus[Q, Out](config, projection)
    Proxy.newProxyInstance(resolver.getClassLoader, Array[Class[_]](resolver), invocationHandler)
  }

}

object GithubScalaClient {

  def newBuilder: GitHubScalaClientBuilder = new GitHubScalaClientBuilder()

  class GitHubScalaClientBuilder() {

    private var projection: GraphQLResponseProjection = _
    private var config: ServerConfig = _

    def setConfig(config: ServerConfig): GitHubScalaClientBuilder = {
      this.config = config
      this
    }

    def setProjection(projection: GraphQLResponseProjection): GitHubScalaClientBuilder = {
      this.projection = projection
      this
    }

    def build[R: Manifest, Q <: GraphQLOperationRequest : Manifest]: R = {
      assert(this.config != null)
      val invoke = new GithubScalaClient
      invoke.config = this.config
      invoke.projection = this.projection
      invoke.resolver = manifest[R].runtimeClass
      invoke.getResolverObject[Q].asInstanceOf[R]
    }

    def build[R: Manifest, Q <: GraphQLOperationRequest : Manifest, Out: Manifest]: R = {
      assert(this.config != null)
      val invoke = new GithubScalaClient
      invoke.config = this.config
      invoke.projection = this.projection
      invoke.resolver = manifest[R].runtimeClass
      invoke.getResolverObject[Q, Out].asInstanceOf[R]
    }
  }

}
