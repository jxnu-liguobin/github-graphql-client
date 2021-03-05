package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class BranchProtectionRuleConflictTO(
    val branchProtectionRule: BranchProtectionRuleTO?,
    val conflictingBranchProtectionRule: BranchProtectionRuleTO?,
    val ref: RefTO?
) {

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
}
