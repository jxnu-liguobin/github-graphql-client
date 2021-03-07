package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for BranchProtectionRuleConflictConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class BranchProtectionRuleConflictConnectionResponseProjection extends GraphQLResponseProjection {

    public BranchProtectionRuleConflictConnectionResponseProjection() {
    }

    @Override
    public BranchProtectionRuleConflictConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BranchProtectionRuleConflictConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", 0) + 1);
            this.edges(new BranchProtectionRuleConflictEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", 0) + 1);
            this.nodes(new BranchProtectionRuleConflictResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.BranchProtectionRuleConflictResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public BranchProtectionRuleConflictConnectionResponseProjection edges(BranchProtectionRuleConflictEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public BranchProtectionRuleConflictConnectionResponseProjection edges(String alias, BranchProtectionRuleConflictEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConflictConnectionResponseProjection nodes(BranchProtectionRuleConflictResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public BranchProtectionRuleConflictConnectionResponseProjection nodes(String alias, BranchProtectionRuleConflictResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConflictConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public BranchProtectionRuleConflictConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleConflictConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public BranchProtectionRuleConflictConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public BranchProtectionRuleConflictConnectionResponseProjection typename() {
        return typename(null);
    }

    public BranchProtectionRuleConflictConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BranchProtectionRuleConflictConnectionResponseProjection that = (BranchProtectionRuleConflictConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
