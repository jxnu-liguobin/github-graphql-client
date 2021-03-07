package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for AddPullRequestReviewCommentPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddPullRequestReviewCommentPayloadResponseProjection extends GraphQLResponseProjection {

    public AddPullRequestReviewCommentPayloadResponseProjection() {
    }

    @Override
    public AddPullRequestReviewCommentPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddPullRequestReviewCommentPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", 0) + 1);
            this.comment(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.comment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", 0) + 1);
            this.commentEdge(new PullRequestReviewCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddPullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentEdgeResponseProjection.commentEdge", 0)));
        }
        this.typename();
        return this;
    }

    public AddPullRequestReviewCommentPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AddPullRequestReviewCommentPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AddPullRequestReviewCommentPayloadResponseProjection comment(PullRequestReviewCommentResponseProjection subProjection) {
        return comment(null, subProjection);
    }

    public AddPullRequestReviewCommentPayloadResponseProjection comment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comment").alias(alias).projection(subProjection));
        return this;
    }

    public AddPullRequestReviewCommentPayloadResponseProjection commentEdge(PullRequestReviewCommentEdgeResponseProjection subProjection) {
        return commentEdge(null, subProjection);
    }

    public AddPullRequestReviewCommentPayloadResponseProjection commentEdge(String alias, PullRequestReviewCommentEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commentEdge").alias(alias).projection(subProjection));
        return this;
    }

    public AddPullRequestReviewCommentPayloadResponseProjection typename() {
        return typename(null);
    }

    public AddPullRequestReviewCommentPayloadResponseProjection typename(String alias) {
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
        final AddPullRequestReviewCommentPayloadResponseProjection that = (AddPullRequestReviewCommentPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
