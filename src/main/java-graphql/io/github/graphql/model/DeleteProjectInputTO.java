package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeleteProjectInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String projectId;

    public DeleteProjectInputTO() {
    }

    public DeleteProjectInputTO(String clientMutationId, String projectId) {
        this.clientMutationId = clientMutationId;
        this.projectId = projectId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getProjectId() {
        return projectId;
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
        return joiner.toString();
    }

    public static DeleteProjectInputTO.Builder builder() {
        return new DeleteProjectInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String projectId;

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


        public DeleteProjectInputTO build() {
            return new DeleteProjectInputTO(clientMutationId, projectId);
        }

    }
}
