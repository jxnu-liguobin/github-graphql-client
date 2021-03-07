package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestReviewCommentConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestReviewCommentConnectionResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewCommentConnectionResponseProjection() {
    }

    @Override
    public PullRequestReviewCommentConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewCommentConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PullRequestReviewCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", 0) + 1);
            this.nodes(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PullRequestReviewCommentConnectionResponseProjection edges(PullRequestReviewCommentEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PullRequestReviewCommentConnectionResponseProjection edges(String alias, PullRequestReviewCommentEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentConnectionResponseProjection nodes(PullRequestReviewCommentResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PullRequestReviewCommentConnectionResponseProjection nodes(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PullRequestReviewCommentConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PullRequestReviewCommentConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PullRequestReviewCommentConnectionResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewCommentConnectionResponseProjection typename(String alias) {
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
        final PullRequestReviewCommentConnectionResponseProjection that = (PullRequestReviewCommentConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
