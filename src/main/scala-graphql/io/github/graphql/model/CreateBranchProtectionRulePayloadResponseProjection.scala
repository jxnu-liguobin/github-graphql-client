package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreateBranchProtectionRulePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateBranchProtectionRulePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreateBranchProtectionRulePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreateBranchProtectionRulePayloadResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1)
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        this.clientMutationId()
        this.typename()
        this
    }

    def branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): CreateBranchProtectionRulePayloadResponseProjection = {
        branchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def branchProtectionRule(alias: String, subProjection: BranchProtectionRuleResponseProjection): CreateBranchProtectionRulePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def clientMutationId(): CreateBranchProtectionRulePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): CreateBranchProtectionRulePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def typename(): CreateBranchProtectionRulePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreateBranchProtectionRulePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
