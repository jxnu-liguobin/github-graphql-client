package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueEdgeResponseProjection extends GraphQLResponseProjection {

    public IssueEdgeResponseProjection() {
    }

    @Override
    public IssueEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("IssueEdgeResponseProjection.IssueResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueEdgeResponseProjection.IssueResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueEdgeResponseProjection.IssueResponseProjection.node", 0) + 1);
            this.node(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueEdgeResponseProjection.IssueResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public IssueEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public IssueEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public IssueEdgeResponseProjection node(IssueResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public IssueEdgeResponseProjection node(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public IssueEdgeResponseProjection typename() {
        return typename(null);
    }

    public IssueEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
