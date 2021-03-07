package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import MilestoneStateTO._

/**
 * Parametrized input for field milestones in type Repository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class RepositoryMilestonesParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    last: Option[Int],
    orderBy: MilestoneOrderTO,
    @javax.validation.constraints.NotNull
    states: Seq[MilestoneStateTO]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (states != null) "states: " + GraphQLRequestSerializer.getEntry(states.asJava) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
