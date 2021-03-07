package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestConnectionResponseProjection extends GraphQLResponseProjection {

    public PullRequestConnectionResponseProjection() {
    }

    @Override
    public PullRequestConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestConnectionResponseProjection.PullRequestEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PullRequestEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestConnectionResponseProjection.PullRequestResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestResponseProjection.nodes", 0) + 1);
            this.nodes(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PullRequestConnectionResponseProjection edges(PullRequestEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PullRequestConnectionResponseProjection edges(String alias, PullRequestEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestConnectionResponseProjection nodes(PullRequestResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PullRequestConnectionResponseProjection nodes(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PullRequestConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PullRequestConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PullRequestConnectionResponseProjection typename() {
        return typename(null);
    }

    public PullRequestConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
