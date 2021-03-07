package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateSubscriptionPayloadTO that = (UpdateSubscriptionPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(subscribable, that.subscribable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, subscribable);
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
