package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import ReactionContentTO._

/**
 * Resolver for CommitComment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait CommitCommentResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def reactions(commitCommentTO: CommitCommentTO, after: String, before: String, content: ReactionContentTO, first: Option[Int], last: Option[Int], orderBy: ReactionOrderTO): ReactionConnectionTO

    @throws[Exception]
    def userContentEdits(commitCommentTO: CommitCommentTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserContentEditConnectionTO

}
