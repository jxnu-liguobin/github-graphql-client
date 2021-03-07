package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestTimelineItemsConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestTimelineItemsConnectionResponseProjection extends GraphQLResponseProjection {

    public PullRequestTimelineItemsConnectionResponseProjection() {
    }

    @Override
    public PullRequestTimelineItemsConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestTimelineItemsConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PullRequestTimelineItemsEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsEdgeResponseProjection.edges", 0)));
        }
        this.filteredCount();
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", 0) + 1);
            this.nodes(new PullRequestTimelineItemsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PullRequestTimelineItemsResponseProjection.nodes", 0)));
        }
        this.pageCount();
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.updatedAt();
        this.typename();
        return this;
    }

    public PullRequestTimelineItemsConnectionResponseProjection edges(PullRequestTimelineItemsEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PullRequestTimelineItemsConnectionResponseProjection edges(String alias, PullRequestTimelineItemsEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsConnectionResponseProjection filteredCount() {
        return filteredCount(null);
    }

    public PullRequestTimelineItemsConnectionResponseProjection filteredCount(String alias) {
        fields.add(new GraphQLResponseField("filteredCount").alias(alias));
        return this;
    }

    public PullRequestTimelineItemsConnectionResponseProjection nodes(PullRequestTimelineItemsResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PullRequestTimelineItemsConnectionResponseProjection nodes(String alias, PullRequestTimelineItemsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsConnectionResponseProjection pageCount() {
        return pageCount(null);
    }

    public PullRequestTimelineItemsConnectionResponseProjection pageCount(String alias) {
        fields.add(new GraphQLResponseField("pageCount").alias(alias));
        return this;
    }

    public PullRequestTimelineItemsConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PullRequestTimelineItemsConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestTimelineItemsConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PullRequestTimelineItemsConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PullRequestTimelineItemsConnectionResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public PullRequestTimelineItemsConnectionResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public PullRequestTimelineItemsConnectionResponseProjection typename() {
        return typename(null);
    }

    public PullRequestTimelineItemsConnectionResponseProjection typename(String alias) {
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
        final PullRequestTimelineItemsConnectionResponseProjection that = (PullRequestTimelineItemsConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
