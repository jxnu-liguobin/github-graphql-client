package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReviewRequestRemovedEventTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    private RequestedReviewerTO requestedReviewer;

    public ReviewRequestRemovedEventTO() {
    }

    public ReviewRequestRemovedEventTO(ActorTO actor, String createdAt, String id, PullRequestTO pullRequest, RequestedReviewerTO requestedReviewer) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ReviewRequestRemovedEventTO that = (ReviewRequestRemovedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id)
            && Objects.equals(pullRequest, that.pullRequest)
            && Objects.equals(requestedReviewer, that.requestedReviewer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, createdAt, id, pullRequest, requestedReviewer);
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

    public static ReviewRequestRemovedEventTO.Builder builder() {
        return new ReviewRequestRemovedEventTO.Builder();
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


        public ReviewRequestRemovedEventTO build() {
            return new ReviewRequestRemovedEventTO(actor, createdAt, id, pullRequest, requestedReviewer);
        }

    }
}
