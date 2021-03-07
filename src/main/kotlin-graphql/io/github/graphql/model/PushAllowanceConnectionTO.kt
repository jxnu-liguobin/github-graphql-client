package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PushAllowanceConnectionTO(
    val edges: List<PushAllowanceEdgeTO?>?,
    val nodes: List<PushAllowanceTO?>?,
    val pageInfo: PageInfoTO,
    val totalCount: Int
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
        return joiner.toString()
    }

    class Builder {

        private var edges: List<PushAllowanceEdgeTO?>? = null
        private var nodes: List<PushAllowanceTO?>? = null
        private lateinit var pageInfo: PageInfoTO
        private var totalCount: Int = 0

        fun setEdges(edges: List<PushAllowanceEdgeTO?>?): Builder {
            this.edges = edges
            return this
        }

        fun setNodes(nodes: List<PushAllowanceTO?>?): Builder {
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

        fun build(): PushAllowanceConnectionTO {
            return PushAllowanceConnectionTO(edges, nodes, pageInfo, totalCount)
        }
    }
}
