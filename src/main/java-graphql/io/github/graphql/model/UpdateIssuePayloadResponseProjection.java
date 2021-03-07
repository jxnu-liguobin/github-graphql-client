package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdateIssuePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdateIssuePayloadResponseProjection extends GraphQLResponseProjection {

    public UpdateIssuePayloadResponseProjection() {
    }

    @Override
    public UpdateIssuePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdateIssuePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1);
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateIssuePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateIssuePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateIssuePayloadResponseProjection issue(IssueResponseProjection subProjection) {
        return issue(null, subProjection);
    }

    public UpdateIssuePayloadResponseProjection issue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateIssuePayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateIssuePayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
