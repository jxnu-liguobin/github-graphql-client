package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BranchProtectionRuleConflict
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class BranchProtectionRuleConflictResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BranchProtectionRuleConflictResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BranchProtectionRuleConflictResponseProjection {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1
            this.branchProtectionRule(BranchProtectionRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", 0) + 1
            this.conflictingBranchProtectionRule(BranchProtectionRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", 0) + 1
            this.ref(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        return this
    }

    fun branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConflictResponseProjection = branchProtectionRule(null, subProjection)

    fun branchProtectionRule(alias: String?, subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConflictResponseProjection {
        fields.add(GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun conflictingBranchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConflictResponseProjection = conflictingBranchProtectionRule(null, subProjection)

    fun conflictingBranchProtectionRule(alias: String?, subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConflictResponseProjection {
        fields.add(GraphQLResponseField("conflictingBranchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun ref(subProjection: RefResponseProjection): BranchProtectionRuleConflictResponseProjection = ref(null, subProjection)

    fun ref(alias: String?, subProjection: RefResponseProjection): BranchProtectionRuleConflictResponseProjection {
        fields.add(GraphQLResponseField("ref").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): BranchProtectionRuleConflictResponseProjection = typename(null)

    fun typename(alias: String?): BranchProtectionRuleConflictResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
