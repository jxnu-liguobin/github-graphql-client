package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for GitActor
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait GitActorResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def avatarUrl(gitActorTO: GitActorTO, size: Option[Int]): String

}
