package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RepositoryConnectionTO(
    val edges: List<RepositoryEdgeTO?>?,
    val nodes: List<RepositoryTO?>?,
    val pageInfo: PageInfoTO,
    val totalCount: Int,
    val totalDiskUsage: Int
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
        if (nodes != null) {
            joiner.add("nodes: " + GraphQLRequestSerializer.getEntry(nodes))
        }
        joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo))
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount))
        joiner.add("totalDiskUsage: " + GraphQLRequestSerializer.getEntry(totalDiskUsage))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RepositoryConnectionTO
        return Objects.equals(edges, that.edges)
                && Objects.equals(nodes, that.nodes)
                && Objects.equals(pageInfo, that.pageInfo)
                && Objects.equals(totalCount, that.totalCount)
                && Objects.equals(totalDiskUsage, that.totalDiskUsage)

    }

    override fun hashCode(): Int = {
        return Objects.hash(edges, nodes, pageInfo, totalCount, totalDiskUsage)
    }

    class Builder {

        private var edges: List<RepositoryEdgeTO?>? = null
        private var nodes: List<RepositoryTO?>? = null
        private lateinit var pageInfo: PageInfoTO
        private var totalCount: Int = 0
        private var totalDiskUsage: Int = 0

        fun setEdges(edges: List<RepositoryEdgeTO?>?): Builder {
            this.edges = edges
            return this
        }

        fun setNodes(nodes: List<RepositoryTO?>?): Builder {
            this.nodes = nodes
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

        fun setTotalDiskUsage(totalDiskUsage: Int): Builder {
            this.totalDiskUsage = totalDiskUsage
            return this
        }

        fun build(): RepositoryConnectionTO {
            return RepositoryConnectionTO(edges, nodes, pageInfo, totalCount, totalDiskUsage)
        }
    }
}
