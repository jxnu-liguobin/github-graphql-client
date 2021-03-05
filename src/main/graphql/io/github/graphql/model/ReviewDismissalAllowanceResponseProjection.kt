package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewDismissalAllowance
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReviewDismissalAllowanceResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewDismissalAllowanceResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewDismissalAllowanceResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", 0) + 1
            this.actor(ReviewDismissalAllowanceActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule"] = projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1
            this.branchProtectionRule(BranchProtectionRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ReviewDismissalAllowanceActorResponseProjection): ReviewDismissalAllowanceResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ReviewDismissalAllowanceActorResponseProjection): ReviewDismissalAllowanceResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): ReviewDismissalAllowanceResponseProjection = branchProtectionRule(null, subProjection)

    fun branchProtectionRule(alias: String?, subProjection: BranchProtectionRuleResponseProjection): ReviewDismissalAllowanceResponseProjection {
        fields.add(GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun id(): ReviewDismissalAllowanceResponseProjection = id(null)

    fun id(alias: String?): ReviewDismissalAllowanceResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): ReviewDismissalAllowanceResponseProjection = typename(null)

    fun typename(alias: String?): ReviewDismissalAllowanceResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
