package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateRefPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private RefTO ref;

    public UpdateRefPayloadTO() {
    }

    public UpdateRefPayloadTO(String clientMutationId, RefTO ref) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateRefPayloadTO that = (UpdateRefPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(ref, that.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, ref);
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

    public static UpdateRefPayloadTO.Builder builder() {
        return new UpdateRefPayloadTO.Builder();
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


        public UpdateRefPayloadTO build() {
            return new UpdateRefPayloadTO(clientMutationId, ref);
        }

    }
}
