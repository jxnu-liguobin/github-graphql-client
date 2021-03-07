package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeleteRefInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String refId;

    public DeleteRefInputTO() {
    }

    public DeleteRefInputTO(String clientMutationId, String refId) {
        this.clientMutationId = clientMutationId;
        this.refId = refId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getRefId() {
        return refId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (refId != null) {
            joiner.add("refId: " + GraphQLRequestSerializer.getEntry(refId));
        }
        return joiner.toString();
    }

    public static DeleteRefInputTO.Builder builder() {
        return new DeleteRefInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String refId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setRefId(String refId) {
            this.refId = refId;
            return this;
        }


        public DeleteRefInputTO build() {
            return new DeleteRefInputTO(clientMutationId, refId);
        }

    }
}
