package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Starrable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait StarrableResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def stargazers(starrableTO: StarrableTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: StarOrderTO): StargazerConnectionTO

}
