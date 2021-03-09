package io.github.graphql.client

import com.kobylynskyi.graphql.codegen.model.graphql.{ GraphQLOperationRequest, GraphQLResponseProjection }
import io.github.graphql.ServerConfig
import io.github.graphql.proxy.ScalaResolverProxyV2
import io.github.graphql.proxy.ScalaResolverProxyV1

import java.lang.reflect.Proxy

class GithubScalaClient {

  private var config: ServerConfig = _
  private var resolver: Class[_] = _
  private var projection: GraphQLResponseProjection = _

  private def getResolverObjectV1[Request <: GraphQLOperationRequest : Manifest]: AnyRef = {
    val invocationHandler: ScalaResolverProxyV1[Request] = ScalaResolverProxyV1[Request](config, projection)
    Proxy.newProxyInstance(resolver.getClassLoader, Array[Class[_]](resolver), invocationHandler)
  }

  private def getResolverObjectV2[Request <: GraphQLOperationRequest : Manifest, Out: Manifest]: AnyRef = {
    val invocationHandler: ScalaResolverProxyV2[Request, Out] = ScalaResolverProxyV2[Request, Out](config, projection)
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

    def buildV1[Resolver: Manifest, Request <: GraphQLOperationRequest : Manifest]: Resolver = {
      assert(this.config != null)
      val invoke = new GithubScalaClient
      invoke.config = this.config
      invoke.projection = this.projection
      invoke.resolver = manifest[Resolver].runtimeClass
      invoke.getResolverObjectV1[Request].asInstanceOf[Resolver]
    }

    def buildV2[Resolver: Manifest, Request <: GraphQLOperationRequest : Manifest, Out: Manifest]: Resolver = {
      assert(this.config != null)
      val invoke = new GithubScalaClient
      invoke.config = this.config
      invoke.projection = this.projection
      invoke.resolver = manifest[Resolver].runtimeClass
      invoke.getResolverObjectV2[Request, Out].asInstanceOf[Resolver]
    }
  }

}
