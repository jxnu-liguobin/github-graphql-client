package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeleteProjectCardInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cardId;
    private String clientMutationId;

    public DeleteProjectCardInputTO() {
    }

    public DeleteProjectCardInputTO(String cardId, String clientMutationId) {
        this.cardId = cardId;
        this.clientMutationId = clientMutationId;
    }

    public String getCardId() {
        return cardId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cardId != null) {
            joiner.add("cardId: " + GraphQLRequestSerializer.getEntry(cardId));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        return joiner.toString();
    }

    public static DeleteProjectCardInputTO.Builder builder() {
        return new DeleteProjectCardInputTO.Builder();
    }

    public static class Builder {

        private String cardId;
        private String clientMutationId;

        public Builder() {
        }

        public Builder setCardId(String cardId) {
            this.cardId = cardId;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }


        public DeleteProjectCardInputTO build() {
            return new DeleteProjectCardInputTO(cardId, clientMutationId);
        }

    }
}
