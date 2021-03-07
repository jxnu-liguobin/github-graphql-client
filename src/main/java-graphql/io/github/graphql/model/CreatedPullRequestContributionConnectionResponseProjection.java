package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedPullRequestContributionConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreatedPullRequestContributionConnectionResponseProjection extends GraphQLResponseProjection {

    public CreatedPullRequestContributionConnectionResponseProjection() {
    }

    @Override
    public CreatedPullRequestContributionConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedPullRequestContributionConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CreatedPullRequestContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", 0) + 1);
            this.nodes(new CreatedPullRequestContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public CreatedPullRequestContributionConnectionResponseProjection edges(CreatedPullRequestContributionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CreatedPullRequestContributionConnectionResponseProjection edges(String alias, CreatedPullRequestContributionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestContributionConnectionResponseProjection nodes(CreatedPullRequestContributionResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CreatedPullRequestContributionConnectionResponseProjection nodes(String alias, CreatedPullRequestContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestContributionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CreatedPullRequestContributionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestContributionConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CreatedPullRequestContributionConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CreatedPullRequestContributionConnectionResponseProjection typename() {
        return typename(null);
    }

    public CreatedPullRequestContributionConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
