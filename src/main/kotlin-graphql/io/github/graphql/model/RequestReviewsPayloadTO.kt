package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
