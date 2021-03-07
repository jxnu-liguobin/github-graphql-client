package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PublicKeyConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PublicKeyConnectionResponseProjection extends GraphQLResponseProjection {

    public PublicKeyConnectionResponseProjection() {
    }

    @Override
    public PublicKeyConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PublicKeyConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PublicKeyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", 0) + 1);
            this.nodes(new PublicKeyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PublicKeyConnectionResponseProjection edges(PublicKeyEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PublicKeyConnectionResponseProjection edges(String alias, PublicKeyEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PublicKeyConnectionResponseProjection nodes(PublicKeyResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PublicKeyConnectionResponseProjection nodes(String alias, PublicKeyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PublicKeyConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PublicKeyConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PublicKeyConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PublicKeyConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PublicKeyConnectionResponseProjection typename() {
        return typename(null);
    }

    public PublicKeyConnectionResponseProjection typename(String alias) {
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
        final PublicKeyConnectionResponseProjection that = (PublicKeyConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
