package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PushAllowanceConnectionTO(
    edges: Seq[PushAllowanceEdgeTO],
    nodes: Seq[PushAllowanceTO],
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
}

object PushAllowanceConnectionTO {

    def builder(): PushAllowanceConnectionTO.Builder = new Builder()

    class Builder {

        private var edges: Seq[PushAllowanceEdgeTO] = _
        private var nodes: Seq[PushAllowanceTO] = _
        private var pageInfo: PageInfoTO = _
        private var totalCount: Int = _

        def setEdges(edges: Seq[PushAllowanceEdgeTO]): Builder = {
            this.edges = edges
            this
        }

        def setNodes(nodes: Seq[PushAllowanceTO]): Builder = {
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

        def build(): PushAllowanceConnectionTO = new PushAllowanceConnectionTO(edges, nodes, pageInfo, totalCount)

    }
}
