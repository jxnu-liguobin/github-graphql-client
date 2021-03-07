package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class AddProjectColumnPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ProjectColumnEdgeTO columnEdge;
    private ProjectTO project;

    public AddProjectColumnPayloadTO() {
    }

    public AddProjectColumnPayloadTO(String clientMutationId, ProjectColumnEdgeTO columnEdge, ProjectTO project) {
        this.clientMutationId = clientMutationId;
        this.columnEdge = columnEdge;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ProjectColumnEdgeTO getColumnEdge() {
        return columnEdge;
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
        if (columnEdge != null) {
            joiner.add("columnEdge: " + GraphQLRequestSerializer.getEntry(columnEdge));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        return joiner.toString();
    }

    public static AddProjectColumnPayloadTO.Builder builder() {
        return new AddProjectColumnPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ProjectColumnEdgeTO columnEdge;
        private ProjectTO project;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setColumnEdge(ProjectColumnEdgeTO columnEdge) {
            this.columnEdge = columnEdge;
            return this;
        }

        public Builder setProject(ProjectTO project) {
            this.project = project;
            return this;
        }


        public AddProjectColumnPayloadTO build() {
            return new AddProjectColumnPayloadTO(clientMutationId, columnEdge, project);
        }

    }
}
