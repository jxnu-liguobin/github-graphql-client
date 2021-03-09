package io.github.graphql.example

import io.github.graphql.s.resolver.QueryResolver
import io.github.graphql.ServerConfig
import io.github.graphql.client.GithubScalaClient
import io.github.graphql.s.model.{ UserQueryRequest, UserResponseProjection }


object ScalaClientExample extends App {

  val userResponseProjection = new UserResponseProjection().id().avatarUrl().login().resourcePath()
  val config = ServerConfig("https://api.github.com/graphql", Map("Authorization" -> "Bearer x"))
  val queryResolver = GithubScalaClient.newBuilder.setConfig(config).
    setProjection(userResponseProjection).
    build[QueryResolver, UserQueryRequest]

  val userTO = queryResolver.user("jxnu-liguobin")
  println(userTO.id) //TODO request tostring has bug.

}
