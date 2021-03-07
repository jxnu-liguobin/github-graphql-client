package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateSubscriptionInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private SubscriptionStateTO state;
    @javax.validation.constraints.NotNull
    private String subscribableId;

    public UpdateSubscriptionInputTO() {
    }

    public UpdateSubscriptionInputTO(String clientMutationId, SubscriptionStateTO state, String subscribableId) {
        this.clientMutationId = clientMutationId;
        this.state = state;
        this.subscribableId = subscribableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public SubscriptionStateTO getState() {
        return state;
    }

    public String getSubscribableId() {
        return subscribableId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (subscribableId != null) {
            joiner.add("subscribableId: " + GraphQLRequestSerializer.getEntry(subscribableId));
        }
        return joiner.toString();
    }

    public static UpdateSubscriptionInputTO.Builder builder() {
        return new UpdateSubscriptionInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private SubscriptionStateTO state;
        private String subscribableId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setState(SubscriptionStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setSubscribableId(String subscribableId) {
            this.subscribableId = subscribableId;
            return this;
        }


        public UpdateSubscriptionInputTO build() {
            return new UpdateSubscriptionInputTO(clientMutationId, state, subscribableId);
        }

    }
}
