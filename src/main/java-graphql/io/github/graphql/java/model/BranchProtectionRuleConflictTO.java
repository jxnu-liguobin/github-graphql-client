package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BranchProtectionRuleConflictTO that = (BranchProtectionRuleConflictTO) obj;
        return Objects.equals(branchProtectionRule, that.branchProtectionRule)
            && Objects.equals(conflictingBranchProtectionRule, that.conflictingBranchProtectionRule)
            && Objects.equals(ref, that.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchProtectionRule, conflictingBranchProtectionRule, ref);
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
