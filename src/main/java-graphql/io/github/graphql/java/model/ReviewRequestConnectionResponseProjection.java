package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReviewRequestConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReviewRequestConnectionResponseProjection extends GraphQLResponseProjection {

    public ReviewRequestConnectionResponseProjection() {
    }

    @Override
    public ReviewRequestConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewRequestConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ReviewRequestEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", 0) + 1);
            this.nodes(new ReviewRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ReviewRequestConnectionResponseProjection edges(ReviewRequestEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ReviewRequestConnectionResponseProjection edges(String alias, ReviewRequestEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestConnectionResponseProjection nodes(ReviewRequestResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ReviewRequestConnectionResponseProjection nodes(String alias, ReviewRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ReviewRequestConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewRequestConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ReviewRequestConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ReviewRequestConnectionResponseProjection typename() {
        return typename(null);
    }

    public ReviewRequestConnectionResponseProjection typename(String alias) {
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
        final ReviewRequestConnectionResponseProjection that = (ReviewRequestConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
