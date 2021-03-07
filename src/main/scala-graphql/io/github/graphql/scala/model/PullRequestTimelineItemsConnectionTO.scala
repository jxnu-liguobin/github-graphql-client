package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestTimelineItemsConnectionTO(
    edges: Seq[PullRequestTimelineItemsEdgeTO],
    filteredCount: Int,
    nodes: Seq[PullRequestTimelineItemsTO],
    pageCount: Int,
    @javax.validation.constraints.NotNull
    pageInfo: PageInfoTO,
    totalCount: Int,
    @javax.validation.constraints.NotNull
    updatedAt: String
) {

    override def toString(): String = {
        Seq(
            if (edges != null) "edges: " + GraphQLRequestSerializer.getEntry(edges.asJava) else "",
            "filteredCount: " + GraphQLRequestSerializer.getEntry(filteredCount),
            if (nodes != null) "nodes: " + GraphQLRequestSerializer.getEntry(nodes.asJava) else "",
            "pageCount: " + GraphQLRequestSerializer.getEntry(pageCount),
            if (pageInfo != null) "pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo) else "",
            "totalCount: " + GraphQLRequestSerializer.getEntry(totalCount),
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PullRequestTimelineItemsConnectionTO]
        Objects.equals(edges, that.edges) &&
        Objects.equals(filteredCount, that.filteredCount) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageCount, that.pageCount) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        Objects.equals(totalCount, that.totalCount) &&
        Objects.equals(updatedAt, that.updatedAt)
    }

    override def hashCode(): Int = {
        Objects.hash(edges, filteredCount, nodes, pageCount, pageInfo, totalCount, updatedAt)
    }
}

object PullRequestTimelineItemsConnectionTO {

    def builder(): PullRequestTimelineItemsConnectionTO.Builder = new Builder()

    class Builder {

        private var edges: Seq[PullRequestTimelineItemsEdgeTO] = _
        private var filteredCount: Int = _
        private var nodes: Seq[PullRequestTimelineItemsTO] = _
        private var pageCount: Int = _
        private var pageInfo: PageInfoTO = _
        private var totalCount: Int = _
        private var updatedAt: String = _

        def setEdges(edges: Seq[PullRequestTimelineItemsEdgeTO]): Builder = {
            this.edges = edges
            this
        }

        def setFilteredCount(filteredCount: Int): Builder = {
            this.filteredCount = filteredCount
            this
        }

        def setNodes(nodes: Seq[PullRequestTimelineItemsTO]): Builder = {
            this.nodes = nodes
            this
        }

        def setPageCount(pageCount: Int): Builder = {
            this.pageCount = pageCount
            this
        }

        def setPageInfo(pageInfo: PageInfoTO): Builder = {
            this.pageInfo = pageInfo
            this
        }

        def setTotalCount(totalCount: Int): Builder = {
            this.totalCount = totalCount
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def build(): PullRequestTimelineItemsConnectionTO = new PullRequestTimelineItemsConnectionTO(edges, filteredCount, nodes, pageCount, pageInfo, totalCount, updatedAt)

    }
}
