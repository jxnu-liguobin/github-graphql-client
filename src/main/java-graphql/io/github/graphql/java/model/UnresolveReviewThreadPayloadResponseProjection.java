package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for UnresolveReviewThreadPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UnresolveReviewThreadPayloadResponseProjection extends GraphQLResponseProjection {

    public UnresolveReviewThreadPayloadResponseProjection() {
    }

    @Override
    public UnresolveReviewThreadPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnresolveReviewThreadPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", projectionDepthOnFields.getOrDefault("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) + 1);
            this.thread(new PullRequestReviewThreadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0)));
        }
        this.typename();
        return this;
    }

    public UnresolveReviewThreadPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UnresolveReviewThreadPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UnresolveReviewThreadPayloadResponseProjection thread(PullRequestReviewThreadResponseProjection subProjection) {
        return thread(null, subProjection);
    }

    public UnresolveReviewThreadPayloadResponseProjection thread(String alias, PullRequestReviewThreadResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("thread").alias(alias).projection(subProjection));
        return this;
    }

    public UnresolveReviewThreadPayloadResponseProjection typename() {
        return typename(null);
    }

    public UnresolveReviewThreadPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UnresolveReviewThreadPayloadResponseProjection that = (UnresolveReviewThreadPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
