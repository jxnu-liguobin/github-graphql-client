package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RefConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RefConnectionResponseProjection extends GraphQLResponseProjection {

    public RefConnectionResponseProjection() {
    }

    @Override
    public RefConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RefConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RefEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefConnectionResponseProjection.RefResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefResponseProjection.nodes", 0) + 1);
            this.nodes(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public RefConnectionResponseProjection edges(RefEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RefConnectionResponseProjection edges(String alias, RefEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RefConnectionResponseProjection nodes(RefResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RefConnectionResponseProjection nodes(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RefConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RefConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RefConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RefConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RefConnectionResponseProjection typename() {
        return typename(null);
    }

    public RefConnectionResponseProjection typename(String alias) {
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
        final RefConnectionResponseProjection that = (RefConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
