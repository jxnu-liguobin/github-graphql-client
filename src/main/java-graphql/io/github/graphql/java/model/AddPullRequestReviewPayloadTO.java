package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddPullRequestReviewPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestReviewTO pullRequestReview;
    private PullRequestReviewEdgeTO reviewEdge;

    public AddPullRequestReviewPayloadTO() {
    }

    public AddPullRequestReviewPayloadTO(String clientMutationId, PullRequestReviewTO pullRequestReview, PullRequestReviewEdgeTO reviewEdge) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReview = pullRequestReview;
        this.reviewEdge = reviewEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public PullRequestReviewTO getPullRequestReview() {
        return pullRequestReview;
    }

    public PullRequestReviewEdgeTO getReviewEdge() {
        return reviewEdge;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AddPullRequestReviewPayloadTO that = (AddPullRequestReviewPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(pullRequestReview, that.pullRequestReview)
            && Objects.equals(reviewEdge, that.reviewEdge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, pullRequestReview, reviewEdge);
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
        if (reviewEdge != null) {
            joiner.add("reviewEdge: " + GraphQLRequestSerializer.getEntry(reviewEdge));
        }
        return joiner.toString();
    }

    public static AddPullRequestReviewPayloadTO.Builder builder() {
        return new AddPullRequestReviewPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private PullRequestReviewTO pullRequestReview;
        private PullRequestReviewEdgeTO reviewEdge;

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

        public Builder setReviewEdge(PullRequestReviewEdgeTO reviewEdge) {
            this.reviewEdge = reviewEdge;
            return this;
        }


        public AddPullRequestReviewPayloadTO build() {
            return new AddPullRequestReviewPayloadTO(clientMutationId, pullRequestReview, reviewEdge);
        }

    }
}
