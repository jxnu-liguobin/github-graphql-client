package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class BranchProtectionRuleConflictTO implements java.io.Serializable {

    private BranchProtectionRuleTO branchProtectionRule;
    private BranchProtectionRuleTO conflictingBranchProtectionRule;
    private RefTO ref;

    public BranchProtectionRuleConflictTO() {
    }

    public BranchProtectionRuleConflictTO(BranchProtectionRuleTO branchProtectionRule, BranchProtectionRuleTO conflictingBranchProtectionRule, RefTO ref) {
        this.branchProtectionRule = branchProtectionRule;
        this.conflictingBranchProtectionRule = conflictingBranchProtectionRule;
        this.ref = ref;
    }

    public BranchProtectionRuleTO getBranchProtectionRule() {
        return branchProtectionRule;
    }

    public BranchProtectionRuleTO getConflictingBranchProtectionRule() {
        return conflictingBranchProtectionRule;
    }

    public RefTO getRef() {
        return ref;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (branchProtectionRule != null) {
            joiner.add("branchProtectionRule: " + GraphQLRequestSerializer.getEntry(branchProtectionRule));
        }
        if (conflictingBranchProtectionRule != null) {
            joiner.add("conflictingBranchProtectionRule: " + GraphQLRequestSerializer.getEntry(conflictingBranchProtectionRule));
        }
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref));
        }
        return joiner.toString();
    }

    public static BranchProtectionRuleConflictTO.Builder builder() {
        return new BranchProtectionRuleConflictTO.Builder();
    }

    public static class Builder {

        private BranchProtectionRuleTO branchProtectionRule;
        private BranchProtectionRuleTO conflictingBranchProtectionRule;
        private RefTO ref;

        public Builder() {
        }

        public Builder setBranchProtectionRule(BranchProtectionRuleTO branchProtectionRule) {
            this.branchProtectionRule = branchProtectionRule;
            return this;
        }

        public Builder setConflictingBranchProtectionRule(BranchProtectionRuleTO conflictingBranchProtectionRule) {
            this.conflictingBranchProtectionRule = conflictingBranchProtectionRule;
            return this;
        }

        public Builder setRef(RefTO ref) {
            this.ref = ref;
            return this;
        }


        public BranchProtectionRuleConflictTO build() {
            return new BranchProtectionRuleConflictTO(branchProtectionRule, conflictingBranchProtectionRule, ref);
        }

    }
}
