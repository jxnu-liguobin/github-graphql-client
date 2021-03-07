package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import TeamPrivacyTO._
import TeamRoleTO._

/**
 * Parametrized input for field teams in type Organization
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class OrganizationTeamsParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    last: Option[Int],
    ldapMapped: Option[Boolean],
    orderBy: TeamOrderTO,
    privacy: TeamPrivacyTO,
    query: String,
    role: TeamRoleTO,
    rootTeamsOnly: Option[Boolean] = Some(false),
    @javax.validation.constraints.NotNull
    userLogins: Seq[String]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (ldapMapped.isDefined) "ldapMapped: " + GraphQLRequestSerializer.getEntry(ldapMapped.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (privacy != null) "privacy: " + GraphQLRequestSerializer.getEntry(privacy) else "",
            if (query != null) "query: " + GraphQLRequestSerializer.getEntry(query) else "",
            if (role != null) "role: " + GraphQLRequestSerializer.getEntry(role) else "",
            if (rootTeamsOnly.isDefined) "rootTeamsOnly: " + GraphQLRequestSerializer.getEntry(rootTeamsOnly.get) else "",
            if (userLogins != null) "userLogins: " + GraphQLRequestSerializer.getEntry(userLogins.asJava) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
