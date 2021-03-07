package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CreateBranchProtectionRulePayloadTO(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CreateBranchProtectionRulePayloadTO
        return Objects.equals(branchProtectionRule, that.branchProtectionRule)
                && Objects.equals(clientMutationId, that.clientMutationId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(branchProtectionRule, clientMutationId)
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

        fun build(): CreateBranchProtectionRulePayloadTO {
            return CreateBranchProtectionRulePayloadTO(branchProtectionRule, clientMutationId)
        }
    }
}
