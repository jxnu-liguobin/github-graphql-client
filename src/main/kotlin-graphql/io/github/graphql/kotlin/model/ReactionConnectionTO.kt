package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReactionConnectionTO(
    val edges: List<ReactionEdgeTO?>?,
    val nodes: List<ReactionTO?>?,
    val pageInfo: PageInfoTO,
    val totalCount: Int,
    val viewerHasReacted: Boolean
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
        joiner.add("viewerHasReacted: " + GraphQLRequestSerializer.getEntry(viewerHasReacted))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ReactionConnectionTO
        return Objects.equals(edges, that.edges)
                && Objects.equals(nodes, that.nodes)
                && Objects.equals(pageInfo, that.pageInfo)
                && Objects.equals(totalCount, that.totalCount)
                && Objects.equals(viewerHasReacted, that.viewerHasReacted)

    }

    override fun hashCode(): Int = {
        return Objects.hash(edges, nodes, pageInfo, totalCount, viewerHasReacted)
    }

    class Builder {

        private var edges: List<ReactionEdgeTO?>? = null
        private var nodes: List<ReactionTO?>? = null
        private lateinit var pageInfo: PageInfoTO
        private var totalCount: Int = 0
        private var viewerHasReacted: Boolean = false

        fun setEdges(edges: List<ReactionEdgeTO?>?): Builder {
            this.edges = edges
            return this
        }

        fun setNodes(nodes: List<ReactionTO?>?): Builder {
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

        fun setViewerHasReacted(viewerHasReacted: Boolean): Builder {
            this.viewerHasReacted = viewerHasReacted
            return this
        }

        fun build(): ReactionConnectionTO {
            return ReactionConnectionTO(edges, nodes, pageInfo, totalCount, viewerHasReacted)
        }
    }
}
