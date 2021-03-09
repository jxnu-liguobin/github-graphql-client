package io.github.graphql.example

import io.github.graphql.s.resolver.QueryResolver
import io.github.graphql.ServerConfig
import io.github.graphql.client.GithubScalaClient
import io.github.graphql.s.model.{ UserQueryRequest, UserResponseProjection }
import io.github.graphql.s.model.UserTO


object ScalaClientExample extends App {

  val userResponseProjection = new UserResponseProjection().id().avatarUrl().login().resourcePath()
  val config = ServerConfig("https://api.github.com/graphql", Map("Authorization" -> "Bearer eab669ff8286e9a87e97f84cb7a9fad706e1a20f"))
  val queryResolver = GithubScalaClient.newBuilder.setConfig(config).
    setProjection(userResponseProjection).
    build[QueryResolver, UserQueryRequest]

  val userTO = queryResolver.user("jxnu-liguobin")
  println(userTO.id) //TODO request tostring has bug.


  // use scalaDeserialize with ScalaObjectMapper, but ScalaObjectMapper will not be available in scala3.
  val userResponseProjection1 = new UserResponseProjection().id().avatarUrl().login().resourcePath()
  val queryResolver1 = GithubScalaClient.newBuilder.setConfig(config).
    setProjection(userResponseProjection).
    build[QueryResolver, UserQueryRequest, UserTO]

  val userTO1 = queryResolver.user("jxnu-liguobin")
  println(userTO.toString())


}
