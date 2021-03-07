package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for BranchProtectionRuleEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class BranchProtectionRuleEdgeResponseProjection extends GraphQLResponseProjection {

    public BranchProtectionRuleEdgeResponseProjection() {
    }

    @Override
    public BranchProtectionRuleEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BranchProtectionRuleEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", projectionDepthOnFields.getOrDefault("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", 0) + 1);
            this.node(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public BranchProtectionRuleEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public BranchProtectionRuleEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public BranchProtectionRuleEdgeResponseProjection node(BranchProtectionRuleResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public BranchProtectionRuleEdgeResponseProjection node(String alias, BranchProtectionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleEdgeResponseProjection typename() {
        return typename(null);
    }

    public BranchProtectionRuleEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
