package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ExternalIdentityConnectionTO(
    edges: Seq[ExternalIdentityEdgeTO],
    nodes: Seq[ExternalIdentityTO],
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

object ExternalIdentityConnectionTO {

    def builder(): ExternalIdentityConnectionTO.Builder = new Builder()

    class Builder {

        private var edges: Seq[ExternalIdentityEdgeTO] = _
        private var nodes: Seq[ExternalIdentityTO] = _
        private var pageInfo: PageInfoTO = _
        private var totalCount: Int = _

        def setEdges(edges: Seq[ExternalIdentityEdgeTO]): Builder = {
            this.edges = edges
            this
        }

        def setNodes(nodes: Seq[ExternalIdentityTO]): Builder = {
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

        def build(): ExternalIdentityConnectionTO = new ExternalIdentityConnectionTO(edges, nodes, pageInfo, totalCount)

    }
}
