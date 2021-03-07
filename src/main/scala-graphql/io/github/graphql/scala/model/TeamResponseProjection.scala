package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Team
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TeamResponseProjection extends GraphQLResponseProjection {

    override def all$(): TeamResponseProjection = all$(3)

    override def all$(maxDepth: Int): TeamResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", 0) + 1)
            this.ancestors(new TeamConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", 0)))
        }
        this.avatarUrl()
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", 0) + 1)
            this.childTeams(new TeamConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", 0)))
        }
        this.combinedSlug()
        this.createdAt()
        this.description()
        this.editTeamResourcePath()
        this.editTeamUrl()
        this.id()
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", 0) + 1)
            this.invitations(new OrganizationInvitationConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", projectionDepthOnFields.getOrDefault("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) + 1)
            this.memberStatuses(new UserStatusConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", 0) + 1)
            this.members(new TeamMemberConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", 0)))
        }
        this.membersResourcePath()
        this.membersUrl()
        this.name()
        this.newTeamResourcePath()
        this.newTeamUrl()
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationResponseProjection.organization", 0) + 1)
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamResponseProjection.parentTeam", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamResponseProjection.parentTeam", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamResponseProjection.parentTeam", 0) + 1)
            this.parentTeam(new TeamResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamResponseProjection.parentTeam", 0)))
        }
        this.privacy()
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", 0) + 1)
            this.repositories(new TeamRepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", 0)))
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
        this
    }

    def ancestors(subProjection: TeamConnectionResponseProjection): TeamResponseProjection = {
        ancestors(null.asInstanceOf[String], subProjection)
    }

    def ancestors(alias: String, subProjection: TeamConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("ancestors").alias(alias).projection(subProjection))
        this
    }

    def ancestors(input: TeamAncestorsParametrizedInput,subProjection: TeamConnectionResponseProjection): TeamResponseProjection = {
        ancestors(null.asInstanceOf[String], input, subProjection)
    }

    def ancestors(alias: String, input: TeamAncestorsParametrizedInput , subProjection: TeamConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("ancestors").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def avatarUrl(): TeamResponseProjection = {
        avatarUrl(null.asInstanceOf[String])
    }

    def avatarUrl(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias))
        this
    }

    def avatarUrl(input: TeamAvatarUrlParametrizedInput): TeamResponseProjection = {
        avatarUrl(null.asInstanceOf[String], input)
    }

    def avatarUrl(alias: String, input: TeamAvatarUrlParametrizedInput ): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        this
    }

    def childTeams(subProjection: TeamConnectionResponseProjection): TeamResponseProjection = {
        childTeams(null.asInstanceOf[String], subProjection)
    }

    def childTeams(alias: String, subProjection: TeamConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("childTeams").alias(alias).projection(subProjection))
        this
    }

    def childTeams(input: TeamChildTeamsParametrizedInput,subProjection: TeamConnectionResponseProjection): TeamResponseProjection = {
        childTeams(null.asInstanceOf[String], input, subProjection)
    }

    def childTeams(alias: String, input: TeamChildTeamsParametrizedInput , subProjection: TeamConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("childTeams").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def combinedSlug(): TeamResponseProjection = {
        combinedSlug(null.asInstanceOf[String])
    }

    def combinedSlug(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("combinedSlug").alias(alias))
        this
    }

    def createdAt(): TeamResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def description(): TeamResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def editTeamResourcePath(): TeamResponseProjection = {
        editTeamResourcePath(null.asInstanceOf[String])
    }

    def editTeamResourcePath(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("editTeamResourcePath").alias(alias))
        this
    }

    def editTeamUrl(): TeamResponseProjection = {
        editTeamUrl(null.asInstanceOf[String])
    }

    def editTeamUrl(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("editTeamUrl").alias(alias))
        this
    }

    def id(): TeamResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def invitations(subProjection: OrganizationInvitationConnectionResponseProjection): TeamResponseProjection = {
        invitations(null.asInstanceOf[String], subProjection)
    }

    def invitations(alias: String, subProjection: OrganizationInvitationConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("invitations").alias(alias).projection(subProjection))
        this
    }

    def invitations(input: TeamInvitationsParametrizedInput,subProjection: OrganizationInvitationConnectionResponseProjection): TeamResponseProjection = {
        invitations(null.asInstanceOf[String], input, subProjection)
    }

    def invitations(alias: String, input: TeamInvitationsParametrizedInput , subProjection: OrganizationInvitationConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("invitations").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def memberStatuses(subProjection: UserStatusConnectionResponseProjection): TeamResponseProjection = {
        memberStatuses(null.asInstanceOf[String], subProjection)
    }

    def memberStatuses(alias: String, subProjection: UserStatusConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).projection(subProjection))
        this
    }

    def memberStatuses(input: TeamMemberStatusesParametrizedInput,subProjection: UserStatusConnectionResponseProjection): TeamResponseProjection = {
        memberStatuses(null.asInstanceOf[String], input, subProjection)
    }

    def memberStatuses(alias: String, input: TeamMemberStatusesParametrizedInput , subProjection: UserStatusConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def members(subProjection: TeamMemberConnectionResponseProjection): TeamResponseProjection = {
        members(null.asInstanceOf[String], subProjection)
    }

    def members(alias: String, subProjection: TeamMemberConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("members").alias(alias).projection(subProjection))
        this
    }

    def members(input: TeamMembersParametrizedInput,subProjection: TeamMemberConnectionResponseProjection): TeamResponseProjection = {
        members(null.asInstanceOf[String], input, subProjection)
    }

    def members(alias: String, input: TeamMembersParametrizedInput , subProjection: TeamMemberConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("members").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def membersResourcePath(): TeamResponseProjection = {
        membersResourcePath(null.asInstanceOf[String])
    }

    def membersResourcePath(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("membersResourcePath").alias(alias))
        this
    }

    def membersUrl(): TeamResponseProjection = {
        membersUrl(null.asInstanceOf[String])
    }

    def membersUrl(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("membersUrl").alias(alias))
        this
    }

    def name(): TeamResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def newTeamResourcePath(): TeamResponseProjection = {
        newTeamResourcePath(null.asInstanceOf[String])
    }

    def newTeamResourcePath(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("newTeamResourcePath").alias(alias))
        this
    }

    def newTeamUrl(): TeamResponseProjection = {
        newTeamUrl(null.asInstanceOf[String])
    }

    def newTeamUrl(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("newTeamUrl").alias(alias))
        this
    }

    def organization(subProjection: OrganizationResponseProjection): TeamResponseProjection = {
        organization(null.asInstanceOf[String], subProjection)
    }

    def organization(alias: String, subProjection: OrganizationResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection))
        this
    }

    def parentTeam(subProjection: TeamResponseProjection): TeamResponseProjection = {
        parentTeam(null.asInstanceOf[String], subProjection)
    }

    def parentTeam(alias: String, subProjection: TeamResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("parentTeam").alias(alias).projection(subProjection))
        this
    }

    def privacy(): TeamResponseProjection = {
        privacy(null.asInstanceOf[String])
    }

    def privacy(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("privacy").alias(alias))
        this
    }

    def repositories(subProjection: TeamRepositoryConnectionResponseProjection): TeamResponseProjection = {
        repositories(null.asInstanceOf[String], subProjection)
    }

    def repositories(alias: String, subProjection: TeamRepositoryConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("repositories").alias(alias).projection(subProjection))
        this
    }

    def repositories(input: TeamRepositoriesParametrizedInput,subProjection: TeamRepositoryConnectionResponseProjection): TeamResponseProjection = {
        repositories(null.asInstanceOf[String], input, subProjection)
    }

    def repositories(alias: String, input: TeamRepositoriesParametrizedInput , subProjection: TeamRepositoryConnectionResponseProjection): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repositoriesResourcePath(): TeamResponseProjection = {
        repositoriesResourcePath(null.asInstanceOf[String])
    }

    def repositoriesResourcePath(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("repositoriesResourcePath").alias(alias))
        this
    }

    def repositoriesUrl(): TeamResponseProjection = {
        repositoriesUrl(null.asInstanceOf[String])
    }

    def repositoriesUrl(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("repositoriesUrl").alias(alias))
        this
    }

    def resourcePath(): TeamResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def slug(): TeamResponseProjection = {
        slug(null.asInstanceOf[String])
    }

    def slug(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("slug").alias(alias))
        this
    }

    def teamsResourcePath(): TeamResponseProjection = {
        teamsResourcePath(null.asInstanceOf[String])
    }

    def teamsResourcePath(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("teamsResourcePath").alias(alias))
        this
    }

    def teamsUrl(): TeamResponseProjection = {
        teamsUrl(null.asInstanceOf[String])
    }

    def teamsUrl(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("teamsUrl").alias(alias))
        this
    }

    def updatedAt(): TeamResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): TeamResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def viewerCanAdminister(): TeamResponseProjection = {
        viewerCanAdminister(null.asInstanceOf[String])
    }

    def viewerCanAdminister(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanAdminister").alias(alias))
        this
    }

    def viewerCanSubscribe(): TeamResponseProjection = {
        viewerCanSubscribe(null.asInstanceOf[String])
    }

    def viewerCanSubscribe(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias))
        this
    }

    def viewerSubscription(): TeamResponseProjection = {
        viewerSubscription(null.asInstanceOf[String])
    }

    def viewerSubscription(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias))
        this
    }

    def typename(): TeamResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TeamResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[TeamResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
