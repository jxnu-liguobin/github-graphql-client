package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class IssueTimelineItemsConnectionTO(
    val edges: List<IssueTimelineItemsEdgeTO?>?,
    val filteredCount: Int,
    val nodes: List<IssueTimelineItemsTO?>?,
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as IssueTimelineItemsConnectionTO
        return Objects.equals(edges, that.edges)
                && Objects.equals(filteredCount, that.filteredCount)
                && Objects.equals(nodes, that.nodes)
                && Objects.equals(pageCount, that.pageCount)
                && Objects.equals(pageInfo, that.pageInfo)
                && Objects.equals(totalCount, that.totalCount)
                && Objects.equals(updatedAt, that.updatedAt)

    }

    override fun hashCode(): Int = {
        return Objects.hash(edges, filteredCount, nodes, pageCount, pageInfo, totalCount, updatedAt)
    }

    class Builder {

        private var edges: List<IssueTimelineItemsEdgeTO?>? = null
        private var filteredCount: Int = 0
        private var nodes: List<IssueTimelineItemsTO?>? = null
        private var pageCount: Int = 0
        private lateinit var pageInfo: PageInfoTO
        private var totalCount: Int = 0
        private lateinit var updatedAt: String

        fun setEdges(edges: List<IssueTimelineItemsEdgeTO?>?): Builder {
            this.edges = edges
            return this
        }

        fun setFilteredCount(filteredCount: Int): Builder {
            this.filteredCount = filteredCount
            return this
        }

        fun setNodes(nodes: List<IssueTimelineItemsTO?>?): Builder {
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

        fun build(): IssueTimelineItemsConnectionTO {
            return IssueTimelineItemsConnectionTO(edges, filteredCount, nodes, pageCount, pageInfo, totalCount, updatedAt)
        }
    }
}
