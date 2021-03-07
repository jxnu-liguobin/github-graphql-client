package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ResolveReviewThreadPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ResolveReviewThreadPayloadResponseProjection extends GraphQLResponseProjection {

    public ResolveReviewThreadPayloadResponseProjection() {
    }

    @Override
    public ResolveReviewThreadPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ResolveReviewThreadPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", projectionDepthOnFields.getOrDefault("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) + 1);
            this.thread(new PullRequestReviewThreadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0)));
        }
        this.typename();
        return this;
    }

    public ResolveReviewThreadPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public ResolveReviewThreadPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public ResolveReviewThreadPayloadResponseProjection thread(PullRequestReviewThreadResponseProjection subProjection) {
        return thread(null, subProjection);
    }

    public ResolveReviewThreadPayloadResponseProjection thread(String alias, PullRequestReviewThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("thread").alias(alias).projection(subProjection));
        return this;
    }

    public ResolveReviewThreadPayloadResponseProjection typename() {
        return typename(null);
    }

    public ResolveReviewThreadPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
