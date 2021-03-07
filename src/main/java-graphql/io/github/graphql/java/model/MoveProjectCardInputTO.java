package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MoveProjectCardInputTO implements java.io.Serializable {

    private String afterCardId;
    @javax.validation.constraints.NotNull
    private String cardId;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String columnId;

    public MoveProjectCardInputTO() {
    }

    public MoveProjectCardInputTO(String afterCardId, String cardId, String clientMutationId, String columnId) {
        this.afterCardId = afterCardId;
        this.cardId = cardId;
        this.clientMutationId = clientMutationId;
        this.columnId = columnId;
    }

    public String getAfterCardId() {
        return afterCardId;
    }

    public String getCardId() {
        return cardId;
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
        final MoveProjectCardInputTO that = (MoveProjectCardInputTO) obj;
        return Objects.equals(afterCardId, that.afterCardId)
            && Objects.equals(cardId, that.cardId)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(columnId, that.columnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(afterCardId, cardId, clientMutationId, columnId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (afterCardId != null) {
            joiner.add("afterCardId: " + GraphQLRequestSerializer.getEntry(afterCardId));
        }
        if (cardId != null) {
            joiner.add("cardId: " + GraphQLRequestSerializer.getEntry(cardId));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (columnId != null) {
            joiner.add("columnId: " + GraphQLRequestSerializer.getEntry(columnId));
        }
        return joiner.toString();
    }

    public static MoveProjectCardInputTO.Builder builder() {
        return new MoveProjectCardInputTO.Builder();
    }

    public static class Builder {

        private String afterCardId;
        private String cardId;
        private String clientMutationId;
        private String columnId;

        public Builder() {
        }

        public Builder setAfterCardId(String afterCardId) {
            this.afterCardId = afterCardId;
            return this;
        }

        public Builder setCardId(String cardId) {
            this.cardId = cardId;
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


        public MoveProjectCardInputTO build() {
            return new MoveProjectCardInputTO(afterCardId, cardId, clientMutationId, columnId);
        }

    }
}
