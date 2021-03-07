package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class TeamTO implements java.io.Serializable, ReviewDismissalAllowanceActorTO, RequestedReviewerTO, PushAllowanceActorTO, PermissionGranterTO, SubscribableTO, NodeTO, MemberStatusableTO {

    @javax.validation.constraints.NotNull
    private String combinedSlug;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private String description;
    @javax.validation.constraints.NotNull
    private String editTeamResourcePath;
    @javax.validation.constraints.NotNull
    private String editTeamUrl;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String membersResourcePath;
    @javax.validation.constraints.NotNull
    private String membersUrl;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String newTeamResourcePath;
    @javax.validation.constraints.NotNull
    private String newTeamUrl;
    @javax.validation.constraints.NotNull
    private OrganizationTO organization;
    private TeamTO parentTeam;
    @javax.validation.constraints.NotNull
    private TeamPrivacyTO privacy;
    @javax.validation.constraints.NotNull
    private String repositoriesResourcePath;
    @javax.validation.constraints.NotNull
    private String repositoriesUrl;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String slug;
    @javax.validation.constraints.NotNull
    private String teamsResourcePath;
    @javax.validation.constraints.NotNull
    private String teamsUrl;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanAdminister;
    private boolean viewerCanSubscribe;
    private SubscriptionStateTO viewerSubscription;

    public TeamTO() {
    }

    public TeamTO(String combinedSlug, String createdAt, String description, String editTeamResourcePath, String editTeamUrl, String id, String membersResourcePath, String membersUrl, String name, String newTeamResourcePath, String newTeamUrl, OrganizationTO organization, TeamTO parentTeam, TeamPrivacyTO privacy, String repositoriesResourcePath, String repositoriesUrl, String resourcePath, String slug, String teamsResourcePath, String teamsUrl, String updatedAt, String url, boolean viewerCanAdminister, boolean viewerCanSubscribe, SubscriptionStateTO viewerSubscription) {
        this.combinedSlug = combinedSlug;
        this.createdAt = createdAt;
        this.description = description;
        this.editTeamResourcePath = editTeamResourcePath;
        this.editTeamUrl = editTeamUrl;
        this.id = id;
        this.membersResourcePath = membersResourcePath;
        this.membersUrl = membersUrl;
        this.name = name;
        this.newTeamResourcePath = newTeamResourcePath;
        this.newTeamUrl = newTeamUrl;
        this.organization = organization;
        this.parentTeam = parentTeam;
        this.privacy = privacy;
        this.repositoriesResourcePath = repositoriesResourcePath;
        this.repositoriesUrl = repositoriesUrl;
        this.resourcePath = resourcePath;
        this.slug = slug;
        this.teamsResourcePath = teamsResourcePath;
        this.teamsUrl = teamsUrl;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanAdminister = viewerCanAdminister;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerSubscription = viewerSubscription;
    }

    public String getCombinedSlug() {
        return combinedSlug;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDescription() {
        return description;
    }

    public String getEditTeamResourcePath() {
        return editTeamResourcePath;
    }

    public String getEditTeamUrl() {
        return editTeamUrl;
    }

    public String getId() {
        return id;
    }

    public String getMembersResourcePath() {
        return membersResourcePath;
    }

    public String getMembersUrl() {
        return membersUrl;
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

    public OrganizationTO getOrganization() {
        return organization;
    }

    public TeamTO getParentTeam() {
        return parentTeam;
    }

    public TeamPrivacyTO getPrivacy() {
        return privacy;
    }

    public String getRepositoriesResourcePath() {
        return repositoriesResourcePath;
    }

    public String getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public String getSlug() {
        return slug;
    }

    public String getTeamsResourcePath() {
        return teamsResourcePath;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public boolean getViewerCanAdminister() {
        return viewerCanAdminister;
    }

    public boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }

    public SubscriptionStateTO getViewerSubscription() {
        return viewerSubscription;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (combinedSlug != null) {
            joiner.add("combinedSlug: " + GraphQLRequestSerializer.getEntry(combinedSlug));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (editTeamResourcePath != null) {
            joiner.add("editTeamResourcePath: " + GraphQLRequestSerializer.getEntry(editTeamResourcePath));
        }
        if (editTeamUrl != null) {
            joiner.add("editTeamUrl: " + GraphQLRequestSerializer.getEntry(editTeamUrl));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (membersResourcePath != null) {
            joiner.add("membersResourcePath: " + GraphQLRequestSerializer.getEntry(membersResourcePath));
        }
        if (membersUrl != null) {
            joiner.add("membersUrl: " + GraphQLRequestSerializer.getEntry(membersUrl));
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
        if (organization != null) {
            joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization));
        }
        if (parentTeam != null) {
            joiner.add("parentTeam: " + GraphQLRequestSerializer.getEntry(parentTeam));
        }
        if (privacy != null) {
            joiner.add("privacy: " + GraphQLRequestSerializer.getEntry(privacy));
        }
        if (repositoriesResourcePath != null) {
            joiner.add("repositoriesResourcePath: " + GraphQLRequestSerializer.getEntry(repositoriesResourcePath));
        }
        if (repositoriesUrl != null) {
            joiner.add("repositoriesUrl: " + GraphQLRequestSerializer.getEntry(repositoriesUrl));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (slug != null) {
            joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug));
        }
        if (teamsResourcePath != null) {
            joiner.add("teamsResourcePath: " + GraphQLRequestSerializer.getEntry(teamsResourcePath));
        }
        if (teamsUrl != null) {
            joiner.add("teamsUrl: " + GraphQLRequestSerializer.getEntry(teamsUrl));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("viewerCanAdminister: " + GraphQLRequestSerializer.getEntry(viewerCanAdminister));
        joiner.add("viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe));
        if (viewerSubscription != null) {
            joiner.add("viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription));
        }
        return joiner.toString();
    }

    public static TeamTO.Builder builder() {
        return new TeamTO.Builder();
    }

    public static class Builder {

        private String combinedSlug;
        private String createdAt;
        private String description;
        private String editTeamResourcePath;
        private String editTeamUrl;
        private String id;
        private String membersResourcePath;
        private String membersUrl;
        private String name;
        private String newTeamResourcePath;
        private String newTeamUrl;
        private OrganizationTO organization;
        private TeamTO parentTeam;
        private TeamPrivacyTO privacy;
        private String repositoriesResourcePath;
        private String repositoriesUrl;
        private String resourcePath;
        private String slug;
        private String teamsResourcePath;
        private String teamsUrl;
        private String updatedAt;
        private String url;
        private boolean viewerCanAdminister;
        private boolean viewerCanSubscribe;
        private SubscriptionStateTO viewerSubscription;

        public Builder() {
        }

        public Builder setCombinedSlug(String combinedSlug) {
            this.combinedSlug = combinedSlug;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setEditTeamResourcePath(String editTeamResourcePath) {
            this.editTeamResourcePath = editTeamResourcePath;
            return this;
        }

        public Builder setEditTeamUrl(String editTeamUrl) {
            this.editTeamUrl = editTeamUrl;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setMembersResourcePath(String membersResourcePath) {
            this.membersResourcePath = membersResourcePath;
            return this;
        }

        public Builder setMembersUrl(String membersUrl) {
            this.membersUrl = membersUrl;
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

        public Builder setOrganization(OrganizationTO organization) {
            this.organization = organization;
            return this;
        }

        public Builder setParentTeam(TeamTO parentTeam) {
            this.parentTeam = parentTeam;
            return this;
        }

        public Builder setPrivacy(TeamPrivacyTO privacy) {
            this.privacy = privacy;
            return this;
        }

        public Builder setRepositoriesResourcePath(String repositoriesResourcePath) {
            this.repositoriesResourcePath = repositoriesResourcePath;
            return this;
        }

        public Builder setRepositoriesUrl(String repositoriesUrl) {
            this.repositoriesUrl = repositoriesUrl;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setSlug(String slug) {
            this.slug = slug;
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

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
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

        public Builder setViewerCanSubscribe(boolean viewerCanSubscribe) {
            this.viewerCanSubscribe = viewerCanSubscribe;
            return this;
        }

        public Builder setViewerSubscription(SubscriptionStateTO viewerSubscription) {
            this.viewerSubscription = viewerSubscription;
            return this;
        }


        public TeamTO build() {
            return new TeamTO(combinedSlug, createdAt, description, editTeamResourcePath, editTeamUrl, id, membersResourcePath, membersUrl, name, newTeamResourcePath, newTeamUrl, organization, parentTeam, privacy, repositoriesResourcePath, repositoriesUrl, resourcePath, slug, teamsResourcePath, teamsUrl, updatedAt, url, viewerCanAdminister, viewerCanSubscribe, viewerSubscription);
        }

    }
}
