package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeleteBranchProtectionRulePayloadTO implements java.io.Serializable {

    private String clientMutationId;

    public DeleteBranchProtectionRulePayloadTO() {
    }

    public DeleteBranchProtectionRulePayloadTO(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeleteBranchProtectionRulePayloadTO that = (DeleteBranchProtectionRulePayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        return joiner.toString();
    }

    public static DeleteBranchProtectionRulePayloadTO.Builder builder() {
        return new DeleteBranchProtectionRulePayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }


        public DeleteBranchProtectionRulePayloadTO build() {
            return new DeleteBranchProtectionRulePayloadTO(clientMutationId);
        }

    }
}
