package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PinnableItemConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PinnableItemConnectionResponseProjection extends GraphQLResponseProjection {

    public PinnableItemConnectionResponseProjection() {
    }

    @Override
    public PinnableItemConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PinnableItemConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PinnableItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", 0) + 1);
            this.nodes(new PinnableItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PinnableItemConnectionResponseProjection edges(PinnableItemEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PinnableItemConnectionResponseProjection edges(String alias, PinnableItemEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PinnableItemConnectionResponseProjection nodes(PinnableItemResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PinnableItemConnectionResponseProjection nodes(String alias, PinnableItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PinnableItemConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PinnableItemConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PinnableItemConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PinnableItemConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PinnableItemConnectionResponseProjection typename() {
        return typename(null);
    }

    public PinnableItemConnectionResponseProjection typename(String alias) {
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
        final PinnableItemConnectionResponseProjection that = (PinnableItemConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
