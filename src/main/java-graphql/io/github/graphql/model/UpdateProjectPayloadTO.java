package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdateProjectPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ProjectTO project;

    public UpdateProjectPayloadTO() {
    }

    public UpdateProjectPayloadTO(String clientMutationId, ProjectTO project) {
        this.clientMutationId = clientMutationId;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ProjectTO getProject() {
        return project;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        return joiner.toString();
    }

    public static UpdateProjectPayloadTO.Builder builder() {
        return new UpdateProjectPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ProjectTO project;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setProject(ProjectTO project) {
            this.project = project;
            return this;
        }


        public UpdateProjectPayloadTO build() {
            return new UpdateProjectPayloadTO(clientMutationId, project);
        }

    }
}
