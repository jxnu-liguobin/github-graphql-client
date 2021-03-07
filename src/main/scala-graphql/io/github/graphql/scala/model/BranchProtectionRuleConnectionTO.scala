package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BranchProtectionRuleConnectionTO(
    edges: Seq[BranchProtectionRuleEdgeTO],
    nodes: Seq[BranchProtectionRuleTO],
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
        val that = obj.asInstanceOf[BranchProtectionRuleConnectionTO]
        Objects.equals(edges, that.edges) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(pageInfo, that.pageInfo) &&
        Objects.equals(totalCount, that.totalCount)
    }

    override def hashCode(): Int = {
        Objects.hash(edges, nodes, pageInfo, totalCount)
    }
}

object BranchProtectionRuleConnectionTO {

    def builder(): BranchProtectionRuleConnectionTO.Builder = new Builder()

    class Builder {

        private var edges: Seq[BranchProtectionRuleEdgeTO] = _
        private var nodes: Seq[BranchProtectionRuleTO] = _
        private var pageInfo: PageInfoTO = _
        private var totalCount: Int = _

        def setEdges(edges: Seq[BranchProtectionRuleEdgeTO]): Builder = {
            this.edges = edges
            this
        }

        def setNodes(nodes: Seq[BranchProtectionRuleTO]): Builder = {
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

        def build(): BranchProtectionRuleConnectionTO = new BranchProtectionRuleConnectionTO(edges, nodes, pageInfo, totalCount)

    }
}
