package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReactionConnectionTO(
    edges: Seq[ReactionEdgeTO],
    nodes: Seq[ReactionTO],
    @javax.validation.constraints.NotNull
    pageInfo: PageInfoTO,
    totalCount: Int,
    viewerHasReacted: Boolean
) {

    override def toString(): String = {
        Seq(
            if (edges != null) "edges: " + GraphQLRequestSerializer.getEntry(edges.asJava) else "",
            if (nodes != null) "nodes: " + GraphQLRequestSerializer.getEntry(nodes.asJava) else "",
            if (pageInfo != null) "pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo) else "",
            "totalCount: " + GraphQLRequestSerializer.getEntry(totalCount),
            "viewerHasReacted: " + GraphQLRequestSerializer.getEntry(viewerHasReacted)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ReactionConnectionTO {

    def builder(): ReactionConnectionTO.Builder = new Builder()

    class Builder {

        private var edges: Seq[ReactionEdgeTO] = _
        private var nodes: Seq[ReactionTO] = _
        private var pageInfo: PageInfoTO = _
        private var totalCount: Int = _
        private var viewerHasReacted: Boolean = _

        def setEdges(edges: Seq[ReactionEdgeTO]): Builder = {
            this.edges = edges
            this
        }

        def setNodes(nodes: Seq[ReactionTO]): Builder = {
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

        def setViewerHasReacted(viewerHasReacted: Boolean): Builder = {
            this.viewerHasReacted = viewerHasReacted
            this
        }

        def build(): ReactionConnectionTO = new ReactionConnectionTO(edges, nodes, pageInfo, totalCount, viewerHasReacted)

    }
}
