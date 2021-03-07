package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UnmarkIssueAsDuplicateInputTO
        return Objects.equals(canonicalId, that.canonicalId)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(duplicateId, that.duplicateId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(canonicalId, clientMutationId, duplicateId)
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
