package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class PinIssueInputTO(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as PinIssueInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(issueId, that.issueId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, issueId)
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

        fun build(): PinIssueInputTO {
            return PinIssueInputTO(clientMutationId, issueId)
        }
    }
}
