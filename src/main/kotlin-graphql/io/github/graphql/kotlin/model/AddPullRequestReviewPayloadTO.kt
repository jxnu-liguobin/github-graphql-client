package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AddPullRequestReviewPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(pullRequestReview, that.pullRequestReview)
                && Objects.equals(reviewEdge, that.reviewEdge)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, pullRequestReview, reviewEdge)
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
