package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateBranchProtectionRulePayloadTO implements java.io.Serializable {

    private BranchProtectionRuleTO branchProtectionRule;
    private String clientMutationId;

    public UpdateBranchProtectionRulePayloadTO() {
    }

    public UpdateBranchProtectionRulePayloadTO(BranchProtectionRuleTO branchProtectionRule, String clientMutationId) {
        this.branchProtectionRule = branchProtectionRule;
        this.clientMutationId = clientMutationId;
    }

    public BranchProtectionRuleTO getBranchProtectionRule() {
        return branchProtectionRule;
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
        final UpdateBranchProtectionRulePayloadTO that = (UpdateBranchProtectionRulePayloadTO) obj;
        return Objects.equals(branchProtectionRule, that.branchProtectionRule)
            && Objects.equals(clientMutationId, that.clientMutationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchProtectionRule, clientMutationId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (branchProtectionRule != null) {
            joiner.add("branchProtectionRule: " + GraphQLRequestSerializer.getEntry(branchProtectionRule));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        return joiner.toString();
    }

    public static UpdateBranchProtectionRulePayloadTO.Builder builder() {
        return new UpdateBranchProtectionRulePayloadTO.Builder();
    }

    public static class Builder {

        private BranchProtectionRuleTO branchProtectionRule;
        private String clientMutationId;

        public Builder() {
        }

        public Builder setBranchProtectionRule(BranchProtectionRuleTO branchProtectionRule) {
            this.branchProtectionRule = branchProtectionRule;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }


        public UpdateBranchProtectionRulePayloadTO build() {
            return new UpdateBranchProtectionRulePayloadTO(branchProtectionRule, clientMutationId);
        }

    }
}
