package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RateLimitTO(
    cost: Int,
    limit: Int,
    nodeCount: Int,
    remaining: Int,
    @javax.validation.constraints.NotNull
    resetAt: String
) {

    override def toString(): String = {
        Seq(
            "cost: " + GraphQLRequestSerializer.getEntry(cost),
            "limit: " + GraphQLRequestSerializer.getEntry(limit),
            "nodeCount: " + GraphQLRequestSerializer.getEntry(nodeCount),
            "remaining: " + GraphQLRequestSerializer.getEntry(remaining),
            if (resetAt != null) "resetAt: " + GraphQLRequestSerializer.getEntry(resetAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RateLimitTO {

    def builder(): RateLimitTO.Builder = new Builder()

    class Builder {

        private var cost: Int = _
        private var limit: Int = _
        private var nodeCount: Int = _
        private var remaining: Int = _
        private var resetAt: String = _

        def setCost(cost: Int): Builder = {
            this.cost = cost
            this
        }

        def setLimit(limit: Int): Builder = {
            this.limit = limit
            this
        }

        def setNodeCount(nodeCount: Int): Builder = {
            this.nodeCount = nodeCount
            this
        }

        def setRemaining(remaining: Int): Builder = {
            this.remaining = remaining
            this
        }

        def setResetAt(resetAt: String): Builder = {
            this.resetAt = resetAt
            this
        }

        def build(): RateLimitTO = new RateLimitTO(cost, limit, nodeCount, remaining, resetAt)

    }
}
