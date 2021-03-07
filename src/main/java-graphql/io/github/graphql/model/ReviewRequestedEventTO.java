package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReviewRequestedEventTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    private RequestedReviewerTO requestedReviewer;

    public ReviewRequestedEventTO() {
    }

    public ReviewRequestedEventTO(ActorTO actor, String createdAt, String id, PullRequestTO pullRequest, RequestedReviewerTO requestedReviewer) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.pullRequest = pullRequest;
        this.requestedReviewer = requestedReviewer;
    }

    public ActorTO getActor() {
        return actor;
    }

    public String getCreatedAt() {
        return createdAt;
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
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
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

    public static ReviewRequestedEventTO.Builder builder() {
        return new ReviewRequestedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;
        private PullRequestTO pullRequest;
        private RequestedReviewerTO requestedReviewer;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
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


        public ReviewRequestedEventTO build() {
            return new ReviewRequestedEventTO(actor, createdAt, id, pullRequest, requestedReviewer);
        }

    }
}
