package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestTimelineConnectionTO(
    edges: Seq[PullRequestTimelineItemEdgeTO],
    nodes: Seq[PullRequestTimelineItemTO],
    @javax.validation.constraints.NotNull
    pageInfo: PageInfoTO,
    totalCount: Int
) {

    override def toString(): String = {
        Seq(
            if (edges != null) "edges: " + GraphQLRequestSerializer.getEntry(edges.asJava) else "",
            if (nodes != null) "nodes: " + GraphQLRequestSerializer.getEntry(nodes.asJava) else "",
            if (pageInfo != null) "pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo) else "",
            "totalCount: " + GraphQLRequestSerializer.getEntry(totalCount)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PullRequestTimelineConnectionTO]
        Objects.equals(edges, that.edges) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        Objects.equals(totalCount, that.totalCount)
    }

    override def hashCode(): Int = {
        Objects.hash(edges, nodes, pageInfo, totalCount)
    }
}

object PullRequestTimelineConnectionTO {

    def builder(): PullRequestTimelineConnectionTO.Builder = new Builder()

    class Builder {

        private var edges: Seq[PullRequestTimelineItemEdgeTO] = _
        private var nodes: Seq[PullRequestTimelineItemTO] = _
        private var pageInfo: PageInfoTO = _
        private var totalCount: Int = _

        def setEdges(edges: Seq[PullRequestTimelineItemEdgeTO]): Builder = {
            this.edges = edges
            this
        }

        def setNodes(nodes: Seq[PullRequestTimelineItemTO]): Builder = {
            this.nodes = nodes
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

        def build(): PullRequestTimelineConnectionTO = new PullRequestTimelineConnectionTO(edges, nodes, pageInfo, totalCount)

    }
}
