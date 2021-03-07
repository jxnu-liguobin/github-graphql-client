package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnlinkRepositoryFromProjectInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public UnlinkRepositoryFromProjectInputTO() {
    }

    public UnlinkRepositoryFromProjectInputTO(String clientMutationId, String projectId, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.projectId = projectId;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        return joiner.toString();
    }

    public static UnlinkRepositoryFromProjectInputTO.Builder builder() {
        return new UnlinkRepositoryFromProjectInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String projectId;
        private String repositoryId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }


        public UnlinkRepositoryFromProjectInputTO build() {
            return new UnlinkRepositoryFromProjectInputTO(clientMutationId, projectId, repositoryId);
        }

    }
}
