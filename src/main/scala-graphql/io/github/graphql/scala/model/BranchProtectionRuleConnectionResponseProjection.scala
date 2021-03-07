package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for BranchProtectionRuleConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BranchProtectionRuleConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): BranchProtectionRuleConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): BranchProtectionRuleConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", 0) + 1)
            this.edges(new BranchProtectionRuleEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", 0) + 1)
            this.nodes(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: BranchProtectionRuleEdgeResponseProjection): BranchProtectionRuleConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: BranchProtectionRuleEdgeResponseProjection): BranchProtectionRuleConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): BranchProtectionRuleConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): BranchProtectionRuleConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): BranchProtectionRuleConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): BranchProtectionRuleConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): BranchProtectionRuleConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BranchProtectionRuleConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[BranchProtectionRuleConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
