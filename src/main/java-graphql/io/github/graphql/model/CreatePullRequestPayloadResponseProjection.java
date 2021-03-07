package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatePullRequestPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreatePullRequestPayloadResponseProjection extends GraphQLResponseProjection {

    public CreatePullRequestPayloadResponseProjection() {
    }

    @Override
    public CreatePullRequestPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatePullRequestPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.typename();
        return this;
    }

    public CreatePullRequestPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CreatePullRequestPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CreatePullRequestPayloadResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public CreatePullRequestPayloadResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public CreatePullRequestPayloadResponseProjection typename() {
        return typename(null);
    }

    public CreatePullRequestPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
