package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for BranchProtectionRuleConflict
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class BranchProtectionRuleConflictResponseProjection extends GraphQLResponseProjection {

    public BranchProtectionRuleConflictResponseProjection() {
    }

    @Override
    public BranchProtectionRuleConflictResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BranchProtectionRuleConflictResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1);
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", 0) + 1);
            this.conflictingBranchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.BranchProtectionRuleResponseProjection.conflictingBranchProtectionRule", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", 0) + 1);
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictResponseProjection.RefResponseProjection.ref", 0)));
        }
        this.typename();
        return this;
    }

    public BranchProtectionRuleConflictResponseProjection branchProtectionRule(BranchProtectionRuleResponseProjection subProjection) {
        return branchProtectionRule(null, subProjection);
    }

    public BranchProtectionRuleConflictResponseProjection branchProtectionRule(String alias, BranchProtectionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConflictResponseProjection conflictingBranchProtectionRule(BranchProtectionRuleResponseProjection subProjection) {
        return conflictingBranchProtectionRule(null, subProjection);
    }

    public BranchProtectionRuleConflictResponseProjection conflictingBranchProtectionRule(String alias, BranchProtectionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("conflictingBranchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConflictResponseProjection ref(RefResponseProjection subProjection) {
        return ref(null, subProjection);
    }

    public BranchProtectionRuleConflictResponseProjection ref(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConflictResponseProjection typename() {
        return typename(null);
    }

    public BranchProtectionRuleConflictResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
