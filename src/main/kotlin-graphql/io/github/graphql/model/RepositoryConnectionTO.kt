package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
