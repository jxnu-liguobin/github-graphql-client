package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Actor
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait ActorResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def avatarUrl(actorTO: ActorTO, size: Option[Int]): String

}
