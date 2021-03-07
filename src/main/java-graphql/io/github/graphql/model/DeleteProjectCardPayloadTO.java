package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeleteProjectCardPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ProjectColumnTO column;
    private String deletedCardId;

    public DeleteProjectCardPayloadTO() {
    }

    public DeleteProjectCardPayloadTO(String clientMutationId, ProjectColumnTO column, String deletedCardId) {
        this.clientMutationId = clientMutationId;
        this.column = column;
        this.deletedCardId = deletedCardId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ProjectColumnTO getColumn() {
        return column;
    }

    public String getDeletedCardId() {
        return deletedCardId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (column != null) {
            joiner.add("column: " + GraphQLRequestSerializer.getEntry(column));
        }
        if (deletedCardId != null) {
            joiner.add("deletedCardId: " + GraphQLRequestSerializer.getEntry(deletedCardId));
        }
        return joiner.toString();
    }

    public static DeleteProjectCardPayloadTO.Builder builder() {
        return new DeleteProjectCardPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ProjectColumnTO column;
        private String deletedCardId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setColumn(ProjectColumnTO column) {
            this.column = column;
            return this;
        }

        public Builder setDeletedCardId(String deletedCardId) {
            this.deletedCardId = deletedCardId;
            return this;
        }


        public DeleteProjectCardPayloadTO build() {
            return new DeleteProjectCardPayloadTO(clientMutationId, column, deletedCardId);
        }

    }
}
