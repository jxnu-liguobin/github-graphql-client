package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class DeleteBranchProtectionRuleInputTO(
    val branchProtectionRuleId: String,
    val clientMutationId: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("branchProtectionRuleId: " + GraphQLRequestSerializer.getEntry(branchProtectionRuleId))
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
        val that = other as DeleteBranchProtectionRuleInputTO
        return Objects.equals(branchProtectionRuleId, that.branchProtectionRuleId)
                && Objects.equals(clientMutationId, that.clientMutationId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(branchProtectionRuleId, clientMutationId)
    }

    class Builder {

        private lateinit var branchProtectionRuleId: String
        private var clientMutationId: String? = null

        fun setBranchProtectionRuleId(branchProtectionRuleId: String): Builder {
            this.branchProtectionRuleId = branchProtectionRuleId
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun build(): DeleteBranchProtectionRuleInputTO {
            return DeleteBranchProtectionRuleInputTO(branchProtectionRuleId, clientMutationId)
        }
    }
}
