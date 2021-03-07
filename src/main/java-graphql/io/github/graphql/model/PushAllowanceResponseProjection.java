package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PushAllowance
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PushAllowanceResponseProjection extends GraphQLResponseProjection {

    public PushAllowanceResponseProjection() {
    }

    @Override
    public PushAllowanceResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PushAllowanceResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", 0) + 1);
            this.actor(new PushAllowanceActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1);
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)));
        }
        this.id();
        this.typename();
        return this;
    }

    public PushAllowanceResponseProjection actor(PushAllowanceActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public PushAllowanceResponseProjection actor(String alias, PushAllowanceActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public PushAllowanceResponseProjection branchProtectionRule(BranchProtectionRuleResponseProjection subProjection) {
        return branchProtectionRule(null, subProjection);
    }

    public PushAllowanceResponseProjection branchProtectionRule(String alias, BranchProtectionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public PushAllowanceResponseProjection id() {
        return id(null);
    }

    public PushAllowanceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PushAllowanceResponseProjection typename() {
        return typename(null);
    }

    public PushAllowanceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
