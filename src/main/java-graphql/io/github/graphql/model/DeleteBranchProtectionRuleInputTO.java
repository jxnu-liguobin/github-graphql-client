package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
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
