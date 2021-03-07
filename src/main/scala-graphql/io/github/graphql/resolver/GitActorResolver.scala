package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for GitActor
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait GitActorResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def avatarUrl(gitActorTO: GitActorTO, size: Option[Int]): String

}
