package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BranchProtectionRuleConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class BranchProtectionRuleConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BranchProtectionRuleConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BranchProtectionRuleConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", 0) + 1
            this.edges(BranchProtectionRuleEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", 0) + 1
            this.nodes(BranchProtectionRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: BranchProtectionRuleEdgeResponseProjection): BranchProtectionRuleConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: BranchProtectionRuleEdgeResponseProjection): BranchProtectionRuleConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): BranchProtectionRuleConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): BranchProtectionRuleConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): BranchProtectionRuleConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): BranchProtectionRuleConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): BranchProtectionRuleConnectionResponseProjection = typename(null)

    fun typename(alias: String?): BranchProtectionRuleConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
