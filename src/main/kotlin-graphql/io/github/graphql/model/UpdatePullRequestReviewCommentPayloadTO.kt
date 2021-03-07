package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UpdatePullRequestReviewCommentPayloadTO(
    val clientMutationId: String?,
    val pullRequestReviewComment: PullRequestReviewCommentTO?
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
        if (pullRequestReviewComment != null) {
            joiner.add("pullRequestReviewComment: " + GraphQLRequestSerializer.getEntry(pullRequestReviewComment))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var pullRequestReviewComment: PullRequestReviewCommentTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setPullRequestReviewComment(pullRequestReviewComment: PullRequestReviewCommentTO?): Builder {
            this.pullRequestReviewComment = pullRequestReviewComment
            return this
        }

        fun build(): UpdatePullRequestReviewCommentPayloadTO {
            return UpdatePullRequestReviewCommentPayloadTO(clientMutationId, pullRequestReviewComment)
        }
    }
}
