package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeleteProjectColumnPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private String deletedColumnId;
    private ProjectTO project;

    public DeleteProjectColumnPayloadTO() {
    }

    public DeleteProjectColumnPayloadTO(String clientMutationId, String deletedColumnId, ProjectTO project) {
        this.clientMutationId = clientMutationId;
        this.deletedColumnId = deletedColumnId;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getDeletedColumnId() {
        return deletedColumnId;
    }

    public ProjectTO getProject() {
        return project;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeleteProjectColumnPayloadTO that = (DeleteProjectColumnPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(deletedColumnId, that.deletedColumnId)
            && Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, deletedColumnId, project);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (deletedColumnId != null) {
            joiner.add("deletedColumnId: " + GraphQLRequestSerializer.getEntry(deletedColumnId));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        return joiner.toString();
    }

    public static DeleteProjectColumnPayloadTO.Builder builder() {
        return new DeleteProjectColumnPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String deletedColumnId;
        private ProjectTO project;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setDeletedColumnId(String deletedColumnId) {
            this.deletedColumnId = deletedColumnId;
            return this;
        }

        public Builder setProject(ProjectTO project) {
            this.project = project;
            return this;
        }


        public DeleteProjectColumnPayloadTO build() {
            return new DeleteProjectColumnPayloadTO(clientMutationId, deletedColumnId, project);
        }

    }
}
