package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import PullRequestStateTO._

/**
 * Parametrized input for field pullRequests in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class UserPullRequestsParametrizedInput(
    after: String,
    baseRefName: String,
    before: String,
    first: Option[Int],
    headRefName: String,
    @javax.validation.constraints.NotNull
    labels: Seq[String],
    last: Option[Int],
    orderBy: IssueOrderTO,
    @javax.validation.constraints.NotNull
    states: Seq[PullRequestStateTO]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (baseRefName != null) "baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (headRefName != null) "headRefName: " + GraphQLRequestSerializer.getEntry(headRefName) else "",
            if (labels != null) "labels: " + GraphQLRequestSerializer.getEntry(labels.asJava) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (states != null) "states: " + GraphQLRequestSerializer.getEntry(states.asJava) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
