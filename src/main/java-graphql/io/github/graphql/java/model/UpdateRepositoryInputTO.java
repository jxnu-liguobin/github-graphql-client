package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateRepositoryInputTO implements java.io.Serializable {

    private String clientMutationId;
    private String description;
    private Boolean hasIssuesEnabled;
    private Boolean hasProjectsEnabled;
    private Boolean hasWikiEnabled;
    private String homepageUrl;
    private String name;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    private Boolean template;

    public UpdateRepositoryInputTO() {
    }

    public UpdateRepositoryInputTO(String clientMutationId, String description, Boolean hasIssuesEnabled, Boolean hasProjectsEnabled, Boolean hasWikiEnabled, String homepageUrl, String name, String repositoryId, Boolean template) {
        this.clientMutationId = clientMutationId;
        this.description = description;
        this.hasIssuesEnabled = hasIssuesEnabled;
        this.hasProjectsEnabled = hasProjectsEnabled;
        this.hasWikiEnabled = hasWikiEnabled;
        this.homepageUrl = homepageUrl;
        this.name = name;
        this.repositoryId = repositoryId;
        this.template = template;
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

    public Boolean getHasProjectsEnabled() {
        return hasProjectsEnabled;
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

    public String getRepositoryId() {
        return repositoryId;
    }

    public Boolean getTemplate() {
        return template;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateRepositoryInputTO that = (UpdateRepositoryInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(description, that.description)
            && Objects.equals(hasIssuesEnabled, that.hasIssuesEnabled)
            && Objects.equals(hasProjectsEnabled, that.hasProjectsEnabled)
            && Objects.equals(hasWikiEnabled, that.hasWikiEnabled)
            && Objects.equals(homepageUrl, that.homepageUrl)
            && Objects.equals(name, that.name)
            && Objects.equals(repositoryId, that.repositoryId)
            && Objects.equals(template, that.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, description, hasIssuesEnabled, hasProjectsEnabled, hasWikiEnabled, homepageUrl, name, repositoryId, template);
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
        if (hasProjectsEnabled != null) {
            joiner.add("hasProjectsEnabled: " + GraphQLRequestSerializer.getEntry(hasProjectsEnabled));
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
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template));
        }
        return joiner.toString();
    }

    public static UpdateRepositoryInputTO.Builder builder() {
        return new UpdateRepositoryInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String description;
        private Boolean hasIssuesEnabled;
        private Boolean hasProjectsEnabled;
        private Boolean hasWikiEnabled;
        private String homepageUrl;
        private String name;
        private String repositoryId;
        private Boolean template;

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

        public Builder setHasProjectsEnabled(Boolean hasProjectsEnabled) {
            this.hasProjectsEnabled = hasProjectsEnabled;
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

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        public Builder setTemplate(Boolean template) {
            this.template = template;
            return this;
        }


        public UpdateRepositoryInputTO build() {
            return new UpdateRepositoryInputTO(clientMutationId, description, hasIssuesEnabled, hasProjectsEnabled, hasWikiEnabled, homepageUrl, name, repositoryId, template);
        }

    }
}
