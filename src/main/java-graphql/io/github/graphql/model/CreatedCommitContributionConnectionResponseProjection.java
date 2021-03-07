package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedCommitContributionConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreatedCommitContributionConnectionResponseProjection extends GraphQLResponseProjection {

    public CreatedCommitContributionConnectionResponseProjection() {
    }

    @Override
    public CreatedCommitContributionConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedCommitContributionConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CreatedCommitContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", 0) + 1);
            this.nodes(new CreatedCommitContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public CreatedCommitContributionConnectionResponseProjection edges(CreatedCommitContributionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CreatedCommitContributionConnectionResponseProjection edges(String alias, CreatedCommitContributionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedCommitContributionConnectionResponseProjection nodes(CreatedCommitContributionResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CreatedCommitContributionConnectionResponseProjection nodes(String alias, CreatedCommitContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedCommitContributionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CreatedCommitContributionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedCommitContributionConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CreatedCommitContributionConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CreatedCommitContributionConnectionResponseProjection typename() {
        return typename(null);
    }

    public CreatedCommitContributionConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
