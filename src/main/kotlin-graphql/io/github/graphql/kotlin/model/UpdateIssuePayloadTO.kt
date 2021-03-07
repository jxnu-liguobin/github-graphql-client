package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UpdateIssuePayloadTO(
    val clientMutationId: String?,
    val issue: IssueTO?
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
        if (issue != null) {
            joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue))
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
        val that = other as UpdateIssuePayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(issue, that.issue)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, issue)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var issue: IssueTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setIssue(issue: IssueTO?): Builder {
            this.issue = issue
            return this
        }

        fun build(): UpdateIssuePayloadTO {
            return UpdateIssuePayloadTO(clientMutationId, issue)
        }
    }
}
