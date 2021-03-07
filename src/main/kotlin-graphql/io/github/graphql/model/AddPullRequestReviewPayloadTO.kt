package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class AddPullRequestReviewPayloadTO(
    val clientMutationId: String?,
    val pullRequestReview: PullRequestReviewTO?,
    val reviewEdge: PullRequestReviewEdgeTO?
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
        if (pullRequestReview != null) {
            joiner.add("pullRequestReview: " + GraphQLRequestSerializer.getEntry(pullRequestReview))
        }
        if (reviewEdge != null) {
            joiner.add("reviewEdge: " + GraphQLRequestSerializer.getEntry(reviewEdge))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var pullRequestReview: PullRequestReviewTO? = null
        private var reviewEdge: PullRequestReviewEdgeTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setPullRequestReview(pullRequestReview: PullRequestReviewTO?): Builder {
            this.pullRequestReview = pullRequestReview
            return this
        }

        fun setReviewEdge(reviewEdge: PullRequestReviewEdgeTO?): Builder {
            this.reviewEdge = reviewEdge
            return this
        }

        fun build(): AddPullRequestReviewPayloadTO {
            return AddPullRequestReviewPayloadTO(clientMutationId, pullRequestReview, reviewEdge)
        }
    }
}
