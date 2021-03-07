package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UpdatePullRequestReviewPayloadTO(
    val clientMutationId: String?,
    val pullRequestReview: PullRequestReviewTO?
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
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UpdatePullRequestReviewPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(pullRequestReview, that.pullRequestReview)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, pullRequestReview)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var pullRequestReview: PullRequestReviewTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setPullRequestReview(pullRequestReview: PullRequestReviewTO?): Builder {
            this.pullRequestReview = pullRequestReview
            return this
        }

        fun build(): UpdatePullRequestReviewPayloadTO {
            return UpdatePullRequestReviewPayloadTO(clientMutationId, pullRequestReview)
        }
    }
}
