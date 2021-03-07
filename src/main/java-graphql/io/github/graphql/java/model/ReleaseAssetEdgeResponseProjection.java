package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReleaseAssetEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReleaseAssetEdgeResponseProjection extends GraphQLResponseProjection {

    public ReleaseAssetEdgeResponseProjection() {
    }

    @Override
    public ReleaseAssetEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReleaseAssetEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", projectionDepthOnFields.getOrDefault("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", 0) + 1);
            this.node(new ReleaseAssetResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetEdgeResponseProjection.ReleaseAssetResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ReleaseAssetEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ReleaseAssetEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ReleaseAssetEdgeResponseProjection node(ReleaseAssetResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ReleaseAssetEdgeResponseProjection node(String alias, ReleaseAssetResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseAssetEdgeResponseProjection typename() {
        return typename(null);
    }

    public ReleaseAssetEdgeResponseProjection typename(String alias) {
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
        final ReleaseAssetEdgeResponseProjection that = (ReleaseAssetEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
