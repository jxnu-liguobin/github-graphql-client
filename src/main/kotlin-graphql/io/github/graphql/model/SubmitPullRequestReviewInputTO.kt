package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SubmitPullRequestReviewInputTO(
    val body: String?,
    val clientMutationId: String?,
    val event: PullRequestReviewEventTO,
    val pullRequestReviewId: String
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
        joiner.add("event: " + GraphQLRequestSerializer.getEntry(event))
        joiner.add("pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId))
        return joiner.toString()
    }

    class Builder {

        private var body: String? = null
        private var clientMutationId: String? = null
        private lateinit var event: PullRequestReviewEventTO
        private lateinit var pullRequestReviewId: String

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setEvent(event: PullRequestReviewEventTO): Builder {
            this.event = event
            return this
        }

        fun setPullRequestReviewId(pullRequestReviewId: String): Builder {
            this.pullRequestReviewId = pullRequestReviewId
            return this
        }

        fun build(): SubmitPullRequestReviewInputTO {
            return SubmitPullRequestReviewInputTO(body, clientMutationId, event, pullRequestReviewId)
        }
    }
}
