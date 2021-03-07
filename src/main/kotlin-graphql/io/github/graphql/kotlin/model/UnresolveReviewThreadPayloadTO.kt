package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UnresolveReviewThreadPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(thread, that.thread)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, thread)
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
