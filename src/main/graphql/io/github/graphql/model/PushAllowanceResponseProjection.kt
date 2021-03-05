package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PushAllowance
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PushAllowanceResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PushAllowanceResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PushAllowanceResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", 0) + 1
            this.actor(PushAllowanceActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields["PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule"] = projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1
            this.branchProtectionRule(BranchProtectionRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: PushAllowanceActorResponseProjection): PushAllowanceResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: PushAllowanceActorResponseProjection): PushAllowanceResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): PushAllowanceResponseProjection = branchProtectionRule(null, subProjection)

    fun branchProtectionRule(alias: String?, subProjection: BranchProtectionRuleResponseProjection): PushAllowanceResponseProjection {
        fields.add(GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun id(): PushAllowanceResponseProjection = id(null)

    fun id(alias: String?): PushAllowanceResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): PushAllowanceResponseProjection = typename(null)

    fun typename(alias: String?): PushAllowanceResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
