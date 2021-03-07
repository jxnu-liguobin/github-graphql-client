package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Comment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait CommentResolver {

    @throws[Exception]
    def userContentEdits(commentTO: CommentTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserContentEditConnectionTO

}
