package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RepositoryConnectionTO(
    edges: Seq[RepositoryEdgeTO],
    nodes: Seq[RepositoryTO],
    @javax.validation.constraints.NotNull
    pageInfo: PageInfoTO,
    totalCount: Int,
    totalDiskUsage: Int
) {

    override def toString(): String = {
        Seq(
            if (edges != null) "edges: " + GraphQLRequestSerializer.getEntry(edges.asJava) else "",
            if (nodes != null) "nodes: " + GraphQLRequestSerializer.getEntry(nodes.asJava) else "",
            if (pageInfo != null) "pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo) else "",
            "totalCount: " + GraphQLRequestSerializer.getEntry(totalCount),
            "totalDiskUsage: " + GraphQLRequestSerializer.getEntry(totalDiskUsage)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RepositoryConnectionTO {

    def builder(): RepositoryConnectionTO.Builder = new Builder()

    class Builder {

        private var edges: Seq[RepositoryEdgeTO] = _
        private var nodes: Seq[RepositoryTO] = _
        private var pageInfo: PageInfoTO = _
        private var totalCount: Int = _
        private var totalDiskUsage: Int = _

        def setEdges(edges: Seq[RepositoryEdgeTO]): Builder = {
            this.edges = edges
            this
        }

        def setNodes(nodes: Seq[RepositoryTO]): Builder = {
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

        def setTotalDiskUsage(totalDiskUsage: Int): Builder = {
            this.totalDiskUsage = totalDiskUsage
            this
        }

        def build(): RepositoryConnectionTO = new RepositoryConnectionTO(edges, nodes, pageInfo, totalCount, totalDiskUsage)

    }
}
