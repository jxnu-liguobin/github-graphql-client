package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
