package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateBranchProtectionRulePayloadTO(
    val branchProtectionRule: BranchProtectionRuleTO?,
    val clientMutationId: String?
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
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        return joiner.toString()
    }

    class Builder {

        private var branchProtectionRule: BranchProtectionRuleTO? = null
        private var clientMutationId: String? = null

        fun setBranchProtectionRule(branchProtectionRule: BranchProtectionRuleTO?): Builder {
            this.branchProtectionRule = branchProtectionRule
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun build(): UpdateBranchProtectionRulePayloadTO {
            return UpdateBranchProtectionRulePayloadTO(branchProtectionRule, clientMutationId)
        }
    }
}
