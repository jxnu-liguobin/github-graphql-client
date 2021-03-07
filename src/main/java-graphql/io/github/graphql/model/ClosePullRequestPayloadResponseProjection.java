package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ClosePullRequestPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ClosePullRequestPayloadResponseProjection extends GraphQLResponseProjection {

    public ClosePullRequestPayloadResponseProjection() {
    }

    @Override
    public ClosePullRequestPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ClosePullRequestPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("ClosePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClosePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ClosePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClosePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.typename();
        return this;
    }

    public ClosePullRequestPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public ClosePullRequestPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public ClosePullRequestPayloadResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public ClosePullRequestPayloadResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ClosePullRequestPayloadResponseProjection typename() {
        return typename(null);
    }

    public ClosePullRequestPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
