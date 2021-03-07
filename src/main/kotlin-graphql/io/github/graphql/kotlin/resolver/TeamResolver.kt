package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Team
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
interface TeamResolver {

    @Throws(Exception::class)
    fun ancestors(teamTO: TeamTO, after: String?, before: String?, first: Int?, last: Int?): TeamConnectionTO

    @Throws(Exception::class)
    fun avatarUrl(teamTO: TeamTO, size: Int?): String?

    @Throws(Exception::class)
    fun childTeams(teamTO: TeamTO, after: String?, before: String?, first: Int?, immediateOnly: Boolean?, last: Int?, orderBy: TeamOrderTO?, userLogins: List<String>?): TeamConnectionTO

    @Throws(Exception::class)
    fun invitations(teamTO: TeamTO, after: String?, before: String?, first: Int?, last: Int?): OrganizationInvitationConnectionTO?

    @Throws(Exception::class)
    fun memberStatuses(teamTO: TeamTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: UserStatusOrderTO?): UserStatusConnectionTO

    @Throws(Exception::class)
    fun members(teamTO: TeamTO, after: String?, before: String?, first: Int?, last: Int?, membership: TeamMembershipTypeTO?, orderBy: TeamMemberOrderTO?, query: String?, role: TeamMemberRoleTO?): TeamMemberConnectionTO

    @Throws(Exception::class)
    fun repositories(teamTO: TeamTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: TeamRepositoryOrderTO?, query: String?): TeamRepositoryConnectionTO

}
