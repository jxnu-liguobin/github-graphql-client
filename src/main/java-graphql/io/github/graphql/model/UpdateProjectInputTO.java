package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateProjectInputTO implements java.io.Serializable {

    private String body;
    private String clientMutationId;
    private String name;
    @javax.validation.constraints.NotNull
    private String projectId;
    private Boolean Public;
    private ProjectStateTO state;

    public UpdateProjectInputTO() {
    }

    public UpdateProjectInputTO(String body, String clientMutationId, String name, String projectId, Boolean Public, ProjectStateTO state) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.projectId = projectId;
        this.Public = Public;
        this.state = state;
    }

    public String getBody() {
        return body;
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

    public Boolean getPublic() {
        return Public;
    }

    public ProjectStateTO getState() {
        return state;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (Public != null) {
            joiner.add("public: " + GraphQLRequestSerializer.getEntry(Public));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        return joiner.toString();
    }

    public static UpdateProjectInputTO.Builder builder() {
        return new UpdateProjectInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private String name;
        private String projectId;
        private Boolean Public;
        private ProjectStateTO state;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
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

        public Builder setPublic(Boolean Public) {
            this.Public = Public;
            return this;
        }

        public Builder setState(ProjectStateTO state) {
            this.state = state;
            return this;
        }


        public UpdateProjectInputTO build() {
            return new UpdateProjectInputTO(body, clientMutationId, name, projectId, Public, state);
        }

    }
}
