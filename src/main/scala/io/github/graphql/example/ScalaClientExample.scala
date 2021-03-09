package io.github.graphql.example

import io.github.graphql.s.resolver.QueryResolver
import io.github.graphql.ServerConfig
import io.github.graphql.client.GithubScalaClient
import io.github.graphql.s.model.{ UserQueryRequest, UserResponseProjection }
import io.github.graphql.s.model.UserTO


object ScalaClientExample extends App {

  val userResponseProjection = new UserResponseProjection().id().avatarUrl().login().resourcePath()
  val config = ServerConfig("https://api.github.com/graphql", Map("Authorization" -> "Bearer xx"))
  val queryResolver = GithubScalaClient.newBuilder.setConfig(config).
    setProjection(userResponseProjection).
    buildV1[QueryResolver, UserQueryRequest]

  val userTO = queryResolver.user("jxnu-liguobin")
  println(userTO.id) //tostring failed, because jackson use java Deserializer


  // Use scalaDeserialize with ScalaObjectMapper, but ScalaObjectMapper will not be available in scala3.
  // Use Scala reflection instead of java reflection
  val userResponseProjection1 = new UserResponseProjection().id().avatarUrl().login().resourcePath()
  val queryResolver1 = GithubScalaClient.newBuilder.setConfig(config).
    setProjection(userResponseProjection).
    buildV2[QueryResolver, UserQueryRequest, UserTO]

  val userTO1 = queryResolver1.user("jxnu-liguobin")
  println(userTO.toString())

}
