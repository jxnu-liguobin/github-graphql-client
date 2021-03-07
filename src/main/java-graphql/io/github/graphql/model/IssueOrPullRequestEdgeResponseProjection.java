package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueOrPullRequestEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueOrPullRequestEdgeResponseProjection extends GraphQLResponseProjection {

    public IssueOrPullRequestEdgeResponseProjection() {
    }

    @Override
    public IssueOrPullRequestEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueOrPullRequestEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", 0) + 1);
            this.node(new IssueOrPullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public IssueOrPullRequestEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public IssueOrPullRequestEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public IssueOrPullRequestEdgeResponseProjection node(IssueOrPullRequestResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public IssueOrPullRequestEdgeResponseProjection node(String alias, IssueOrPullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public IssueOrPullRequestEdgeResponseProjection typename() {
        return typename(null);
    }

    public IssueOrPullRequestEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
