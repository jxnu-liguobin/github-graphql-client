package io.github.graphql.resolver

import io.github.graphql.model._
import TeamMembershipTypeTO._
import TeamMemberRoleTO._

/**
 * Resolver for Team
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait TeamResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def ancestors(teamTO: TeamTO, after: String, before: String, first: Option[Int], last: Option[Int]): TeamConnectionTO

    @throws[Exception]
    def avatarUrl(teamTO: TeamTO, size: Option[Int]): String

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def childTeams(teamTO: TeamTO, after: String, before: String, first: Option[Int], immediateOnly: Option[Boolean], last: Option[Int], orderBy: TeamOrderTO, userLogins: Seq[String]): TeamConnectionTO

    @throws[Exception]
    def invitations(teamTO: TeamTO, after: String, before: String, first: Option[Int], last: Option[Int]): OrganizationInvitationConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def memberStatuses(teamTO: TeamTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: UserStatusOrderTO): UserStatusConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def members(teamTO: TeamTO, after: String, before: String, first: Option[Int], last: Option[Int], membership: TeamMembershipTypeTO, orderBy: TeamMemberOrderTO, query: String, role: TeamMemberRoleTO): TeamMemberConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def repositories(teamTO: TeamTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: TeamRepositoryOrderTO, query: String): TeamRepositoryConnectionTO

}
