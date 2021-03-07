package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for GistComment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait GistCommentResolver {

    @throws[Exception]
    def userContentEdits(gistCommentTO: GistCommentTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserContentEditConnectionTO

}
