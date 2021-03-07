package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RequestReviewsPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestTO pullRequest;
    private UserEdgeTO requestedReviewersEdge;

    public RequestReviewsPayloadTO() {
    }

    public RequestReviewsPayloadTO(String clientMutationId, PullRequestTO pullRequest, UserEdgeTO requestedReviewersEdge) {
        this.clientMutationId = clientMutationId;
        this.pullRequest = pullRequest;
        this.requestedReviewersEdge = requestedReviewersEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public UserEdgeTO getRequestedReviewersEdge() {
        return requestedReviewersEdge;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (requestedReviewersEdge != null) {
            joiner.add("requestedReviewersEdge: " + GraphQLRequestSerializer.getEntry(requestedReviewersEdge));
        }
        return joiner.toString();
    }

    public static RequestReviewsPayloadTO.Builder builder() {
        return new RequestReviewsPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private PullRequestTO pullRequest;
        private UserEdgeTO requestedReviewersEdge;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        public Builder setRequestedReviewersEdge(UserEdgeTO requestedReviewersEdge) {
            this.requestedReviewersEdge = requestedReviewersEdge;
            return this;
        }


        public RequestReviewsPayloadTO build() {
            return new RequestReviewsPayloadTO(clientMutationId, pullRequest, requestedReviewersEdge);
        }

    }
}
