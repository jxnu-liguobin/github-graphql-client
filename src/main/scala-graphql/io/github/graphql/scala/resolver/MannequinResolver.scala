package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Mannequin
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait MannequinResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def avatarUrl(mannequinTO: MannequinTO, size: Option[Int]): String

}
