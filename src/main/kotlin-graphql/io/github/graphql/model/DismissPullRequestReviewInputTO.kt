package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
