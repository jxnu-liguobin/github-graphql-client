package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MergePullRequestPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MergePullRequestPayloadResponseProjection extends GraphQLResponseProjection {

    public MergePullRequestPayloadResponseProjection() {
    }

    @Override
    public MergePullRequestPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MergePullRequestPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("MergePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("MergePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.typename();
        return this;
    }

    public MergePullRequestPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public MergePullRequestPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public MergePullRequestPayloadResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public MergePullRequestPayloadResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public MergePullRequestPayloadResponseProjection typename() {
        return typename(null);
    }

    public MergePullRequestPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
