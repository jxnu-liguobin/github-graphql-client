package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BranchProtectionRuleEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class BranchProtectionRuleEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BranchProtectionRuleEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BranchProtectionRuleEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", 0) + 1
            this.node(BranchProtectionRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): BranchProtectionRuleEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): BranchProtectionRuleEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): BranchProtectionRuleEdgeResponseProjection = typename(null)

    fun typename(alias: String?): BranchProtectionRuleEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
