package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreateBranchProtectionRulePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreateBranchProtectionRulePayloadResponseProjection extends GraphQLResponseProjection {

    public CreateBranchProtectionRulePayloadResponseProjection() {
    }

    @Override
    public CreateBranchProtectionRulePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreateBranchProtectionRulePayloadResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1);
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)));
        }
        this.clientMutationId();
        this.typename();
        return this;
    }

    public CreateBranchProtectionRulePayloadResponseProjection branchProtectionRule(BranchProtectionRuleResponseProjection subProjection) {
        return branchProtectionRule(null, subProjection);
    }

    public CreateBranchProtectionRulePayloadResponseProjection branchProtectionRule(String alias, BranchProtectionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public CreateBranchProtectionRulePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CreateBranchProtectionRulePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CreateBranchProtectionRulePayloadResponseProjection typename() {
        return typename(null);
    }

    public CreateBranchProtectionRulePayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
