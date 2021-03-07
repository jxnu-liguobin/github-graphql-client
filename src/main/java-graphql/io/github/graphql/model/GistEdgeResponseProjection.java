package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for GistEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class GistEdgeResponseProjection extends GraphQLResponseProjection {

    public GistEdgeResponseProjection() {
    }

    @Override
    public GistEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GistEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("GistEdgeResponseProjection.GistResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistEdgeResponseProjection.GistResponseProjection.node", projectionDepthOnFields.getOrDefault("GistEdgeResponseProjection.GistResponseProjection.node", 0) + 1);
            this.node(new GistResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistEdgeResponseProjection.GistResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public GistEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public GistEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public GistEdgeResponseProjection node(GistResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public GistEdgeResponseProjection node(String alias, GistResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public GistEdgeResponseProjection typename() {
        return typename(null);
    }

    public GistEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}