package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreateRepositoryInputTO implements java.io.Serializable {

    private String clientMutationId;
    private String description;
    private Boolean hasIssuesEnabled = true;
    private Boolean hasWikiEnabled = false;
    private String homepageUrl;
    @javax.validation.constraints.NotNull
    private String name;
    private String ownerId;
    private String teamId;
    private Boolean template = false;
    @javax.validation.constraints.NotNull
    private RepositoryVisibilityTO visibility;

    public CreateRepositoryInputTO() {
    }

    public CreateRepositoryInputTO(String clientMutationId, String description, Boolean hasIssuesEnabled, Boolean hasWikiEnabled, String homepageUrl, String name, String ownerId, String teamId, Boolean template, RepositoryVisibilityTO visibility) {
        this.clientMutationId = clientMutationId;
        this.description = description;
        this.hasIssuesEnabled = hasIssuesEnabled;
        this.hasWikiEnabled = hasWikiEnabled;
        this.homepageUrl = homepageUrl;
        this.name = name;
        this.ownerId = ownerId;
        this.teamId = teamId;
        this.template = template;
        this.visibility = visibility;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getHasIssuesEnabled() {
        return hasIssuesEnabled;
    }

    public Boolean getHasWikiEnabled() {
        return hasWikiEnabled;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public String getName() {
        return name;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getTeamId() {
        return teamId;
    }

    public Boolean getTemplate() {
        return template;
    }

    public RepositoryVisibilityTO getVisibility() {
        return visibility;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (hasIssuesEnabled != null) {
            joiner.add("hasIssuesEnabled: " + GraphQLRequestSerializer.getEntry(hasIssuesEnabled));
        }
        if (hasWikiEnabled != null) {
            joiner.add("hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled));
        }
        if (homepageUrl != null) {
            joiner.add("homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        if (teamId != null) {
            joiner.add("teamId: " + GraphQLRequestSerializer.getEntry(teamId));
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template));
        }
        if (visibility != null) {
            joiner.add("visibility: " + GraphQLRequestSerializer.getEntry(visibility));
        }
        return joiner.toString();
    }

    public static CreateRepositoryInputTO.Builder builder() {
        return new CreateRepositoryInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String description;
        private Boolean hasIssuesEnabled = true;
        private Boolean hasWikiEnabled = false;
        private String homepageUrl;
        private String name;
        private String ownerId;
        private String teamId;
        private Boolean template = false;
        private RepositoryVisibilityTO visibility;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setHasIssuesEnabled(Boolean hasIssuesEnabled) {
            this.hasIssuesEnabled = hasIssuesEnabled;
            return this;
        }

        public Builder setHasWikiEnabled(Boolean hasWikiEnabled) {
            this.hasWikiEnabled = hasWikiEnabled;
            return this;
        }

        public Builder setHomepageUrl(String homepageUrl) {
            this.homepageUrl = homepageUrl;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public Builder setTemplate(Boolean template) {
            this.template = template;
            return this;
        }

        public Builder setVisibility(RepositoryVisibilityTO visibility) {
            this.visibility = visibility;
            return this;
        }


        public CreateRepositoryInputTO build() {
            return new CreateRepositoryInputTO(clientMutationId, description, hasIssuesEnabled, hasWikiEnabled, homepageUrl, name, ownerId, teamId, template, visibility);
        }

    }
}
