package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class AddPullRequestReviewCommentPayloadTO(
    val clientMutationId: String?,
    val comment: PullRequestReviewCommentTO?,
    val commentEdge: PullRequestReviewCommentEdgeTO?
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
        if (comment != null) {
            joiner.add("comment: " + GraphQLRequestSerializer.getEntry(comment))
        }
        if (commentEdge != null) {
            joiner.add("commentEdge: " + GraphQLRequestSerializer.getEntry(commentEdge))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var comment: PullRequestReviewCommentTO? = null
        private var commentEdge: PullRequestReviewCommentEdgeTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setComment(comment: PullRequestReviewCommentTO?): Builder {
            this.comment = comment
            return this
        }

        fun setCommentEdge(commentEdge: PullRequestReviewCommentEdgeTO?): Builder {
            this.commentEdge = commentEdge
            return this
        }

        fun build(): AddPullRequestReviewCommentPayloadTO {
            return AddPullRequestReviewCommentPayloadTO(clientMutationId, comment, commentEdge)
        }
    }
}
