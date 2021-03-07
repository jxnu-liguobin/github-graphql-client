package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PublicKeyEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PublicKeyEdgeResponseProjection extends GraphQLResponseProjection {

    public PublicKeyEdgeResponseProjection() {
    }

    @Override
    public PublicKeyEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PublicKeyEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", projectionDepthOnFields.getOrDefault("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", 0) + 1);
            this.node(new PublicKeyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public PublicKeyEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PublicKeyEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PublicKeyEdgeResponseProjection node(PublicKeyResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PublicKeyEdgeResponseProjection node(String alias, PublicKeyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PublicKeyEdgeResponseProjection typename() {
        return typename(null);
    }

    public PublicKeyEdgeResponseProjection typename(String alias) {
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
        final PublicKeyEdgeResponseProjection that = (PublicKeyEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
