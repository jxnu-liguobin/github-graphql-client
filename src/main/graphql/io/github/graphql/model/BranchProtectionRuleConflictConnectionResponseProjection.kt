package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BranchProtectionRuleConflictConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class BranchProtectionRuleConflictConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BranchProtectionRuleConflictConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BranchProtectionRuleConflictConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", 0) + 1
            this.edges(BranchProtectionRuleConflictEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", 0) + 1
            this.nodes(BranchProtectionRuleConflictResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: BranchProtectionRuleConflictEdgeResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: BranchProtectionRuleConflictEdgeResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: BranchProtectionRuleConflictResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: BranchProtectionRuleConflictResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): BranchProtectionRuleConflictConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): BranchProtectionRuleConflictConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): BranchProtectionRuleConflictConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): BranchProtectionRuleConflictConnectionResponseProjection = typename(null)

    fun typename(alias: String?): BranchProtectionRuleConflictConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
