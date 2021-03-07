package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UnmarkIssueAsDuplicateInputTO(
    val canonicalId: String,
    val clientMutationId: String?,
    val duplicateId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("canonicalId: " + GraphQLRequestSerializer.getEntry(canonicalId))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("duplicateId: " + GraphQLRequestSerializer.getEntry(duplicateId))
        return joiner.toString()
    }

    class Builder {

        private lateinit var canonicalId: String
        private var clientMutationId: String? = null
        private lateinit var duplicateId: String

        fun setCanonicalId(canonicalId: String): Builder {
            this.canonicalId = canonicalId
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setDuplicateId(duplicateId: String): Builder {
            this.duplicateId = duplicateId
            return this
        }

        fun build(): UnmarkIssueAsDuplicateInputTO {
            return UnmarkIssueAsDuplicateInputTO(canonicalId, clientMutationId, duplicateId)
        }
    }
}
