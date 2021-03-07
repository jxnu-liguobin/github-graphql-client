package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeletePullRequestReviewCommentPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestReviewTO pullRequestReview;

    public DeletePullRequestReviewCommentPayloadTO() {
    }

    public DeletePullRequestReviewCommentPayloadTO(String clientMutationId, PullRequestReviewTO pullRequestReview) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReview = pullRequestReview;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public PullRequestReviewTO getPullRequestReview() {
        return pullRequestReview;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeletePullRequestReviewCommentPayloadTO that = (DeletePullRequestReviewCommentPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(pullRequestReview, that.pullRequestReview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, pullRequestReview);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (pullRequestReview != null) {
            joiner.add("pullRequestReview: " + GraphQLRequestSerializer.getEntry(pullRequestReview));
        }
        return joiner.toString();
    }

    public static DeletePullRequestReviewCommentPayloadTO.Builder builder() {
        return new DeletePullRequestReviewCommentPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private PullRequestReviewTO pullRequestReview;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setPullRequestReview(PullRequestReviewTO pullRequestReview) {
            this.pullRequestReview = pullRequestReview;
            return this;
        }


        public DeletePullRequestReviewCommentPayloadTO build() {
            return new DeletePullRequestReviewCommentPayloadTO(clientMutationId, pullRequestReview);
        }

    }
}
