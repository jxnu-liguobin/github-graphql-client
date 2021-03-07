package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for GistCommentEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class GistCommentEdgeResponseProjection extends GraphQLResponseProjection {

    public GistCommentEdgeResponseProjection() {
    }

    @Override
    public GistCommentEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GistCommentEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", projectionDepthOnFields.getOrDefault("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", 0) + 1);
            this.node(new GistCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentEdgeResponseProjection.GistCommentResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public GistCommentEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public GistCommentEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public GistCommentEdgeResponseProjection node(GistCommentResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public GistCommentEdgeResponseProjection node(String alias, GistCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public GistCommentEdgeResponseProjection typename() {
        return typename(null);
    }

    public GistCommentEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
