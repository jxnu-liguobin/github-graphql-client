package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
