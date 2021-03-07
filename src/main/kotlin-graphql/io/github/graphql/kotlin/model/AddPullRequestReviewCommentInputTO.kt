package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class AddPullRequestReviewCommentInputTO(
    val body: String,
    val clientMutationId: String?,
    val commitOID: String?,
    val inReplyTo: String?,
    val path: String?,
    val position: Int?,
    val pullRequestReviewId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (commitOID != null) {
            joiner.add("commitOID: " + GraphQLRequestSerializer.getEntry(commitOID))
        }
        if (inReplyTo != null) {
            joiner.add("inReplyTo: " + GraphQLRequestSerializer.getEntry(inReplyTo))
        }
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        }
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position))
        }
        joiner.add("pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AddPullRequestReviewCommentInputTO
        return Objects.equals(body, that.body)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(commitOID, that.commitOID)
                && Objects.equals(inReplyTo, that.inReplyTo)
                && Objects.equals(path, that.path)
                && Objects.equals(position, that.position)
                && Objects.equals(pullRequestReviewId, that.pullRequestReviewId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(body, clientMutationId, commitOID, inReplyTo, path, position, pullRequestReviewId)
    }

    class Builder {

        private lateinit var body: String
        private var clientMutationId: String? = null
        private var commitOID: String? = null
        private var inReplyTo: String? = null
        private var path: String? = null
        private var position: Int? = null
        private lateinit var pullRequestReviewId: String

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setCommitOID(commitOID: String?): Builder {
            this.commitOID = commitOID
            return this
        }

        fun setInReplyTo(inReplyTo: String?): Builder {
            this.inReplyTo = inReplyTo
            return this
        }

        fun setPath(path: String?): Builder {
            this.path = path
            return this
        }

        fun setPosition(position: Int?): Builder {
            this.position = position
            return this
        }

        fun setPullRequestReviewId(pullRequestReviewId: String): Builder {
            this.pullRequestReviewId = pullRequestReviewId
            return this
        }

        fun build(): AddPullRequestReviewCommentInputTO {
            return AddPullRequestReviewCommentInputTO(body, clientMutationId, commitOID, inReplyTo, path, position, pullRequestReviewId)
        }
    }
}
