package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RateLimitTO(
    val cost: Int,
    val limit: Int,
    val nodeCount: Int,
    val remaining: Int,
    val resetAt: String
) {

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
}
