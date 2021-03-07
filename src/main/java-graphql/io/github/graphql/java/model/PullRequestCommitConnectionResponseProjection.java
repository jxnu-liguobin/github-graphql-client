package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestCommitConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestCommitConnectionResponseProjection extends GraphQLResponseProjection {

    public PullRequestCommitConnectionResponseProjection() {
    }

    @Override
    public PullRequestCommitConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestCommitConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PullRequestCommitEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", 0) + 1);
            this.nodes(new PullRequestCommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PullRequestCommitConnectionResponseProjection edges(PullRequestCommitEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PullRequestCommitConnectionResponseProjection edges(String alias, PullRequestCommitEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitConnectionResponseProjection nodes(PullRequestCommitResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PullRequestCommitConnectionResponseProjection nodes(String alias, PullRequestCommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PullRequestCommitConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestCommitConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PullRequestCommitConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PullRequestCommitConnectionResponseProjection typename() {
        return typename(null);
    }

    public PullRequestCommitConnectionResponseProjection typename(String alias) {
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
        final PullRequestCommitConnectionResponseProjection that = (PullRequestCommitConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
