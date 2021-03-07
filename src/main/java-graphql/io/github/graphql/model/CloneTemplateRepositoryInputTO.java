package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CloneTemplateRepositoryInputTO implements java.io.Serializable {

    private String clientMutationId;
    private String description;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String ownerId;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    @javax.validation.constraints.NotNull
    private RepositoryVisibilityTO visibility;

    public CloneTemplateRepositoryInputTO() {
    }

    public CloneTemplateRepositoryInputTO(String clientMutationId, String description, String name, String ownerId, String repositoryId, RepositoryVisibilityTO visibility) {
        this.clientMutationId = clientMutationId;
        this.description = description;
        this.name = name;
        this.ownerId = ownerId;
        this.repositoryId = repositoryId;
        this.visibility = visibility;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getRepositoryId() {
        return repositoryId;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        if (visibility != null) {
            joiner.add("visibility: " + GraphQLRequestSerializer.getEntry(visibility));
        }
        return joiner.toString();
    }

    public static CloneTemplateRepositoryInputTO.Builder builder() {
        return new CloneTemplateRepositoryInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String description;
        private String name;
        private String ownerId;
        private String repositoryId;
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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        public Builder setVisibility(RepositoryVisibilityTO visibility) {
            this.visibility = visibility;
            return this;
        }


        public CloneTemplateRepositoryInputTO build() {
            return new CloneTemplateRepositoryInputTO(clientMutationId, description, name, ownerId, repositoryId, visibility);
        }

    }
}
