package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class MoveProjectColumnPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ProjectColumnEdgeTO columnEdge;

    public MoveProjectColumnPayloadTO() {
    }

    public MoveProjectColumnPayloadTO(String clientMutationId, ProjectColumnEdgeTO columnEdge) {
        this.clientMutationId = clientMutationId;
        this.columnEdge = columnEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ProjectColumnEdgeTO getColumnEdge() {
        return columnEdge;
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
        return joiner.toString();
    }

    public static MoveProjectColumnPayloadTO.Builder builder() {
        return new MoveProjectColumnPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ProjectColumnEdgeTO columnEdge;

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


        public MoveProjectColumnPayloadTO build() {
            return new MoveProjectColumnPayloadTO(clientMutationId, columnEdge);
        }

    }
}
