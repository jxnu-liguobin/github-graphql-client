package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Organization
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class OrganizationResponseProjection extends GraphQLResponseProjection {

    public OrganizationResponseProjection() {
    }

    @Override
    public OrganizationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrganizationResponseProjection all$(int maxDepth) {
        this.anyPinnableItems();
        this.avatarUrl();
        this.databaseId();
        this.description();
        this.email();
        this.id();
        this.isVerified();
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) + 1);
            this.itemShowcase(new ProfileItemShowcaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0)));
        }
        this.location();
        this.login();
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) + 1);
            this.memberStatuses(new UserStatusConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", 0) + 1);
            this.membersWithRole(new OrganizationMemberConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationMemberConnectionResponseProjection.membersWithRole", 0)));
        }
        this.name();
        this.newTeamResourcePath();
        this.newTeamUrl();
        this.organizationBillingEmail();
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", 0) + 1);
            this.pendingMembers(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.UserConnectionResponseProjection.pendingMembers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) + 1);
            this.pinnableItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) + 1);
            this.pinnedItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0)));
        }
        this.pinnedItemsRemaining();
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) + 1);
            this.pinnedRepositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectResponseProjection.project", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1);
            this.projects(new ProjectConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.ProjectConnectionResponseProjection.projects", 0)));
        }
        this.projectsResourcePath();
        this.projectsUrl();
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1);
            this.registryPackages(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0) + 1);
            this.registryPackagesForQuery(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RegistryPackageConnectionResponseProjection.registryPackagesForQuery", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) + 1);
            this.repositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryConnectionResponseProjection.repositories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.requiresTwoFactorAuthentication();
        this.resourcePath();
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", 0) + 1);
            this.samlIdentityProvider(new OrganizationIdentityProviderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.OrganizationIdentityProviderResponseProjection.samlIdentityProvider", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamResponseProjection.team", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.TeamResponseProjection.team", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamResponseProjection.team", 0) + 1);
            this.team(new TeamResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamResponseProjection.team", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", 0) + 1);
            this.teams(new TeamConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationResponseProjection.TeamConnectionResponseProjection.teams", 0)));
        }
        this.teamsResourcePath();
        this.teamsUrl();
        this.url();
        this.viewerCanAdminister();
        this.viewerCanChangePinnedItems();
        this.viewerCanCreateProjects();
        this.viewerCanCreateRepositories();
        this.viewerCanCreateTeams();
        this.viewerIsAMember();
        this.websiteUrl();
        this.typename();
        return this;
    }

    public OrganizationResponseProjection anyPinnableItems() {
        return anyPinnableItems((String)null);
    }

    public OrganizationResponseProjection anyPinnableItems(String alias) {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias));
        return this;
    }

    public OrganizationResponseProjection anyPinnableItems(OrganizationAnyPinnableItemsParametrizedInput input) {
        return anyPinnableItems(null, input);
    }

    public OrganizationResponseProjection anyPinnableItems(String alias, OrganizationAnyPinnableItemsParametrizedInput input) {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias).parameters(input));
        return this;
    }

    public OrganizationResponseProjection avatarUrl() {
        return avatarUrl((String)null);
    }

    public OrganizationResponseProjection avatarUrl(String alias) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public OrganizationResponseProjection avatarUrl(OrganizationAvatarUrlParametrizedInput input) {
        return avatarUrl(null, input);
    }

    public OrganizationResponseProjection avatarUrl(String alias, OrganizationAvatarUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input));
        return this;
    }

    public OrganizationResponseProjection databaseId() {
        return databaseId(null);
    }

    public OrganizationResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public OrganizationResponseProjection description() {
        return description(null);
    }

    public OrganizationResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public OrganizationResponseProjection email() {
        return email(null);
    }

    public OrganizationResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public OrganizationResponseProjection id() {
        return id(null);
    }

    public OrganizationResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OrganizationResponseProjection isVerified() {
        return isVerified(null);
    }

    public OrganizationResponseProjection isVerified(String alias) {
        fields.add(new GraphQLResponseField("isVerified").alias(alias));
        return this;
    }

    public OrganizationResponseProjection itemShowcase(ProfileItemShowcaseResponseProjection subProjection) {
        return itemShowcase(null, subProjection);
    }

    public OrganizationResponseProjection itemShowcase(String alias, ProfileItemShowcaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemShowcase").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection location() {
        return location(null);
    }

    public OrganizationResponseProjection location(String alias) {
        fields.add(new GraphQLResponseField("location").alias(alias));
        return this;
    }

    public OrganizationResponseProjection login() {
        return login(null);
    }

    public OrganizationResponseProjection login(String alias) {
        fields.add(new GraphQLResponseField("login").alias(alias));
        return this;
    }

    public OrganizationResponseProjection memberStatuses(UserStatusConnectionResponseProjection subProjection) {
        return memberStatuses((String)null, subProjection);
    }

    public OrganizationResponseProjection memberStatuses(String alias, UserStatusConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection memberStatuses(OrganizationMemberStatusesParametrizedInput input, UserStatusConnectionResponseProjection subProjection) {
        return memberStatuses(null, input, subProjection);
    }

    public OrganizationResponseProjection memberStatuses(String alias, OrganizationMemberStatusesParametrizedInput input, UserStatusConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection membersWithRole(OrganizationMemberConnectionResponseProjection subProjection) {
        return membersWithRole((String)null, subProjection);
    }

    public OrganizationResponseProjection membersWithRole(String alias, OrganizationMemberConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("membersWithRole").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection membersWithRole(OrganizationMembersWithRoleParametrizedInput input, OrganizationMemberConnectionResponseProjection subProjection) {
        return membersWithRole(null, input, subProjection);
    }

    public OrganizationResponseProjection membersWithRole(String alias, OrganizationMembersWithRoleParametrizedInput input, OrganizationMemberConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("membersWithRole").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection name() {
        return name(null);
    }

    public OrganizationResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public OrganizationResponseProjection newTeamResourcePath() {
        return newTeamResourcePath(null);
    }

    public OrganizationResponseProjection newTeamResourcePath(String alias) {
        fields.add(new GraphQLResponseField("newTeamResourcePath").alias(alias));
        return this;
    }

    public OrganizationResponseProjection newTeamUrl() {
        return newTeamUrl(null);
    }

    public OrganizationResponseProjection newTeamUrl(String alias) {
        fields.add(new GraphQLResponseField("newTeamUrl").alias(alias));
        return this;
    }

    public OrganizationResponseProjection organizationBillingEmail() {
        return organizationBillingEmail(null);
    }

    public OrganizationResponseProjection organizationBillingEmail(String alias) {
        fields.add(new GraphQLResponseField("organizationBillingEmail").alias(alias));
        return this;
    }

    public OrganizationResponseProjection pendingMembers(UserConnectionResponseProjection subProjection) {
        return pendingMembers((String)null, subProjection);
    }

    public OrganizationResponseProjection pendingMembers(String alias, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pendingMembers").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection pendingMembers(OrganizationPendingMembersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return pendingMembers(null, input, subProjection);
    }

    public OrganizationResponseProjection pendingMembers(String alias, OrganizationPendingMembersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pendingMembers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection pinnableItems(PinnableItemConnectionResponseProjection subProjection) {
        return pinnableItems((String)null, subProjection);
    }

    public OrganizationResponseProjection pinnableItems(String alias, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection pinnableItems(OrganizationPinnableItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        return pinnableItems(null, input, subProjection);
    }

    public OrganizationResponseProjection pinnableItems(String alias, OrganizationPinnableItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection pinnedItems(PinnableItemConnectionResponseProjection subProjection) {
        return pinnedItems((String)null, subProjection);
    }

    public OrganizationResponseProjection pinnedItems(String alias, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection pinnedItems(OrganizationPinnedItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        return pinnedItems(null, input, subProjection);
    }

    public OrganizationResponseProjection pinnedItems(String alias, OrganizationPinnedItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection pinnedItemsRemaining() {
        return pinnedItemsRemaining(null);
    }

    public OrganizationResponseProjection pinnedItemsRemaining(String alias) {
        fields.add(new GraphQLResponseField("pinnedItemsRemaining").alias(alias));
        return this;
    }

    @Deprecated
    public OrganizationResponseProjection pinnedRepositories(RepositoryConnectionResponseProjection subProjection) {
        return pinnedRepositories((String)null, subProjection);
    }

    public OrganizationResponseProjection pinnedRepositories(String alias, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection pinnedRepositories(OrganizationPinnedRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        return pinnedRepositories(null, input, subProjection);
    }

    public OrganizationResponseProjection pinnedRepositories(String alias, OrganizationPinnedRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection project(ProjectResponseProjection subProjection) {
        return project((String)null, subProjection);
    }

    public OrganizationResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection project(OrganizationProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        return project(null, input, subProjection);
    }

    public OrganizationResponseProjection project(String alias, OrganizationProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection projects(ProjectConnectionResponseProjection subProjection) {
        return projects((String)null, subProjection);
    }

    public OrganizationResponseProjection projects(String alias, ProjectConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection projects(OrganizationProjectsParametrizedInput input, ProjectConnectionResponseProjection subProjection) {
        return projects(null, input, subProjection);
    }

    public OrganizationResponseProjection projects(String alias, OrganizationProjectsParametrizedInput input, ProjectConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection projectsResourcePath() {
        return projectsResourcePath(null);
    }

    public OrganizationResponseProjection projectsResourcePath(String alias) {
        fields.add(new GraphQLResponseField("projectsResourcePath").alias(alias));
        return this;
    }

    public OrganizationResponseProjection projectsUrl() {
        return projectsUrl(null);
    }

    public OrganizationResponseProjection projectsUrl(String alias) {
        fields.add(new GraphQLResponseField("projectsUrl").alias(alias));
        return this;
    }

    public OrganizationResponseProjection registryPackages(RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackages((String)null, subProjection);
    }

    public OrganizationResponseProjection registryPackages(String alias, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection registryPackages(OrganizationRegistryPackagesParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackages(null, input, subProjection);
    }

    public OrganizationResponseProjection registryPackages(String alias, OrganizationRegistryPackagesParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection registryPackagesForQuery(RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackagesForQuery((String)null, subProjection);
    }

    public OrganizationResponseProjection registryPackagesForQuery(String alias, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection registryPackagesForQuery(OrganizationRegistryPackagesForQueryParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackagesForQuery(null, input, subProjection);
    }

    public OrganizationResponseProjection registryPackagesForQuery(String alias, OrganizationRegistryPackagesForQueryParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackagesForQuery").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection repositories(RepositoryConnectionResponseProjection subProjection) {
        return repositories((String)null, subProjection);
    }

    public OrganizationResponseProjection repositories(String alias, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositories").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection repositories(OrganizationRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        return repositories(null, input, subProjection);
    }

    public OrganizationResponseProjection repositories(String alias, OrganizationRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository((String)null, subProjection);
    }

    public OrganizationResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection repository(OrganizationRepositoryParametrizedInput input, RepositoryResponseProjection subProjection) {
        return repository(null, input, subProjection);
    }

    public OrganizationResponseProjection repository(String alias, OrganizationRepositoryParametrizedInput input, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection requiresTwoFactorAuthentication() {
        return requiresTwoFactorAuthentication(null);
    }

    public OrganizationResponseProjection requiresTwoFactorAuthentication(String alias) {
        fields.add(new GraphQLResponseField("requiresTwoFactorAuthentication").alias(alias));
        return this;
    }

    public OrganizationResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public OrganizationResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public OrganizationResponseProjection samlIdentityProvider(OrganizationIdentityProviderResponseProjection subProjection) {
        return samlIdentityProvider(null, subProjection);
    }

    public OrganizationResponseProjection samlIdentityProvider(String alias, OrganizationIdentityProviderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("samlIdentityProvider").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection team(TeamResponseProjection subProjection) {
        return team((String)null, subProjection);
    }

    public OrganizationResponseProjection team(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("team").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection team(OrganizationTeamParametrizedInput input, TeamResponseProjection subProjection) {
        return team(null, input, subProjection);
    }

    public OrganizationResponseProjection team(String alias, OrganizationTeamParametrizedInput input, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("team").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection teams(TeamConnectionResponseProjection subProjection) {
        return teams((String)null, subProjection);
    }

    public OrganizationResponseProjection teams(String alias, TeamConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("teams").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection teams(OrganizationTeamsParametrizedInput input, TeamConnectionResponseProjection subProjection) {
        return teams(null, input, subProjection);
    }

    public OrganizationResponseProjection teams(String alias, OrganizationTeamsParametrizedInput input, TeamConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("teams").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public OrganizationResponseProjection teamsResourcePath() {
        return teamsResourcePath(null);
    }

    public OrganizationResponseProjection teamsResourcePath(String alias) {
        fields.add(new GraphQLResponseField("teamsResourcePath").alias(alias));
        return this;
    }

    public OrganizationResponseProjection teamsUrl() {
        return teamsUrl(null);
    }

    public OrganizationResponseProjection teamsUrl(String alias) {
        fields.add(new GraphQLResponseField("teamsUrl").alias(alias));
        return this;
    }

    public OrganizationResponseProjection url() {
        return url(null);
    }

    public OrganizationResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public OrganizationResponseProjection viewerCanAdminister() {
        return viewerCanAdminister(null);
    }

    public OrganizationResponseProjection viewerCanAdminister(String alias) {
        fields.add(new GraphQLResponseField("viewerCanAdminister").alias(alias));
        return this;
    }

    public OrganizationResponseProjection viewerCanChangePinnedItems() {
        return viewerCanChangePinnedItems(null);
    }

    public OrganizationResponseProjection viewerCanChangePinnedItems(String alias) {
        fields.add(new GraphQLResponseField("viewerCanChangePinnedItems").alias(alias));
        return this;
    }

    public OrganizationResponseProjection viewerCanCreateProjects() {
        return viewerCanCreateProjects(null);
    }

    public OrganizationResponseProjection viewerCanCreateProjects(String alias) {
        fields.add(new GraphQLResponseField("viewerCanCreateProjects").alias(alias));
        return this;
    }

    public OrganizationResponseProjection viewerCanCreateRepositories() {
        return viewerCanCreateRepositories(null);
    }

    public OrganizationResponseProjection viewerCanCreateRepositories(String alias) {
        fields.add(new GraphQLResponseField("viewerCanCreateRepositories").alias(alias));
        return this;
    }

    public OrganizationResponseProjection viewerCanCreateTeams() {
        return viewerCanCreateTeams(null);
    }

    public OrganizationResponseProjection viewerCanCreateTeams(String alias) {
        fields.add(new GraphQLResponseField("viewerCanCreateTeams").alias(alias));
        return this;
    }

    public OrganizationResponseProjection viewerIsAMember() {
        return viewerIsAMember(null);
    }

    public OrganizationResponseProjection viewerIsAMember(String alias) {
        fields.add(new GraphQLResponseField("viewerIsAMember").alias(alias));
        return this;
    }

    public OrganizationResponseProjection websiteUrl() {
        return websiteUrl(null);
    }

    public OrganizationResponseProjection websiteUrl(String alias) {
        fields.add(new GraphQLResponseField("websiteUrl").alias(alias));
        return this;
    }

    public OrganizationResponseProjection typename() {
        return typename(null);
    }

    public OrganizationResponseProjection typename(String alias) {
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
        final OrganizationResponseProjection that = (OrganizationResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
