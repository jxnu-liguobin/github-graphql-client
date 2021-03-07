package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BranchProtectionRuleConflictConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class BranchProtectionRuleConflictConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): BranchProtectionRuleConflictConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): BranchProtectionRuleConflictConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", 0) + 1)
            this.edges(new BranchProtectionRuleConflictEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", 0) + 1)
            this.nodes(new BranchProtectionRuleConflictResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: BranchProtectionRuleConflictEdgeResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: BranchProtectionRuleConflictEdgeResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: BranchProtectionRuleConflictResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: BranchProtectionRuleConflictResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): BranchProtectionRuleConflictConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): BranchProtectionRuleConflictConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): BranchProtectionRuleConflictConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BranchProtectionRuleConflictConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
