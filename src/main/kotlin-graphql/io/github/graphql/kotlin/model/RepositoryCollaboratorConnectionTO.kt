package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RepositoryCollaboratorConnectionTO(
    val edges: List<RepositoryCollaboratorEdgeTO?>?,
    val nodes: List<UserTO?>?,
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RepositoryCollaboratorConnectionTO
        return Objects.equals(edges, that.edges)
                && Objects.equals(nodes, that.nodes)
                && Objects.equals(pageInfo, that.pageInfo)
                && Objects.equals(totalCount, that.totalCount)

    }

    override fun hashCode(): Int = {
        return Objects.hash(edges, nodes, pageInfo, totalCount)
    }

    class Builder {

        private var edges: List<RepositoryCollaboratorEdgeTO?>? = null
        private var nodes: List<UserTO?>? = null
        private lateinit var pageInfo: PageInfoTO
        private var totalCount: Int = 0

        fun setEdges(edges: List<RepositoryCollaboratorEdgeTO?>?): Builder {
            this.edges = edges
            return this
        }

        fun setNodes(nodes: List<UserTO?>?): Builder {
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

        fun build(): RepositoryCollaboratorConnectionTO {
            return RepositoryCollaboratorConnectionTO(edges, nodes, pageInfo, totalCount)
        }
    }
}
