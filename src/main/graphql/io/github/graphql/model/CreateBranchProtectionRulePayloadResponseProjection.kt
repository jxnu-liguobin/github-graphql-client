package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreateBranchProtectionRulePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreateBranchProtectionRulePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreateBranchProtectionRulePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreateBranchProtectionRulePayloadResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields["CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule"] = projectionDepthOnFields.getOrDefault("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1
            this.branchProtectionRule(BranchProtectionRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        this.clientMutationId()
        this.typename()
        return this
    }

    fun branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): CreateBranchProtectionRulePayloadResponseProjection = branchProtectionRule(null, subProjection)

    fun branchProtectionRule(alias: String?, subProjection: BranchProtectionRuleResponseProjection): CreateBranchProtectionRulePayloadResponseProjection {
        fields.add(GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        return this
    }

    fun clientMutationId(): CreateBranchProtectionRulePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): CreateBranchProtectionRulePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun typename(): CreateBranchProtectionRulePayloadResponseProjection = typename(null)

    fun typename(alias: String?): CreateBranchProtectionRulePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
