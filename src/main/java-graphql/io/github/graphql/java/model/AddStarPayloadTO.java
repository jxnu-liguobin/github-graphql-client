package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddStarPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private StarrableTO starrable;

    public AddStarPayloadTO() {
    }

    public AddStarPayloadTO(String clientMutationId, StarrableTO starrable) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AddStarPayloadTO that = (AddStarPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(starrable, that.starrable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, starrable);
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

    public static AddStarPayloadTO.Builder builder() {
        return new AddStarPayloadTO.Builder();
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


        public AddStarPayloadTO build() {
            return new AddStarPayloadTO(clientMutationId, starrable);
        }

    }
}
