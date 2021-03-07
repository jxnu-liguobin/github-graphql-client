package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateSubscriptionPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private SubscribableTO subscribable;

    public UpdateSubscriptionPayloadTO() {
    }

    public UpdateSubscriptionPayloadTO(String clientMutationId, SubscribableTO subscribable) {
        this.clientMutationId = clientMutationId;
        this.subscribable = subscribable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public SubscribableTO getSubscribable() {
        return subscribable;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (subscribable != null) {
            joiner.add("subscribable: " + GraphQLRequestSerializer.getEntry(subscribable));
        }
        return joiner.toString();
    }

    public static UpdateSubscriptionPayloadTO.Builder builder() {
        return new UpdateSubscriptionPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private SubscribableTO subscribable;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setSubscribable(SubscribableTO subscribable) {
            this.subscribable = subscribable;
            return this;
        }


        public UpdateSubscriptionPayloadTO build() {
            return new UpdateSubscriptionPayloadTO(clientMutationId, subscribable);
        }

    }
}
