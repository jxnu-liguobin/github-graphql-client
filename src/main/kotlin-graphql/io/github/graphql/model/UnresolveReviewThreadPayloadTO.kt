package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UnresolveReviewThreadPayloadTO(
    val clientMutationId: String?,
    val thread: PullRequestReviewThreadTO?
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
        if (thread != null) {
            joiner.add("thread: " + GraphQLRequestSerializer.getEntry(thread))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var thread: PullRequestReviewThreadTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setThread(thread: PullRequestReviewThreadTO?): Builder {
            this.thread = thread
            return this
        }

        fun build(): UnresolveReviewThreadPayloadTO {
            return UnresolveReviewThreadPayloadTO(clientMutationId, thread)
        }
    }
}
