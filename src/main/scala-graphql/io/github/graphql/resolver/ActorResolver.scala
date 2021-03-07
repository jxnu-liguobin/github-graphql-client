package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for Actor
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait ActorResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def avatarUrl(actorTO: ActorTO, size: Option[Int]): String

}
