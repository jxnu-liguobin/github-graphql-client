package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import IssueStateTO._

/**
 * Parametrized input for field issues in type Repository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class RepositoryIssuesParametrizedInput(
    after: String,
    before: String,
    filterBy: IssueFiltersTO,
    first: Option[Int],
    @javax.validation.constraints.NotNull
    labels: Seq[String],
    last: Option[Int],
    orderBy: IssueOrderTO,
    @javax.validation.constraints.NotNull
    states: Seq[IssueStateTO]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (filterBy != null) "filterBy: " + GraphQLRequestSerializer.getEntry(filterBy) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (labels != null) "labels: " + GraphQLRequestSerializer.getEntry(labels.asJava) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (states != null) "states: " + GraphQLRequestSerializer.getEntry(states.asJava) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
