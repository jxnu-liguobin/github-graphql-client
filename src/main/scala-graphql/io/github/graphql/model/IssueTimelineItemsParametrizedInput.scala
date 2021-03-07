package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import IssueTimelineItemsItemTypeTO._

/**
 * Parametrized input for field timelineItems in type Issue
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class IssueTimelineItemsParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    @javax.validation.constraints.NotNull
    itemTypes: Seq[IssueTimelineItemsItemTypeTO],
    last: Option[Int],
    since: String,
    skip: Option[Int]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (itemTypes != null) "itemTypes: " + GraphQLRequestSerializer.getEntry(itemTypes.asJava) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (since != null) "since: " + GraphQLRequestSerializer.getEntry(since) else "",
            if (skip.isDefined) "skip: " + GraphQLRequestSerializer.getEntry(skip.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
