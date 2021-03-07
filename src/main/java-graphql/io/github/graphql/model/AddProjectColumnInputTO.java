package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddProjectColumnInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String projectId;

    public AddProjectColumnInputTO() {
    }

    public AddProjectColumnInputTO(String clientMutationId, String name, String projectId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.projectId = projectId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getName() {
        return name;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        return joiner.toString();
    }

    public static AddProjectColumnInputTO.Builder builder() {
        return new AddProjectColumnInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String name;
        private String projectId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }


        public AddProjectColumnInputTO build() {
            return new AddProjectColumnInputTO(clientMutationId, name, projectId);
        }

    }
}
