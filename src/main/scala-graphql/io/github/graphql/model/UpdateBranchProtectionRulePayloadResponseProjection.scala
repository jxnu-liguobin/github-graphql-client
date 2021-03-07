package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateBranchProtectionRulePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateBranchProtectionRulePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdateBranchProtectionRulePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdateBranchProtectionRulePayloadResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1)
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        this.clientMutationId()
        this.typename()
        this
    }

    def branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): UpdateBranchProtectionRulePayloadResponseProjection = {
        branchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def branchProtectionRule(alias: String, subProjection: BranchProtectionRuleResponseProjection): UpdateBranchProtectionRulePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def clientMutationId(): UpdateBranchProtectionRulePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdateBranchProtectionRulePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def typename(): UpdateBranchProtectionRulePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdateBranchProtectionRulePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
