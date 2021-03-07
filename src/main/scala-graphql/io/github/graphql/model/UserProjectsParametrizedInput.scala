package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import ProjectStateTO._

/**
 * Parametrized input for field projects in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class UserProjectsParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    last: Option[Int],
    orderBy: ProjectOrderTO,
    search: String,
    @javax.validation.constraints.NotNull
    states: Seq[ProjectStateTO]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (search != null) "search: " + GraphQLRequestSerializer.getEntry(search) else "",
            if (states != null) "states: " + GraphQLRequestSerializer.getEntry(states.asJava) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
