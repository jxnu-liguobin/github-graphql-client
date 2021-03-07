package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ExternalIdentityConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ExternalIdentityConnectionResponseProjection extends GraphQLResponseProjection {

    public ExternalIdentityConnectionResponseProjection() {
    }

    @Override
    public ExternalIdentityConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ExternalIdentityConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ExternalIdentityEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", 0) + 1);
            this.nodes(new ExternalIdentityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ExternalIdentityConnectionResponseProjection edges(ExternalIdentityEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ExternalIdentityConnectionResponseProjection edges(String alias, ExternalIdentityEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ExternalIdentityConnectionResponseProjection nodes(ExternalIdentityResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ExternalIdentityConnectionResponseProjection nodes(String alias, ExternalIdentityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ExternalIdentityConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ExternalIdentityConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ExternalIdentityConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ExternalIdentityConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ExternalIdentityConnectionResponseProjection typename() {
        return typename(null);
    }

    public ExternalIdentityConnectionResponseProjection typename(String alias) {
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
        final ExternalIdentityConnectionResponseProjection that = (ExternalIdentityConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
