package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import ReactionContentTO._

/**
 * Parametrized input for field reactions in type IssueComment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class IssueCommentReactionsParametrizedInput(
    after: String,
    before: String,
    content: ReactionContentTO,
    first: Option[Int],
    last: Option[Int],
    orderBy: ReactionOrderTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (content != null) "content: " + GraphQLRequestSerializer.getEntry(content) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
