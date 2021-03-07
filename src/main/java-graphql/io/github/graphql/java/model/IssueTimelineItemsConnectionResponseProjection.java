package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for IssueTimelineItemsConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class IssueTimelineItemsConnectionResponseProjection extends GraphQLResponseProjection {

    public IssueTimelineItemsConnectionResponseProjection() {
    }

    @Override
    public IssueTimelineItemsConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueTimelineItemsConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", 0) + 1);
            this.edges(new IssueTimelineItemsEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", 0)));
        }
        this.filteredCount();
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", 0) + 1);
            this.nodes(new IssueTimelineItemsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", 0)));
        }
        this.pageCount();
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.updatedAt();
        this.typename();
        return this;
    }

    public IssueTimelineItemsConnectionResponseProjection edges(IssueTimelineItemsEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public IssueTimelineItemsConnectionResponseProjection edges(String alias, IssueTimelineItemsEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsConnectionResponseProjection filteredCount() {
        return filteredCount(null);
    }

    public IssueTimelineItemsConnectionResponseProjection filteredCount(String alias) {
        fields.add(new GraphQLResponseField("filteredCount").alias(alias));
        return this;
    }

    public IssueTimelineItemsConnectionResponseProjection nodes(IssueTimelineItemsResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public IssueTimelineItemsConnectionResponseProjection nodes(String alias, IssueTimelineItemsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsConnectionResponseProjection pageCount() {
        return pageCount(null);
    }

    public IssueTimelineItemsConnectionResponseProjection pageCount(String alias) {
        fields.add(new GraphQLResponseField("pageCount").alias(alias));
        return this;
    }

    public IssueTimelineItemsConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public IssueTimelineItemsConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public IssueTimelineItemsConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public IssueTimelineItemsConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public IssueTimelineItemsConnectionResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public IssueTimelineItemsConnectionResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public IssueTimelineItemsConnectionResponseProjection typename() {
        return typename(null);
    }

    public IssueTimelineItemsConnectionResponseProjection typename(String alias) {
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
        final IssueTimelineItemsConnectionResponseProjection that = (IssueTimelineItemsConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
