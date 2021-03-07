package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReviewRequestTO implements java.io.Serializable, NodeTO {

    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    private RequestedReviewerTO requestedReviewer;

    public ReviewRequestTO() {
    }

    public ReviewRequestTO(Integer databaseId, String id, PullRequestTO pullRequest, RequestedReviewerTO requestedReviewer) {
        this.databaseId = databaseId;
        this.id = id;
        this.pullRequest = pullRequest;
        this.requestedReviewer = requestedReviewer;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getId() {
        return id;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public RequestedReviewerTO getRequestedReviewer() {
        return requestedReviewer;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (requestedReviewer != null) {
            joiner.add("requestedReviewer: " + GraphQLRequestSerializer.getEntry(requestedReviewer));
        }
        return joiner.toString();
    }

    public static ReviewRequestTO.Builder builder() {
        return new ReviewRequestTO.Builder();
    }

    public static class Builder {

        private Integer databaseId;
        private String id;
        private PullRequestTO pullRequest;
        private RequestedReviewerTO requestedReviewer;

        public Builder() {
        }

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        public Builder setRequestedReviewer(RequestedReviewerTO requestedReviewer) {
            this.requestedReviewer = requestedReviewer;
            return this;
        }


        public ReviewRequestTO build() {
            return new ReviewRequestTO(databaseId, id, pullRequest, requestedReviewer);
        }

    }
}
