package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class BranchProtectionRuleConflictTO(
    val branchProtectionRule: BranchProtectionRuleTO?,
    val conflictingBranchProtectionRule: BranchProtectionRuleTO?,
    val ref: RefTO?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (branchProtectionRule != null) {
            joiner.add("branchProtectionRule: " + GraphQLRequestSerializer.getEntry(branchProtectionRule))
        }
        if (conflictingBranchProtectionRule != null) {
            joiner.add("conflictingBranchProtectionRule: " + GraphQLRequestSerializer.getEntry(conflictingBranchProtectionRule))
        }
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as BranchProtectionRuleConflictTO
        return Objects.equals(branchProtectionRule, that.branchProtectionRule)
                && Objects.equals(conflictingBranchProtectionRule, that.conflictingBranchProtectionRule)
                && Objects.equals(ref, that.ref)

    }

    override fun hashCode(): Int = {
        return Objects.hash(branchProtectionRule, conflictingBranchProtectionRule, ref)
    }

    class Builder {

        private var branchProtectionRule: BranchProtectionRuleTO? = null
        private var conflictingBranchProtectionRule: BranchProtectionRuleTO? = null
        private var ref: RefTO? = null

        fun setBranchProtectionRule(branchProtectionRule: BranchProtectionRuleTO?): Builder {
            this.branchProtectionRule = branchProtectionRule
            return this
        }

        fun setConflictingBranchProtectionRule(conflictingBranchProtectionRule: BranchProtectionRuleTO?): Builder {
            this.conflictingBranchProtectionRule = conflictingBranchProtectionRule
            return this
        }

        fun setRef(ref: RefTO?): Builder {
            this.ref = ref
            return this
        }

        fun build(): BranchProtectionRuleConflictTO {
            return BranchProtectionRuleConflictTO(branchProtectionRule, conflictingBranchProtectionRule, ref)
        }
    }
}
