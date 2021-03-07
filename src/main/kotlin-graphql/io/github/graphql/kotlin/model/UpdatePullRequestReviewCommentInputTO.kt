package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class UpdatePullRequestReviewCommentInputTO(
    val body: String,
    val clientMutationId: String?,
    val pullRequestReviewCommentId: String
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
        joiner.add("pullRequestReviewCommentId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewCommentId))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UpdatePullRequestReviewCommentInputTO
        return Objects.equals(body, that.body)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(pullRequestReviewCommentId, that.pullRequestReviewCommentId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(body, clientMutationId, pullRequestReviewCommentId)
    }

    class Builder {

        private lateinit var body: String
        private var clientMutationId: String? = null
        private lateinit var pullRequestReviewCommentId: String

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setPullRequestReviewCommentId(pullRequestReviewCommentId: String): Builder {
            this.pullRequestReviewCommentId = pullRequestReviewCommentId
            return this
        }

        fun build(): UpdatePullRequestReviewCommentInputTO {
            return UpdatePullRequestReviewCommentInputTO(body, clientMutationId, pullRequestReviewCommentId)
        }
    }
}
