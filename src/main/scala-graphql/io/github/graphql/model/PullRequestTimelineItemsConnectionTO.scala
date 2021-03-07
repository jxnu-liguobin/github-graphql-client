package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
