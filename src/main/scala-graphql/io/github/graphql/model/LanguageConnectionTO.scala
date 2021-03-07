package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class LanguageConnectionTO(
    edges: Seq[LanguageEdgeTO],
    nodes: Seq[LanguageTO],
    @javax.validation.constraints.NotNull
    pageInfo: PageInfoTO,
    totalCount: Int,
    totalSize: Int
) {

    override def toString(): String = {
        Seq(
            if (edges != null) "edges: " + GraphQLRequestSerializer.getEntry(edges.asJava) else "",
            if (nodes != null) "nodes: " + GraphQLRequestSerializer.getEntry(nodes.asJava) else "",
            if (pageInfo != null) "pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo) else "",
            "totalCount: " + GraphQLRequestSerializer.getEntry(totalCount),
            "totalSize: " + GraphQLRequestSerializer.getEntry(totalSize)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object LanguageConnectionTO {

    def builder(): LanguageConnectionTO.Builder = new Builder()

    class Builder {

        private var edges: Seq[LanguageEdgeTO] = _
        private var nodes: Seq[LanguageTO] = _
        private var pageInfo: PageInfoTO = _
        private var totalCount: Int = _
        private var totalSize: Int = _

        def setEdges(edges: Seq[LanguageEdgeTO]): Builder = {
            this.edges = edges
            this
        }

        def setNodes(nodes: Seq[LanguageTO]): Builder = {
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

        def setTotalSize(totalSize: Int): Builder = {
            this.totalSize = totalSize
            this
        }

        def build(): LanguageConnectionTO = new LanguageConnectionTO(edges, nodes, pageInfo, totalCount, totalSize)

    }
}
