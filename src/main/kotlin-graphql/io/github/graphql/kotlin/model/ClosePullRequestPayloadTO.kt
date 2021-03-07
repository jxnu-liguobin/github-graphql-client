package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ClosePullRequestPayloadTO(
    val clientMutationId: String?,
    val pullRequest: PullRequestTO?
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
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
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
        val that = other as ClosePullRequestPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(pullRequest, that.pullRequest)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, pullRequest)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var pullRequest: PullRequestTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO?): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun build(): ClosePullRequestPayloadTO {
            return ClosePullRequestPayloadTO(clientMutationId, pullRequest)
        }
    }
}
