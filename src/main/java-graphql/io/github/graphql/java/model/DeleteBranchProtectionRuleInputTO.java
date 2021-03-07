package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeleteBranchProtectionRuleInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String branchProtectionRuleId;
    private String clientMutationId;

    public DeleteBranchProtectionRuleInputTO() {
    }

    public DeleteBranchProtectionRuleInputTO(String branchProtectionRuleId, String clientMutationId) {
        this.branchProtectionRuleId = branchProtectionRuleId;
        this.clientMutationId = clientMutationId;
    }

    public String getBranchProtectionRuleId() {
        return branchProtectionRuleId;
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
        final DeleteBranchProtectionRuleInputTO that = (DeleteBranchProtectionRuleInputTO) obj;
        return Objects.equals(branchProtectionRuleId, that.branchProtectionRuleId)
            && Objects.equals(clientMutationId, that.clientMutationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchProtectionRuleId, clientMutationId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (branchProtectionRuleId != null) {
            joiner.add("branchProtectionRuleId: " + GraphQLRequestSerializer.getEntry(branchProtectionRuleId));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        return joiner.toString();
    }

    public static DeleteBranchProtectionRuleInputTO.Builder builder() {
        return new DeleteBranchProtectionRuleInputTO.Builder();
    }

    public static class Builder {

        private String branchProtectionRuleId;
        private String clientMutationId;

        public Builder() {
        }

        public Builder setBranchProtectionRuleId(String branchProtectionRuleId) {
            this.branchProtectionRuleId = branchProtectionRuleId;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }


        public DeleteBranchProtectionRuleInputTO build() {
            return new DeleteBranchProtectionRuleInputTO(branchProtectionRuleId, clientMutationId);
        }

    }
}
