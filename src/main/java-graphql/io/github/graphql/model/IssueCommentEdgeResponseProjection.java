package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueCommentEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueCommentEdgeResponseProjection extends GraphQLResponseProjection {

    public IssueCommentEdgeResponseProjection() {
    }

    @Override
    public IssueCommentEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueCommentEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", 0) + 1);
            this.node(new IssueCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public IssueCommentEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public IssueCommentEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public IssueCommentEdgeResponseProjection node(IssueCommentResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public IssueCommentEdgeResponseProjection node(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentEdgeResponseProjection typename() {
        return typename(null);
    }

    public IssueCommentEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
