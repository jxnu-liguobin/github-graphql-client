package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Organization
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface OrganizationResolver {

    boolean anyPinnableItems(OrganizationTO organizationTO, PinnableItemTypeTO type) throws Exception;

    @javax.validation.constraints.NotNull
    String avatarUrl(OrganizationTO organizationTO, Integer size) throws Exception;

    @javax.validation.constraints.NotNull
    UserStatusConnectionTO memberStatuses(OrganizationTO organizationTO, String after, String before, Integer first, Integer last, UserStatusOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    OrganizationMemberConnectionTO membersWithRole(OrganizationTO organizationTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    UserConnectionTO pendingMembers(OrganizationTO organizationTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    PinnableItemConnectionTO pinnableItems(OrganizationTO organizationTO, String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) throws Exception;

    @javax.validation.constraints.NotNull
    PinnableItemConnectionTO pinnedItems(OrganizationTO organizationTO, String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) throws Exception;

    @Deprecated
    @javax.validation.constraints.NotNull
    RepositoryConnectionTO pinnedRepositories(OrganizationTO organizationTO, java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) throws Exception;

    ProjectTO project(OrganizationTO organizationTO, int number) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectConnectionTO projects(OrganizationTO organizationTO, String after, String before, Integer first, Integer last, ProjectOrderTO orderBy, String search, java.util.List<ProjectStateTO> states) throws Exception;

    @javax.validation.constraints.NotNull
    RegistryPackageConnectionTO registryPackages(OrganizationTO organizationTO, String after, String before, Integer first, Integer last, String name, java.util.List<String> names, RegistryPackageTypeTO packageType, Boolean publicOnly, String registryPackageType, String repositoryId) throws Exception;

    @javax.validation.constraints.NotNull
    RegistryPackageConnectionTO registryPackagesForQuery(OrganizationTO organizationTO, String after, String before, Integer first, Integer last, RegistryPackageTypeTO packageType, String query) throws Exception;

    @javax.validation.constraints.NotNull
    RepositoryConnectionTO repositories(OrganizationTO organizationTO, java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isFork, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) throws Exception;

    RepositoryTO repository(OrganizationTO organizationTO, String name) throws Exception;

    TeamTO team(OrganizationTO organizationTO, String slug) throws Exception;

    @javax.validation.constraints.NotNull
    TeamConnectionTO teams(OrganizationTO organizationTO, String after, String before, Integer first, Integer last, Boolean ldapMapped, TeamOrderTO orderBy, TeamPrivacyTO privacy, String query, TeamRoleTO role, Boolean rootTeamsOnly, java.util.List<String> userLogins) throws Exception;

}
