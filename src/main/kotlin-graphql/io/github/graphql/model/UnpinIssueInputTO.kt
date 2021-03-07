package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UnpinIssueInputTO(
    val clientMutationId: String?,
    val issueId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("issueId: " + GraphQLRequestSerializer.getEntry(issueId))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var issueId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setIssueId(issueId: String): Builder {
            this.issueId = issueId
            return this
        }

        fun build(): UnpinIssueInputTO {
            return UnpinIssueInputTO(clientMutationId, issueId)
        }
    }
}
