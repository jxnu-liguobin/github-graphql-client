package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BranchProtectionRuleConflict
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class BranchProtectionRuleConflictResponseProjection extends GraphQLResponseProjection {

    override def all$(): BranchProtectionRuleConflictResponseProjection = all$(3)

    override def all$(maxDepth: Int): BranchProtectionRuleConflictResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1)
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", 0) + 1)
            this.conflictingBranchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", 0) + 1)
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        this
    }

    def branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConflictResponseProjection = {
        branchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def branchProtectionRule(alias: String, subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConflictResponseProjection = {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def conflictingBranchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConflictResponseProjection = {
        conflictingBranchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def conflictingBranchProtectionRule(alias: String, subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleConflictResponseProjection = {
        fields.add(new GraphQLResponseField("conflictingBranchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def ref(subProjection: RefResponseProjection): BranchProtectionRuleConflictResponseProjection = {
        ref(null.asInstanceOf[String], subProjection)
    }

    def ref(alias: String, subProjection: RefResponseProjection): BranchProtectionRuleConflictResponseProjection = {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection))
        this
    }

    def typename(): BranchProtectionRuleConflictResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BranchProtectionRuleConflictResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
