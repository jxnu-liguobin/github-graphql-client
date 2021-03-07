package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReviewDismissalAllowanceTO(
    val actor: ReviewDismissalAllowanceActorTO?,
    val branchProtectionRule: BranchProtectionRuleTO?,
    override
    val id: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

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

    class Builder {

        private var actor: ReviewDismissalAllowanceActorTO? = null
        private var branchProtectionRule: BranchProtectionRuleTO? = null
        private lateinit var id: String

        fun setActor(actor: ReviewDismissalAllowanceActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setBranchProtectionRule(branchProtectionRule: BranchProtectionRuleTO?): Builder {
            this.branchProtectionRule = branchProtectionRule
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun build(): ReviewDismissalAllowanceTO {
            return ReviewDismissalAllowanceTO(actor, branchProtectionRule, id)
        }
    }
}
