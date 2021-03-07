package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateProjectColumnInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String projectColumnId;

    public UpdateProjectColumnInputTO() {
    }

    public UpdateProjectColumnInputTO(String clientMutationId, String name, String projectColumnId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.projectColumnId = projectColumnId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getName() {
        return name;
    }

    public String getProjectColumnId() {
        return projectColumnId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateProjectColumnInputTO that = (UpdateProjectColumnInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(name, that.name)
            && Objects.equals(projectColumnId, that.projectColumnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, name, projectColumnId);
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
        if (projectColumnId != null) {
            joiner.add("projectColumnId: " + GraphQLRequestSerializer.getEntry(projectColumnId));
        }
        return joiner.toString();
    }

    public static UpdateProjectColumnInputTO.Builder builder() {
        return new UpdateProjectColumnInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String name;
        private String projectColumnId;

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

        public Builder setProjectColumnId(String projectColumnId) {
            this.projectColumnId = projectColumnId;
            return this;
        }


        public UpdateProjectColumnInputTO build() {
            return new UpdateProjectColumnInputTO(clientMutationId, name, projectColumnId);
        }

    }
}
