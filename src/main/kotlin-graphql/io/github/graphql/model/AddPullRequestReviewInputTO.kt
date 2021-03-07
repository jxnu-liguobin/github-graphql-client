package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class AddPullRequestReviewInputTO(
    val body: String?,
    val clientMutationId: String?,
    val comments: List<DraftPullRequestReviewCommentTO?>?,
    val commitOID: String?,
    val event: PullRequestReviewEventTO?,
    val pullRequestId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (comments != null) {
            joiner.add("comments: " + GraphQLRequestSerializer.getEntry(comments))
        }
        if (commitOID != null) {
            joiner.add("commitOID: " + GraphQLRequestSerializer.getEntry(commitOID))
        }
        if (event != null) {
            joiner.add("event: " + GraphQLRequestSerializer.getEntry(event))
        }
        joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId))
        return joiner.toString()
    }

    class Builder {

        private var body: String? = null
        private var clientMutationId: String? = null
        private var comments: List<DraftPullRequestReviewCommentTO?>? = null
        private var commitOID: String? = null
        private var event: PullRequestReviewEventTO? = null
        private lateinit var pullRequestId: String

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setComments(comments: List<DraftPullRequestReviewCommentTO?>?): Builder {
            this.comments = comments
            return this
        }

        fun setCommitOID(commitOID: String?): Builder {
            this.commitOID = commitOID
            return this
        }

        fun setEvent(event: PullRequestReviewEventTO?): Builder {
            this.event = event
            return this
        }

        fun setPullRequestId(pullRequestId: String): Builder {
            this.pullRequestId = pullRequestId
            return this
        }

        fun build(): AddPullRequestReviewInputTO {
            return AddPullRequestReviewInputTO(body, clientMutationId, comments, commitOID, event, pullRequestId)
        }
    }
}
