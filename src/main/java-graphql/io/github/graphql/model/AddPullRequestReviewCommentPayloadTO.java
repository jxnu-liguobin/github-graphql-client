package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class AddPullRequestReviewCommentPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestReviewCommentTO comment;
    private PullRequestReviewCommentEdgeTO commentEdge;

    public AddPullRequestReviewCommentPayloadTO() {
    }

    public AddPullRequestReviewCommentPayloadTO(String clientMutationId, PullRequestReviewCommentTO comment, PullRequestReviewCommentEdgeTO commentEdge) {
        this.clientMutationId = clientMutationId;
        this.comment = comment;
        this.commentEdge = commentEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public PullRequestReviewCommentTO getComment() {
        return comment;
    }

    public PullRequestReviewCommentEdgeTO getCommentEdge() {
        return commentEdge;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (comment != null) {
            joiner.add("comment: " + GraphQLRequestSerializer.getEntry(comment));
        }
        if (commentEdge != null) {
            joiner.add("commentEdge: " + GraphQLRequestSerializer.getEntry(commentEdge));
        }
        return joiner.toString();
    }

    public static AddPullRequestReviewCommentPayloadTO.Builder builder() {
        return new AddPullRequestReviewCommentPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private PullRequestReviewCommentTO comment;
        private PullRequestReviewCommentEdgeTO commentEdge;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setComment(PullRequestReviewCommentTO comment) {
            this.comment = comment;
            return this;
        }

        public Builder setCommentEdge(PullRequestReviewCommentEdgeTO commentEdge) {
            this.commentEdge = commentEdge;
            return this;
        }


        public AddPullRequestReviewCommentPayloadTO build() {
            return new AddPullRequestReviewCommentPayloadTO(clientMutationId, comment, commentEdge);
        }

    }
}
