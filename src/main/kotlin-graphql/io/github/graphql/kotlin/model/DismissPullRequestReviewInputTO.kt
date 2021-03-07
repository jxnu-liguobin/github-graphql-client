package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class DismissPullRequestReviewInputTO(
    val clientMutationId: String?,
    val message: String,
    val pullRequestReviewId: String
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
        joiner.add("message: " + GraphQLRequestSerializer.getEntry(message))
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
        val that = other as DismissPullRequestReviewInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(message, that.message)
                && Objects.equals(pullRequestReviewId, that.pullRequestReviewId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, message, pullRequestReviewId)
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var message: String
        private lateinit var pullRequestReviewId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setMessage(message: String): Builder {
            this.message = message
            return this
        }

        fun setPullRequestReviewId(pullRequestReviewId: String): Builder {
            this.pullRequestReviewId = pullRequestReviewId
            return this
        }

        fun build(): DismissPullRequestReviewInputTO {
            return DismissPullRequestReviewInputTO(clientMutationId, message, pullRequestReviewId)
        }
    }
}
