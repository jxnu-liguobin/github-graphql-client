package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Team
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TeamResponseProjection extends GraphQLResponseProjection {

    public TeamResponseProjection() {
    }

    @Override
    public TeamResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TeamResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", 0) + 1);
            this.ancestors(new TeamConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.ancestors", 0)));
        }
        this.avatarUrl();
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", 0) + 1);
            this.childTeams(new TeamConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamConnectionResponseProjection.childTeams", 0)));
        }
        this.combinedSlug();
        this.createdAt();
        this.description();
        this.editTeamResourcePath();
        this.editTeamUrl();
        this.id();
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", 0) + 1);
            this.invitations(new OrganizationInvitationConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationInvitationConnectionResponseProjection.invitations", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", projectionDepthOnFields.getOrDefault("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) + 1);
            this.memberStatuses(new UserStatusConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", 0) + 1);
            this.members(new TeamMemberConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamMemberConnectionResponseProjection.members", 0)));
        }
        this.membersResourcePath();
        this.membersUrl();
        this.name();
        this.newTeamResourcePath();
        this.newTeamUrl();
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationResponseProjection.organization", 0) + 1);
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.OrganizationResponseProjection.organization", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamResponseProjection.parentTeam", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamResponseProjection.parentTeam", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamResponseProjection.parentTeam", 0) + 1);
            this.parentTeam(new TeamResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamResponseProjection.parentTeam", 0)));
        }
        this.privacy();
        if (projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", 0) + 1);
            this.repositories(new TeamRepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamResponseProjection.TeamRepositoryConnectionResponseProjection.repositories", 0)));
        }
        this.repositoriesResourcePath();
        this.repositoriesUrl();
        this.resourcePath();
        this.slug();
        this.teamsResourcePath();
        this.teamsUrl();
        this.updatedAt();
        this.url();
        this.viewerCanAdminister();
        this.viewerCanSubscribe();
        this.viewerSubscription();
        this.typename();
        return this;
    }

    public TeamResponseProjection ancestors(TeamConnectionResponseProjection subProjection) {
        return ancestors((String)null, subProjection);
    }

    public TeamResponseProjection ancestors(String alias, TeamConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ancestors").alias(alias).projection(subProjection));
        return this;
    }

    public TeamResponseProjection ancestors(TeamAncestorsParametrizedInput input, TeamConnectionResponseProjection subProjection) {
        return ancestors(null, input, subProjection);
    }

    public TeamResponseProjection ancestors(String alias, TeamAncestorsParametrizedInput input, TeamConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ancestors").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public TeamResponseProjection avatarUrl() {
        return avatarUrl((String)null);
    }

    public TeamResponseProjection avatarUrl(String alias) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public TeamResponseProjection avatarUrl(TeamAvatarUrlParametrizedInput input) {
        return avatarUrl(null, input);
    }

    public TeamResponseProjection avatarUrl(String alias, TeamAvatarUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input));
        return this;
    }

    public TeamResponseProjection childTeams(TeamConnectionResponseProjection subProjection) {
        return childTeams((String)null, subProjection);
    }

    public TeamResponseProjection childTeams(String alias, TeamConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("childTeams").alias(alias).projection(subProjection));
        return this;
    }

    public TeamResponseProjection childTeams(TeamChildTeamsParametrizedInput input, TeamConnectionResponseProjection subProjection) {
        return childTeams(null, input, subProjection);
    }

    public TeamResponseProjection childTeams(String alias, TeamChildTeamsParametrizedInput input, TeamConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("childTeams").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public TeamResponseProjection combinedSlug() {
        return combinedSlug(null);
    }

    public TeamResponseProjection combinedSlug(String alias) {
        fields.add(new GraphQLResponseField("combinedSlug").alias(alias));
        return this;
    }

    public TeamResponseProjection createdAt() {
        return createdAt(null);
    }

    public TeamResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public TeamResponseProjection description() {
        return description(null);
    }

    public TeamResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public TeamResponseProjection editTeamResourcePath() {
        return editTeamResourcePath(null);
    }

    public TeamResponseProjection editTeamResourcePath(String alias) {
        fields.add(new GraphQLResponseField("editTeamResourcePath").alias(alias));
        return this;
    }

    public TeamResponseProjection editTeamUrl() {
        return editTeamUrl(null);
    }

    public TeamResponseProjection editTeamUrl(String alias) {
        fields.add(new GraphQLResponseField("editTeamUrl").alias(alias));
        return this;
    }

    public TeamResponseProjection id() {
        return id(null);
    }

    public TeamResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TeamResponseProjection invitations(OrganizationInvitationConnectionResponseProjection subProjection) {
        return invitations((String)null, subProjection);
    }

    public TeamResponseProjection invitations(String alias, OrganizationInvitationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("invitations").alias(alias).projection(subProjection));
        return this;
    }

    public TeamResponseProjection invitations(TeamInvitationsParametrizedInput input, OrganizationInvitationConnectionResponseProjection subProjection) {
        return invitations(null, input, subProjection);
    }

    public TeamResponseProjection invitations(String alias, TeamInvitationsParametrizedInput input, OrganizationInvitationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("invitations").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public TeamResponseProjection memberStatuses(UserStatusConnectionResponseProjection subProjection) {
        return memberStatuses((String)null, subProjection);
    }

    public TeamResponseProjection memberStatuses(String alias, UserStatusConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).projection(subProjection));
        return this;
    }

    public TeamResponseProjection memberStatuses(TeamMemberStatusesParametrizedInput input, UserStatusConnectionResponseProjection subProjection) {
        return memberStatuses(null, input, subProjection);
    }

    public TeamResponseProjection memberStatuses(String alias, TeamMemberStatusesParametrizedInput input, UserStatusConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public TeamResponseProjection members(TeamMemberConnectionResponseProjection subProjection) {
        return members((String)null, subProjection);
    }

    public TeamResponseProjection members(String alias, TeamMemberConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("members").alias(alias).projection(subProjection));
        return this;
    }

    public TeamResponseProjection members(TeamMembersParametrizedInput input, TeamMemberConnectionResponseProjection subProjection) {
        return members(null, input, subProjection);
    }

    public TeamResponseProjection members(String alias, TeamMembersParametrizedInput input, TeamMemberConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("members").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public TeamResponseProjection membersResourcePath() {
        return membersResourcePath(null);
    }

    public TeamResponseProjection membersResourcePath(String alias) {
        fields.add(new GraphQLResponseField("membersResourcePath").alias(alias));
        return this;
    }

    public TeamResponseProjection membersUrl() {
        return membersUrl(null);
    }

    public TeamResponseProjection membersUrl(String alias) {
        fields.add(new GraphQLResponseField("membersUrl").alias(alias));
        return this;
    }

    public TeamResponseProjection name() {
        return name(null);
    }

    public TeamResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TeamResponseProjection newTeamResourcePath() {
        return newTeamResourcePath(null);
    }

    public TeamResponseProjection newTeamResourcePath(String alias) {
        fields.add(new GraphQLResponseField("newTeamResourcePath").alias(alias));
        return this;
    }

    public TeamResponseProjection newTeamUrl() {
        return newTeamUrl(null);
    }

    public TeamResponseProjection newTeamUrl(String alias) {
        fields.add(new GraphQLResponseField("newTeamUrl").alias(alias));
        return this;
    }

    public TeamResponseProjection organization(OrganizationResponseProjection subProjection) {
        return organization(null, subProjection);
    }

    public TeamResponseProjection organization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection));
        return this;
    }

    public TeamResponseProjection parentTeam(TeamResponseProjection subProjection) {
        return parentTeam(null, subProjection);
    }

    public TeamResponseProjection parentTeam(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentTeam").alias(alias).projection(subProjection));
        return this;
    }

    public TeamResponseProjection privacy() {
        return privacy(null);
    }

    public TeamResponseProjection privacy(String alias) {
        fields.add(new GraphQLResponseField("privacy").alias(alias));
        return this;
    }

    public TeamResponseProjection repositories(TeamRepositoryConnectionResponseProjection subProjection) {
        return repositories((String)null, subProjection);
    }

    public TeamResponseProjection repositories(String alias, TeamRepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositories").alias(alias).projection(subProjection));
        return this;
    }

    public TeamResponseProjection repositories(TeamRepositoriesParametrizedInput input, TeamRepositoryConnectionResponseProjection subProjection) {
        return repositories(null, input, subProjection);
    }

    public TeamResponseProjection repositories(String alias, TeamRepositoriesParametrizedInput input, TeamRepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public TeamResponseProjection repositoriesResourcePath() {
        return repositoriesResourcePath(null);
    }

    public TeamResponseProjection repositoriesResourcePath(String alias) {
        fields.add(new GraphQLResponseField("repositoriesResourcePath").alias(alias));
        return this;
    }

    public TeamResponseProjection repositoriesUrl() {
        return repositoriesUrl(null);
    }

    public TeamResponseProjection repositoriesUrl(String alias) {
        fields.add(new GraphQLResponseField("repositoriesUrl").alias(alias));
        return this;
    }

    public TeamResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public TeamResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public TeamResponseProjection slug() {
        return slug(null);
    }

    public TeamResponseProjection slug(String alias) {
        fields.add(new GraphQLResponseField("slug").alias(alias));
        return this;
    }

    public TeamResponseProjection teamsResourcePath() {
        return teamsResourcePath(null);
    }

    public TeamResponseProjection teamsResourcePath(String alias) {
        fields.add(new GraphQLResponseField("teamsResourcePath").alias(alias));
        return this;
    }

    public TeamResponseProjection teamsUrl() {
        return teamsUrl(null);
    }

    public TeamResponseProjection teamsUrl(String alias) {
        fields.add(new GraphQLResponseField("teamsUrl").alias(alias));
        return this;
    }

    public TeamResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public TeamResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public TeamResponseProjection url() {
        return url(null);
    }

    public TeamResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public TeamResponseProjection viewerCanAdminister() {
        return viewerCanAdminister(null);
    }

    public TeamResponseProjection viewerCanAdminister(String alias) {
        fields.add(new GraphQLResponseField("viewerCanAdminister").alias(alias));
        return this;
    }

    public TeamResponseProjection viewerCanSubscribe() {
        return viewerCanSubscribe(null);
    }

    public TeamResponseProjection viewerCanSubscribe(String alias) {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias));
        return this;
    }

    public TeamResponseProjection viewerSubscription() {
        return viewerSubscription(null);
    }

    public TeamResponseProjection viewerSubscription(String alias) {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias));
        return this;
    }

    public TeamResponseProjection typename() {
        return typename(null);
    }

    public TeamResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TeamResponseProjection that = (TeamResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
