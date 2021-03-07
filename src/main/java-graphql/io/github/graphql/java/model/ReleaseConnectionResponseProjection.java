package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReleaseConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReleaseConnectionResponseProjection extends GraphQLResponseProjection {

    public ReleaseConnectionResponseProjection() {
    }

    @Override
    public ReleaseConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReleaseConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ReleaseEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", 0) + 1);
            this.nodes(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ReleaseConnectionResponseProjection edges(ReleaseEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ReleaseConnectionResponseProjection edges(String alias, ReleaseEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseConnectionResponseProjection nodes(ReleaseResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ReleaseConnectionResponseProjection nodes(String alias, ReleaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ReleaseConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ReleaseConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ReleaseConnectionResponseProjection typename() {
        return typename(null);
    }

    public ReleaseConnectionResponseProjection typename(String alias) {
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
        final ReleaseConnectionResponseProjection that = (ReleaseConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
