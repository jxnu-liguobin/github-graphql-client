package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeleteProjectColumnInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String columnId;

    public DeleteProjectColumnInputTO() {
    }

    public DeleteProjectColumnInputTO(String clientMutationId, String columnId) {
        this.clientMutationId = clientMutationId;
        this.columnId = columnId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getColumnId() {
        return columnId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeleteProjectColumnInputTO that = (DeleteProjectColumnInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(columnId, that.columnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, columnId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (columnId != null) {
            joiner.add("columnId: " + GraphQLRequestSerializer.getEntry(columnId));
        }
        return joiner.toString();
    }

    public static DeleteProjectColumnInputTO.Builder builder() {
        return new DeleteProjectColumnInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String columnId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setColumnId(String columnId) {
            this.columnId = columnId;
            return this;
        }


        public DeleteProjectColumnInputTO build() {
            return new DeleteProjectColumnInputTO(clientMutationId, columnId);
        }

    }
}
