package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReviewDismissalAllowance
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReviewDismissalAllowanceResponseProjection extends GraphQLResponseProjection {

    public ReviewDismissalAllowanceResponseProjection() {
    }

    @Override
    public ReviewDismissalAllowanceResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewDismissalAllowanceResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", 0) + 1);
            this.actor(new ReviewDismissalAllowanceActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1);
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)));
        }
        this.id();
        this.typename();
        return this;
    }

    public ReviewDismissalAllowanceResponseProjection actor(ReviewDismissalAllowanceActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public ReviewDismissalAllowanceResponseProjection actor(String alias, ReviewDismissalAllowanceActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissalAllowanceResponseProjection branchProtectionRule(BranchProtectionRuleResponseProjection subProjection) {
        return branchProtectionRule(null, subProjection);
    }

    public ReviewDismissalAllowanceResponseProjection branchProtectionRule(String alias, BranchProtectionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissalAllowanceResponseProjection id() {
        return id(null);
    }

    public ReviewDismissalAllowanceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReviewDismissalAllowanceResponseProjection typename() {
        return typename(null);
    }

    public ReviewDismissalAllowanceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
