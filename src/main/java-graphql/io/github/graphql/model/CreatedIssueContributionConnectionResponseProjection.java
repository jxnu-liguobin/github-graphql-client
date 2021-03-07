package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedIssueContributionConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreatedIssueContributionConnectionResponseProjection extends GraphQLResponseProjection {

    public CreatedIssueContributionConnectionResponseProjection() {
    }

    @Override
    public CreatedIssueContributionConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedIssueContributionConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CreatedIssueContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", 0) + 1);
            this.nodes(new CreatedIssueContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public CreatedIssueContributionConnectionResponseProjection edges(CreatedIssueContributionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CreatedIssueContributionConnectionResponseProjection edges(String alias, CreatedIssueContributionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedIssueContributionConnectionResponseProjection nodes(CreatedIssueContributionResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CreatedIssueContributionConnectionResponseProjection nodes(String alias, CreatedIssueContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedIssueContributionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CreatedIssueContributionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedIssueContributionConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CreatedIssueContributionConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CreatedIssueContributionConnectionResponseProjection typename() {
        return typename(null);
    }

    public CreatedIssueContributionConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
