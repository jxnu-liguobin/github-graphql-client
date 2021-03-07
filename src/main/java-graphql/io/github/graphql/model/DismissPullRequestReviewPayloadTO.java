package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DismissPullRequestReviewPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestReviewTO pullRequestReview;

    public DismissPullRequestReviewPayloadTO() {
    }

    public DismissPullRequestReviewPayloadTO(String clientMutationId, PullRequestReviewTO pullRequestReview) {
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

    public static DismissPullRequestReviewPayloadTO.Builder builder() {
        return new DismissPullRequestReviewPayloadTO.Builder();
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


        public DismissPullRequestReviewPayloadTO build() {
            return new DismissPullRequestReviewPayloadTO(clientMutationId, pullRequestReview);
        }

    }
}
