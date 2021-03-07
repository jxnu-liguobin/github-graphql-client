package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReopenIssuePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ReopenIssuePayloadResponseProjection extends GraphQLResponseProjection {

    public ReopenIssuePayloadResponseProjection() {
    }

    @Override
    public ReopenIssuePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReopenIssuePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("ReopenIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReopenIssuePayloadResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("ReopenIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1);
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReopenIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)));
        }
        this.typename();
        return this;
    }

    public ReopenIssuePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public ReopenIssuePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public ReopenIssuePayloadResponseProjection issue(IssueResponseProjection subProjection) {
        return issue(null, subProjection);
    }

    public ReopenIssuePayloadResponseProjection issue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection));
        return this;
    }

    public ReopenIssuePayloadResponseProjection typename() {
        return typename(null);
    }

    public ReopenIssuePayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
