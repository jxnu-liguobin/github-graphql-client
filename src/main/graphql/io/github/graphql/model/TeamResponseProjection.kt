package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Team
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TeamResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TeamResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TeamResponseProjection {
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", 0) <= maxDepth) {
            projectionDepthOnFields["TeamResponseProjection.TeamConnectionResponseProjection.ancestors"] = projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", 0) + 1
            this.ancestors(TeamConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", 0)))
        }
        this.avatarUrl()
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", 0) <= maxDepth) {
            projectionDepthOnFields["TeamResponseProjection.TeamConnectionResponseProjection.childTeams"] = projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", 0) + 1
            this.childTeams(TeamConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", 0)))
        }
        this.combinedSlug()
        this.createdAt()
        this.description()
        this.editTeamResourcePath()
        this.editTeamUrl()
        this.id()
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", 0) <= maxDepth) {
            projectionDepthOnFields["TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations"] = projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", 0) + 1
            this.invitations(OrganizationInvitationConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) <= maxDepth) {
            projectionDepthOnFields["TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses"] = projectionDepthOnFields.getOrDefault("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) + 1
            this.memberStatuses(UserStatusConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", 0) <= maxDepth) {
            projectionDepthOnFields["TeamResponseProjection.TeamMemberConnectionResponseProjection.members"] = projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", 0) + 1
            this.members(TeamMemberConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", 0)))
        }
        this.membersResourcePath()
        this.membersUrl()
        this.name()
        this.newTeamResourcePath()
        this.newTeamUrl()
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields["TeamResponseProjection.OrganizationResponseProjection.organization"] = projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationResponseProjection.organization", 0) + 1
            this.organization(OrganizationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamResponseProjection.parentTeam", 0) <= maxDepth) {
            projectionDepthOnFields["TeamResponseProjection.TeamResponseProjection.parentTeam"] = projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamResponseProjection.parentTeam", 0) + 1
            this.parentTeam(TeamResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamResponseProjection.parentTeam", 0)))
        }
        this.privacy()
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields["TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories"] = projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", 0) + 1
            this.repositories(TeamRepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", 0)))
        }
        this.repositoriesResourcePath()
        this.repositoriesUrl()
        this.resourcePath()
        this.slug()
        this.teamsResourcePath()
        this.teamsUrl()
        this.updatedAt()
        this.url()
        this.viewerCanAdminister()
        this.viewerCanSubscribe()
        this.viewerSubscription()
        this.typename()
        return this
    }

    fun ancestors(subProjection: TeamConnectionResponseProjection): TeamResponseProjection = ancestors(null, subProjection)

    fun ancestors(alias: String?, subProjection: TeamConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("ancestors").alias(alias).projection(subProjection))
        return this
    }

    fun ancestors(input: TeamAncestorsParametrizedInput, subProjection: TeamConnectionResponseProjection): TeamResponseProjection = ancestors(null, input, subProjection)

    fun ancestors(alias: String?, input: TeamAncestorsParametrizedInput, subProjection: TeamConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("ancestors").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun avatarUrl(): TeamResponseProjection = avatarUrl(null)

    fun avatarUrl(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias))
        return this
    }

    fun avatarUrl(input: TeamAvatarUrlParametrizedInput): TeamResponseProjection = avatarUrl(null, input)

    fun avatarUrl(alias: String?, input: TeamAvatarUrlParametrizedInput): TeamResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        return this
    }

    fun childTeams(subProjection: TeamConnectionResponseProjection): TeamResponseProjection = childTeams(null, subProjection)

    fun childTeams(alias: String?, subProjection: TeamConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("childTeams").alias(alias).projection(subProjection))
        return this
    }

    fun childTeams(input: TeamChildTeamsParametrizedInput, subProjection: TeamConnectionResponseProjection): TeamResponseProjection = childTeams(null, input, subProjection)

    fun childTeams(alias: String?, input: TeamChildTeamsParametrizedInput, subProjection: TeamConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("childTeams").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun combinedSlug(): TeamResponseProjection = combinedSlug(null)

    fun combinedSlug(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("combinedSlug").alias(alias))
        return this
    }

    fun createdAt(): TeamResponseProjection = createdAt(null)

    fun createdAt(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun description(): TeamResponseProjection = description(null)

    fun description(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun editTeamResourcePath(): TeamResponseProjection = editTeamResourcePath(null)

    fun editTeamResourcePath(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("editTeamResourcePath").alias(alias))
        return this
    }

    fun editTeamUrl(): TeamResponseProjection = editTeamUrl(null)

    fun editTeamUrl(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("editTeamUrl").alias(alias))
        return this
    }

    fun id(): TeamResponseProjection = id(null)

    fun id(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun invitations(subProjection: OrganizationInvitationConnectionResponseProjection): TeamResponseProjection = invitations(null, subProjection)

    fun invitations(alias: String?, subProjection: OrganizationInvitationConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("invitations").alias(alias).projection(subProjection))
        return this
    }

    fun invitations(input: TeamInvitationsParametrizedInput, subProjection: OrganizationInvitationConnectionResponseProjection): TeamResponseProjection = invitations(null, input, subProjection)

    fun invitations(alias: String?, input: TeamInvitationsParametrizedInput, subProjection: OrganizationInvitationConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("invitations").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun memberStatuses(subProjection: UserStatusConnectionResponseProjection): TeamResponseProjection = memberStatuses(null, subProjection)

    fun memberStatuses(alias: String?, subProjection: UserStatusConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("memberStatuses").alias(alias).projection(subProjection))
        return this
    }

    fun memberStatuses(input: TeamMemberStatusesParametrizedInput, subProjection: UserStatusConnectionResponseProjection): TeamResponseProjection = memberStatuses(null, input, subProjection)

    fun memberStatuses(alias: String?, input: TeamMemberStatusesParametrizedInput, subProjection: UserStatusConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("memberStatuses").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun members(subProjection: TeamMemberConnectionResponseProjection): TeamResponseProjection = members(null, subProjection)

    fun members(alias: String?, subProjection: TeamMemberConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("members").alias(alias).projection(subProjection))
        return this
    }

    fun members(input: TeamMembersParametrizedInput, subProjection: TeamMemberConnectionResponseProjection): TeamResponseProjection = members(null, input, subProjection)

    fun members(alias: String?, input: TeamMembersParametrizedInput, subProjection: TeamMemberConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("members").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun membersResourcePath(): TeamResponseProjection = membersResourcePath(null)

    fun membersResourcePath(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("membersResourcePath").alias(alias))
        return this
    }

    fun membersUrl(): TeamResponseProjection = membersUrl(null)

    fun membersUrl(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("membersUrl").alias(alias))
        return this
    }

    fun name(): TeamResponseProjection = name(null)

    fun name(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun newTeamResourcePath(): TeamResponseProjection = newTeamResourcePath(null)

    fun newTeamResourcePath(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("newTeamResourcePath").alias(alias))
        return this
    }

    fun newTeamUrl(): TeamResponseProjection = newTeamUrl(null)

    fun newTeamUrl(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("newTeamUrl").alias(alias))
        return this
    }

    fun organization(subProjection: OrganizationResponseProjection): TeamResponseProjection = organization(null, subProjection)

    fun organization(alias: String?, subProjection: OrganizationResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("organization").alias(alias).projection(subProjection))
        return this
    }

    fun parentTeam(subProjection: TeamResponseProjection): TeamResponseProjection = parentTeam(null, subProjection)

    fun parentTeam(alias: String?, subProjection: TeamResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("parentTeam").alias(alias).projection(subProjection))
        return this
    }

    fun privacy(): TeamResponseProjection = privacy(null)

    fun privacy(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("privacy").alias(alias))
        return this
    }

    fun repositories(subProjection: TeamRepositoryConnectionResponseProjection): TeamResponseProjection = repositories(null, subProjection)

    fun repositories(alias: String?, subProjection: TeamRepositoryConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("repositories").alias(alias).projection(subProjection))
        return this
    }

    fun repositories(input: TeamRepositoriesParametrizedInput, subProjection: TeamRepositoryConnectionResponseProjection): TeamResponseProjection = repositories(null, input, subProjection)

    fun repositories(alias: String?, input: TeamRepositoriesParametrizedInput, subProjection: TeamRepositoryConnectionResponseProjection): TeamResponseProjection {
        fields.add(GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repositoriesResourcePath(): TeamResponseProjection = repositoriesResourcePath(null)

    fun repositoriesResourcePath(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("repositoriesResourcePath").alias(alias))
        return this
    }

    fun repositoriesUrl(): TeamResponseProjection = repositoriesUrl(null)

    fun repositoriesUrl(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("repositoriesUrl").alias(alias))
        return this
    }

    fun resourcePath(): TeamResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun slug(): TeamResponseProjection = slug(null)

    fun slug(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("slug").alias(alias))
        return this
    }

    fun teamsResourcePath(): TeamResponseProjection = teamsResourcePath(null)

    fun teamsResourcePath(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("teamsResourcePath").alias(alias))
        return this
    }

    fun teamsUrl(): TeamResponseProjection = teamsUrl(null)

    fun teamsUrl(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("teamsUrl").alias(alias))
        return this
    }

    fun updatedAt(): TeamResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): TeamResponseProjection = url(null)

    fun url(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun viewerCanAdminister(): TeamResponseProjection = viewerCanAdminister(null)

    fun viewerCanAdminister(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("viewerCanAdminister").alias(alias))
        return this
    }

    fun viewerCanSubscribe(): TeamResponseProjection = viewerCanSubscribe(null)

    fun viewerCanSubscribe(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("viewerCanSubscribe").alias(alias))
        return this
    }

    fun viewerSubscription(): TeamResponseProjection = viewerSubscription(null)

    fun viewerSubscription(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("viewerSubscription").alias(alias))
        return this
    }

    fun typename(): TeamResponseProjection = typename(null)

    fun typename(alias: String?): TeamResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
