package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for Gist
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait GistResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def comments(gistTO: GistTO, after: String, before: String, first: Option[Int], last: Option[Int]): GistCommentConnectionTO

    @throws[Exception]
    def files(gistTO: GistTO, limit: Option[Int], oid: String): Seq[GistFileTO]

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def forks(gistTO: GistTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: GistOrderTO): GistConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def stargazers(gistTO: GistTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: StarOrderTO): StargazerConnectionTO

}
