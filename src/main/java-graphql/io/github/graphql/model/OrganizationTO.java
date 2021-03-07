package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationTO implements java.io.Serializable, AssigneeTO, SearchResultItemTO, CollectionItemContentTO, PermissionGranterTO, RegistryPackageOwnerTO, ProjectOwnerTO, UniformResourceLocatableTO, RegistryPackageSearchTO, RepositoryOwnerTO, NodeTO, ProfileOwnerTO, ActorTO, MemberStatusableTO {

    private Integer databaseId;
    private String description;
    private String email;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isVerified;
    @javax.validation.constraints.NotNull
    private ProfileItemShowcaseTO itemShowcase;
    private String location;
    @javax.validation.constraints.NotNull
    private String login;
    private String name;
    @javax.validation.constraints.NotNull
    private String newTeamResourcePath;
    @javax.validation.constraints.NotNull
    private String newTeamUrl;
    private String organizationBillingEmail;
    private int pinnedItemsRemaining;
    @javax.validation.constraints.NotNull
    private String projectsResourcePath;
    @javax.validation.constraints.NotNull
    private String projectsUrl;
    private Boolean requiresTwoFactorAuthentication;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private OrganizationIdentityProviderTO samlIdentityProvider;
    @javax.validation.constraints.NotNull
    private String teamsResourcePath;
    @javax.validation.constraints.NotNull
    private String teamsUrl;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanAdminister;
    private boolean viewerCanChangePinnedItems;
    private boolean viewerCanCreateProjects;
    private boolean viewerCanCreateRepositories;
    private boolean viewerCanCreateTeams;
    private boolean viewerIsAMember;
    private String websiteUrl;

    public OrganizationTO() {
    }

    public OrganizationTO(Integer databaseId, String description, String email, String id, boolean isVerified, ProfileItemShowcaseTO itemShowcase, String location, String login, String name, String newTeamResourcePath, String newTeamUrl, String organizationBillingEmail, int pinnedItemsRemaining, String projectsResourcePath, String projectsUrl, Boolean requiresTwoFactorAuthentication, String resourcePath, OrganizationIdentityProviderTO samlIdentityProvider, String teamsResourcePath, String teamsUrl, String url, boolean viewerCanAdminister, boolean viewerCanChangePinnedItems, boolean viewerCanCreateProjects, boolean viewerCanCreateRepositories, boolean viewerCanCreateTeams, boolean viewerIsAMember, String websiteUrl) {
        this.databaseId = databaseId;
        this.description = description;
        this.email = email;
        this.id = id;
        this.isVerified = isVerified;
        this.itemShowcase = itemShowcase;
        this.location = location;
        this.login = login;
        this.name = name;
        this.newTeamResourcePath = newTeamResourcePath;
        this.newTeamUrl = newTeamUrl;
        this.organizationBillingEmail = organizationBillingEmail;
        this.pinnedItemsRemaining = pinnedItemsRemaining;
        this.projectsResourcePath = projectsResourcePath;
        this.projectsUrl = projectsUrl;
        this.requiresTwoFactorAuthentication = requiresTwoFactorAuthentication;
        this.resourcePath = resourcePath;
        this.samlIdentityProvider = samlIdentityProvider;
        this.teamsResourcePath = teamsResourcePath;
        this.teamsUrl = teamsUrl;
        this.url = url;
        this.viewerCanAdminister = viewerCanAdminister;
        this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
        this.viewerCanCreateProjects = viewerCanCreateProjects;
        this.viewerCanCreateRepositories = viewerCanCreateRepositories;
        this.viewerCanCreateTeams = viewerCanCreateTeams;
        this.viewerIsAMember = viewerIsAMember;
        this.websiteUrl = websiteUrl;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public boolean getIsVerified() {
        return isVerified;
    }

    public ProfileItemShowcaseTO getItemShowcase() {
        return itemShowcase;
    }

    public String getLocation() {
        return location;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getNewTeamResourcePath() {
        return newTeamResourcePath;
    }

    public String getNewTeamUrl() {
        return newTeamUrl;
    }

    public String getOrganizationBillingEmail() {
        return organizationBillingEmail;
    }

    public int getPinnedItemsRemaining() {
        return pinnedItemsRemaining;
    }

    public String getProjectsResourcePath() {
        return projectsResourcePath;
    }

    public String getProjectsUrl() {
        return projectsUrl;
    }

    public Boolean getRequiresTwoFactorAuthentication() {
        return requiresTwoFactorAuthentication;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public OrganizationIdentityProviderTO getSamlIdentityProvider() {
        return samlIdentityProvider;
    }

    public String getTeamsResourcePath() {
        return teamsResourcePath;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public String getUrl() {
        return url;
    }

    public boolean getViewerCanAdminister() {
        return viewerCanAdminister;
    }

    public boolean getViewerCanChangePinnedItems() {
        return viewerCanChangePinnedItems;
    }

    public boolean getViewerCanCreateProjects() {
        return viewerCanCreateProjects;
    }

    public boolean getViewerCanCreateRepositories() {
        return viewerCanCreateRepositories;
    }

    public boolean getViewerCanCreateTeams() {
        return viewerCanCreateTeams;
    }

    public boolean getViewerIsAMember() {
        return viewerIsAMember;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isVerified: " + GraphQLRequestSerializer.getEntry(isVerified));
        if (itemShowcase != null) {
            joiner.add("itemShowcase: " + GraphQLRequestSerializer.getEntry(itemShowcase));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (login != null) {
            joiner.add("login: " + GraphQLRequestSerializer.getEntry(login));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (newTeamResourcePath != null) {
            joiner.add("newTeamResourcePath: " + GraphQLRequestSerializer.getEntry(newTeamResourcePath));
        }
        if (newTeamUrl != null) {
            joiner.add("newTeamUrl: " + GraphQLRequestSerializer.getEntry(newTeamUrl));
        }
        if (organizationBillingEmail != null) {
            joiner.add("organizationBillingEmail: " + GraphQLRequestSerializer.getEntry(organizationBillingEmail));
        }
        joiner.add("pinnedItemsRemaining: " + GraphQLRequestSerializer.getEntry(pinnedItemsRemaining));
        if (projectsResourcePath != null) {
            joiner.add("projectsResourcePath: " + GraphQLRequestSerializer.getEntry(projectsResourcePath));
        }
        if (projectsUrl != null) {
            joiner.add("projectsUrl: " + GraphQLRequestSerializer.getEntry(projectsUrl));
        }
        if (requiresTwoFactorAuthentication != null) {
            joiner.add("requiresTwoFactorAuthentication: " + GraphQLRequestSerializer.getEntry(requiresTwoFactorAuthentication));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (samlIdentityProvider != null) {
            joiner.add("samlIdentityProvider: " + GraphQLRequestSerializer.getEntry(samlIdentityProvider));
        }
        if (teamsResourcePath != null) {
            joiner.add("teamsResourcePath: " + GraphQLRequestSerializer.getEntry(teamsResourcePath));
        }
        if (teamsUrl != null) {
            joiner.add("teamsUrl: " + GraphQLRequestSerializer.getEntry(teamsUrl));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("viewerCanAdminister: " + GraphQLRequestSerializer.getEntry(viewerCanAdminister));
        joiner.add("viewerCanChangePinnedItems: " + GraphQLRequestSerializer.getEntry(viewerCanChangePinnedItems));
        joiner.add("viewerCanCreateProjects: " + GraphQLRequestSerializer.getEntry(viewerCanCreateProjects));
        joiner.add("viewerCanCreateRepositories: " + GraphQLRequestSerializer.getEntry(viewerCanCreateRepositories));
        joiner.add("viewerCanCreateTeams: " + GraphQLRequestSerializer.getEntry(viewerCanCreateTeams));
        joiner.add("viewerIsAMember: " + GraphQLRequestSerializer.getEntry(viewerIsAMember));
        if (websiteUrl != null) {
            joiner.add("websiteUrl: " + GraphQLRequestSerializer.getEntry(websiteUrl));
        }
        return joiner.toString();
    }

    public static OrganizationTO.Builder builder() {
        return new OrganizationTO.Builder();
    }

    public static class Builder {

        private Integer databaseId;
        private String description;
        private String email;
        private String id;
        private boolean isVerified;
        private ProfileItemShowcaseTO itemShowcase;
        private String location;
        private String login;
        private String name;
        private String newTeamResourcePath;
        private String newTeamUrl;
        private String organizationBillingEmail;
        private int pinnedItemsRemaining;
        private String projectsResourcePath;
        private String projectsUrl;
        private Boolean requiresTwoFactorAuthentication;
        private String resourcePath;
        private OrganizationIdentityProviderTO samlIdentityProvider;
        private String teamsResourcePath;
        private String teamsUrl;
        private String url;
        private boolean viewerCanAdminister;
        private boolean viewerCanChangePinnedItems;
        private boolean viewerCanCreateProjects;
        private boolean viewerCanCreateRepositories;
        private boolean viewerCanCreateTeams;
        private boolean viewerIsAMember;
        private String websiteUrl;

        public Builder() {
        }

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsVerified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public Builder setItemShowcase(ProfileItemShowcaseTO itemShowcase) {
            this.itemShowcase = itemShowcase;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNewTeamResourcePath(String newTeamResourcePath) {
            this.newTeamResourcePath = newTeamResourcePath;
            return this;
        }

        public Builder setNewTeamUrl(String newTeamUrl) {
            this.newTeamUrl = newTeamUrl;
            return this;
        }

        public Builder setOrganizationBillingEmail(String organizationBillingEmail) {
            this.organizationBillingEmail = organizationBillingEmail;
            return this;
        }

        public Builder setPinnedItemsRemaining(int pinnedItemsRemaining) {
            this.pinnedItemsRemaining = pinnedItemsRemaining;
            return this;
        }

        public Builder setProjectsResourcePath(String projectsResourcePath) {
            this.projectsResourcePath = projectsResourcePath;
            return this;
        }

        public Builder setProjectsUrl(String projectsUrl) {
            this.projectsUrl = projectsUrl;
            return this;
        }

        public Builder setRequiresTwoFactorAuthentication(Boolean requiresTwoFactorAuthentication) {
            this.requiresTwoFactorAuthentication = requiresTwoFactorAuthentication;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setSamlIdentityProvider(OrganizationIdentityProviderTO samlIdentityProvider) {
            this.samlIdentityProvider = samlIdentityProvider;
            return this;
        }

        public Builder setTeamsResourcePath(String teamsResourcePath) {
            this.teamsResourcePath = teamsResourcePath;
            return this;
        }

        public Builder setTeamsUrl(String teamsUrl) {
            this.teamsUrl = teamsUrl;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setViewerCanAdminister(boolean viewerCanAdminister) {
            this.viewerCanAdminister = viewerCanAdminister;
            return this;
        }

        public Builder setViewerCanChangePinnedItems(boolean viewerCanChangePinnedItems) {
            this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
            return this;
        }

        public Builder setViewerCanCreateProjects(boolean viewerCanCreateProjects) {
            this.viewerCanCreateProjects = viewerCanCreateProjects;
            return this;
        }

        public Builder setViewerCanCreateRepositories(boolean viewerCanCreateRepositories) {
            this.viewerCanCreateRepositories = viewerCanCreateRepositories;
            return this;
        }

        public Builder setViewerCanCreateTeams(boolean viewerCanCreateTeams) {
            this.viewerCanCreateTeams = viewerCanCreateTeams;
            return this;
        }

        public Builder setViewerIsAMember(boolean viewerIsAMember) {
            this.viewerIsAMember = viewerIsAMember;
            return this;
        }

        public Builder setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }


        public OrganizationTO build() {
            return new OrganizationTO(databaseId, description, email, id, isVerified, itemShowcase, location, login, name, newTeamResourcePath, newTeamUrl, organizationBillingEmail, pinnedItemsRemaining, projectsResourcePath, projectsUrl, requiresTwoFactorAuthentication, resourcePath, samlIdentityProvider, teamsResourcePath, teamsUrl, url, viewerCanAdminister, viewerCanChangePinnedItems, viewerCanCreateProjects, viewerCanCreateRepositories, viewerCanCreateTeams, viewerIsAMember, websiteUrl);
        }

    }
}
