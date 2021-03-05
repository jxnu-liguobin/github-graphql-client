package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateBranchProtectionRulePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateBranchProtectionRulePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateBranchProtectionRulePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateBranchProtectionRulePayloadResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule"] = projectionDepthOnFields.getOrDefault("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1
            this.branchProtectionRule(BranchProtectionRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        this.clientMutationId()
        this.typename()
        return this
    }

    fun branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): UpdateBranchProtectionRulePayloadResponseProjection = branchProtectionRule(null, subProjection)

    fun branchProtectionRule(alias: String?, subProjection: BranchProtectionRuleResponseProjection): UpdateBranchProtectionRulePayloadResponseProjection {
        fields.add(GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun clientMutationId(): UpdateBranchProtectionRulePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateBranchProtectionRulePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun typename(): UpdateBranchProtectionRulePayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateBranchProtectionRulePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
