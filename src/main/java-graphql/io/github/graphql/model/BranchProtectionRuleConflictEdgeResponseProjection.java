package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for BranchProtectionRuleConflictEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class BranchProtectionRuleConflictEdgeResponseProjection extends GraphQLResponseProjection {

    public BranchProtectionRuleConflictEdgeResponseProjection() {
    }

    @Override
    public BranchProtectionRuleConflictEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BranchProtectionRuleConflictEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", 0) + 1);
            this.node(new BranchProtectionRuleConflictResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public BranchProtectionRuleConflictEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public BranchProtectionRuleConflictEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public BranchProtectionRuleConflictEdgeResponseProjection node(BranchProtectionRuleConflictResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public BranchProtectionRuleConflictEdgeResponseProjection node(String alias, BranchProtectionRuleConflictResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConflictEdgeResponseProjection typename() {
        return typename(null);
    }

    public BranchProtectionRuleConflictEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
