package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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

    companion object {
        fun builder(): Builder = Builder()
    }

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

    class Builder {

        private var edges: List<PullRequestTimelineItemsEdgeTO?>? = null
        private var filteredCount: Int = 0
        private var nodes: List<PullRequestTimelineItemsTO?>? = null
        private var pageCount: Int = 0
        private lateinit var pageInfo: PageInfoTO
        private var totalCount: Int = 0
        private lateinit var updatedAt: String

        fun setEdges(edges: List<PullRequestTimelineItemsEdgeTO?>?): Builder {
            this.edges = edges
            return this
        }

        fun setFilteredCount(filteredCount: Int): Builder {
            this.filteredCount = filteredCount
            return this
        }

        fun setNodes(nodes: List<PullRequestTimelineItemsTO?>?): Builder {
            this.nodes = nodes
            return this
        }

        fun setPageCount(pageCount: Int): Builder {
            this.pageCount = pageCount
            return this
        }

        fun setPageInfo(pageInfo: PageInfoTO): Builder {
            this.pageInfo = pageInfo
            return this
        }

        fun setTotalCount(totalCount: Int): Builder {
            this.totalCount = totalCount
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun build(): PullRequestTimelineItemsConnectionTO {
            return PullRequestTimelineItemsConnectionTO(edges, filteredCount, nodes, pageCount, pageInfo, totalCount, updatedAt)
        }
    }
}
