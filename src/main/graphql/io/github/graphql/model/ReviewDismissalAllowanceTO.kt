package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReviewDismissalAllowanceTO(
    val actor: ReviewDismissalAllowanceActorTO?,
    val branchProtectionRule: BranchProtectionRuleTO?,
    override
    val id: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        if (branchProtectionRule != null) {
            joiner.add("branchProtectionRule: " + GraphQLRequestSerializer.getEntry(branchProtectionRule))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        return joiner.toString()
    }
}
