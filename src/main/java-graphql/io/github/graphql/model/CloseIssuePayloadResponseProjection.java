package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CloseIssuePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CloseIssuePayloadResponseProjection extends GraphQLResponseProjection {

    public CloseIssuePayloadResponseProjection() {
    }

    @Override
    public CloseIssuePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CloseIssuePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1);
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CloseIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)));
        }
        this.typename();
        return this;
    }

    public CloseIssuePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CloseIssuePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CloseIssuePayloadResponseProjection issue(IssueResponseProjection subProjection) {
        return issue(null, subProjection);
    }

    public CloseIssuePayloadResponseProjection issue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection));
        return this;
    }

    public CloseIssuePayloadResponseProjection typename() {
        return typename(null);
    }

    public CloseIssuePayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}