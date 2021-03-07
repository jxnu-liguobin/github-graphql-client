package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CommitCommentEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitCommentEdgeResponseProjection extends GraphQLResponseProjection {

    public CommitCommentEdgeResponseProjection() {
    }

    @Override
    public CommitCommentEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommitCommentEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", projectionDepthOnFields.getOrDefault("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", 0) + 1);
            this.node(new CommitCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CommitCommentEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CommitCommentEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CommitCommentEdgeResponseProjection node(CommitCommentResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CommitCommentEdgeResponseProjection node(String alias, CommitCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentEdgeResponseProjection typename() {
        return typename(null);
    }

    public CommitCommentEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
