package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BranchProtectionRuleConflictEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class BranchProtectionRuleConflictEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BranchProtectionRuleConflictEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BranchProtectionRuleConflictEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", 0) + 1
            this.node(BranchProtectionRuleConflictResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): BranchProtectionRuleConflictEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): BranchProtectionRuleConflictEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: BranchProtectionRuleConflictResponseProjection): BranchProtectionRuleConflictEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: BranchProtectionRuleConflictResponseProjection): BranchProtectionRuleConflictEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): BranchProtectionRuleConflictEdgeResponseProjection = typename(null)

    fun typename(alias: String?): BranchProtectionRuleConflictEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
