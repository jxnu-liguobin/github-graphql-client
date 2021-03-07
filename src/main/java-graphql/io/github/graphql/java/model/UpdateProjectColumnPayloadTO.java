package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateProjectColumnPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ProjectColumnTO projectColumn;

    public UpdateProjectColumnPayloadTO() {
    }

    public UpdateProjectColumnPayloadTO(String clientMutationId, ProjectColumnTO projectColumn) {
        this.clientMutationId = clientMutationId;
        this.projectColumn = projectColumn;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ProjectColumnTO getProjectColumn() {
        return projectColumn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateProjectColumnPayloadTO that = (UpdateProjectColumnPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(projectColumn, that.projectColumn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, projectColumn);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (projectColumn != null) {
            joiner.add("projectColumn: " + GraphQLRequestSerializer.getEntry(projectColumn));
        }
        return joiner.toString();
    }

    public static UpdateProjectColumnPayloadTO.Builder builder() {
        return new UpdateProjectColumnPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ProjectColumnTO projectColumn;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setProjectColumn(ProjectColumnTO projectColumn) {
            this.projectColumn = projectColumn;
            return this;
        }


        public UpdateProjectColumnPayloadTO build() {
            return new UpdateProjectColumnPayloadTO(clientMutationId, projectColumn);
        }

    }
}
