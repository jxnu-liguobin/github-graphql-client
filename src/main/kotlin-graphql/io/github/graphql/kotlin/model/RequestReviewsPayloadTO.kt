package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RequestReviewsPayloadTO(
    val clientMutationId: String?,
    val pullRequest: PullRequestTO?,
    val requestedReviewersEdge: UserEdgeTO?
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
        if (requestedReviewersEdge != null) {
            joiner.add("requestedReviewersEdge: " + GraphQLRequestSerializer.getEntry(requestedReviewersEdge))
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
        val that = other as RequestReviewsPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(pullRequest, that.pullRequest)
                && Objects.equals(requestedReviewersEdge, that.requestedReviewersEdge)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, pullRequest, requestedReviewersEdge)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var pullRequest: PullRequestTO? = null
        private var requestedReviewersEdge: UserEdgeTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO?): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun setRequestedReviewersEdge(requestedReviewersEdge: UserEdgeTO?): Builder {
            this.requestedReviewersEdge = requestedReviewersEdge
            return this
        }

        fun build(): RequestReviewsPayloadTO {
            return RequestReviewsPayloadTO(clientMutationId, pullRequest, requestedReviewersEdge)
        }
    }
}
