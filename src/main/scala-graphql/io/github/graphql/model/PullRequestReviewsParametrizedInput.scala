package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import PullRequestReviewStateTO._

/**
 * Parametrized input for field reviews in type PullRequest
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class PullRequestReviewsParametrizedInput(
    after: String,
    author: String,
    before: String,
    first: Option[Int],
    last: Option[Int],
    @javax.validation.constraints.NotNull
    states: Seq[PullRequestReviewStateTO]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (author != null) "author: " + GraphQLRequestSerializer.getEntry(author) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (states != null) "states: " + GraphQLRequestSerializer.getEntry(states.asJava) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
