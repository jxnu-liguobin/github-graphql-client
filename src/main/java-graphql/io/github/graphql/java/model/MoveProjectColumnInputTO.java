package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MoveProjectColumnInputTO implements java.io.Serializable {

    private String afterColumnId;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String columnId;

    public MoveProjectColumnInputTO() {
    }

    public MoveProjectColumnInputTO(String afterColumnId, String clientMutationId, String columnId) {
        this.afterColumnId = afterColumnId;
        this.clientMutationId = clientMutationId;
        this.columnId = columnId;
    }

    public String getAfterColumnId() {
        return afterColumnId;
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
        final MoveProjectColumnInputTO that = (MoveProjectColumnInputTO) obj;
        return Objects.equals(afterColumnId, that.afterColumnId)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(columnId, that.columnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(afterColumnId, clientMutationId, columnId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (afterColumnId != null) {
            joiner.add("afterColumnId: " + GraphQLRequestSerializer.getEntry(afterColumnId));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (columnId != null) {
            joiner.add("columnId: " + GraphQLRequestSerializer.getEntry(columnId));
        }
        return joiner.toString();
    }

    public static MoveProjectColumnInputTO.Builder builder() {
        return new MoveProjectColumnInputTO.Builder();
    }

    public static class Builder {

        private String afterColumnId;
        private String clientMutationId;
        private String columnId;

        public Builder() {
        }

        public Builder setAfterColumnId(String afterColumnId) {
            this.afterColumnId = afterColumnId;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setColumnId(String columnId) {
            this.columnId = columnId;
            return this;
        }


        public MoveProjectColumnInputTO build() {
            return new MoveProjectColumnInputTO(afterColumnId, clientMutationId, columnId);
        }

    }
}
