package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreateRefPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private RefTO ref;

    public CreateRefPayloadTO() {
    }

    public CreateRefPayloadTO(String clientMutationId, RefTO ref) {
        this.clientMutationId = clientMutationId;
        this.ref = ref;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public RefTO getRef() {
        return ref;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref));
        }
        return joiner.toString();
    }

    public static CreateRefPayloadTO.Builder builder() {
        return new CreateRefPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private RefTO ref;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setRef(RefTO ref) {
            this.ref = ref;
            return this;
        }


        public CreateRefPayloadTO build() {
            return new CreateRefPayloadTO(clientMutationId, ref);
        }

    }
}
