package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestTimelineItemsConnectionTO(
    val edges: List<PullRequestTimelineItemsEdgeTO?>?,
    val filteredCount: Int,
    val nodes: List<PullRequestTimelineItemsTO?>?,
    val pageCount: Int,
    val pageInfo: PageInfoTO,
    val totalCount: Int,
    val updatedAt: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges))
        }
        joiner.add("filteredCount: " + GraphQLRequestSerializer.getEntry(filteredCount))
        if (nodes != null) {
            joiner.add("nodes: " + GraphQLRequestSerializer.getEntry(nodes))
        }
        joiner.add("pageCount: " + GraphQLRequestSerializer.getEntry(pageCount))
        joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo))
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        return joiner.toString()
    }
}
