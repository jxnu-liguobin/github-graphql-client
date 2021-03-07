package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RateLimitTO(
    val cost: Int,
    val limit: Int,
    val nodeCount: Int,
    val remaining: Int,
    val resetAt: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cost: " + GraphQLRequestSerializer.getEntry(cost))
        joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit))
        joiner.add("nodeCount: " + GraphQLRequestSerializer.getEntry(nodeCount))
        joiner.add("remaining: " + GraphQLRequestSerializer.getEntry(remaining))
        joiner.add("resetAt: " + GraphQLRequestSerializer.getEntry(resetAt))
        return joiner.toString()
    }

    class Builder {

        private var cost: Int = 0
        private var limit: Int = 0
        private var nodeCount: Int = 0
        private var remaining: Int = 0
        private lateinit var resetAt: String

        fun setCost(cost: Int): Builder {
            this.cost = cost
            return this
        }

        fun setLimit(limit: Int): Builder {
            this.limit = limit
            return this
        }

        fun setNodeCount(nodeCount: Int): Builder {
            this.nodeCount = nodeCount
            return this
        }

        fun setRemaining(remaining: Int): Builder {
            this.remaining = remaining
            return this
        }

        fun setResetAt(resetAt: String): Builder {
            this.resetAt = resetAt
            return this
        }

        fun build(): RateLimitTO {
            return RateLimitTO(cost, limit, nodeCount, remaining, resetAt)
        }
    }
}
