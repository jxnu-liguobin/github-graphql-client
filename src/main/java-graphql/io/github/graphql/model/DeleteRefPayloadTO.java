package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeleteRefPayloadTO implements java.io.Serializable {

    private String clientMutationId;

    public DeleteRefPayloadTO() {
    }

    public DeleteRefPayloadTO(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        return joiner.toString();
    }

    public static DeleteRefPayloadTO.Builder builder() {
        return new DeleteRefPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }


        public DeleteRefPayloadTO build() {
            return new DeleteRefPayloadTO(clientMutationId);
        }

    }
}
