package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RemoveStarPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private StarrableTO starrable;

    public RemoveStarPayloadTO() {
    }

    public RemoveStarPayloadTO(String clientMutationId, StarrableTO starrable) {
        this.clientMutationId = clientMutationId;
        this.starrable = starrable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public StarrableTO getStarrable() {
        return starrable;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (starrable != null) {
            joiner.add("starrable: " + GraphQLRequestSerializer.getEntry(starrable));
        }
        return joiner.toString();
    }

    public static RemoveStarPayloadTO.Builder builder() {
        return new RemoveStarPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private StarrableTO starrable;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setStarrable(StarrableTO starrable) {
            this.starrable = starrable;
            return this;
        }


        public RemoveStarPayloadTO build() {
            return new RemoveStarPayloadTO(clientMutationId, starrable);
        }

    }
}
