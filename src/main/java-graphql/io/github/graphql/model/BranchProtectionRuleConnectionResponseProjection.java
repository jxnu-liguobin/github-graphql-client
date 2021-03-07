package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for BranchProtectionRuleConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class BranchProtectionRuleConnectionResponseProjection extends GraphQLResponseProjection {

    public BranchProtectionRuleConnectionResponseProjection() {
    }

    @Override
    public BranchProtectionRuleConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BranchProtectionRuleConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", 0) + 1);
            this.edges(new BranchProtectionRuleEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", 0) + 1);
            this.nodes(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.BranchProtectionRuleResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public BranchProtectionRuleConnectionResponseProjection edges(BranchProtectionRuleEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public BranchProtectionRuleConnectionResponseProjection edges(String alias, BranchProtectionRuleEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConnectionResponseProjection nodes(BranchProtectionRuleResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public BranchProtectionRuleConnectionResponseProjection nodes(String alias, BranchProtectionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public BranchProtectionRuleConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public BranchProtectionRuleConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public BranchProtectionRuleConnectionResponseProjection typename() {
        return typename(null);
    }

    public BranchProtectionRuleConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
