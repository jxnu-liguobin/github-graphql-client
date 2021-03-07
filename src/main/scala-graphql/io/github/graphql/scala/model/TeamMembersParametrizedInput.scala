package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import TeamMembershipTypeTO._
import TeamMemberRoleTO._

/**
 * Parametrized input for field members in type Team
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class TeamMembersParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    last: Option[Int],
    membership: TeamMembershipTypeTO = TeamMembershipTypeTO.ALL,
    orderBy: TeamMemberOrderTO,
    query: String,
    role: TeamMemberRoleTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (membership != null) "membership: " + GraphQLRequestSerializer.getEntry(membership) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (query != null) "query: " + GraphQLRequestSerializer.getEntry(query) else "",
            if (role != null) "role: " + GraphQLRequestSerializer.getEntry(role) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
