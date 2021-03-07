package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReviewDismissedEventTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, UniformResourceLocatableTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private Integer databaseId;
    private String dismissalMessage;
    private String dismissalMessageHTML;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestReviewStateTO previousReviewState;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    private PullRequestCommitTO pullRequestCommit;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private PullRequestReviewTO review;
    @javax.validation.constraints.NotNull
    private String url;

    public ReviewDismissedEventTO() {
    }

    public ReviewDismissedEventTO(ActorTO actor, String createdAt, Integer databaseId, String dismissalMessage, String dismissalMessageHTML, String id, PullRequestReviewStateTO previousReviewState, PullRequestTO pullRequest, PullRequestCommitTO pullRequestCommit, String resourcePath, PullRequestReviewTO review, String url) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.dismissalMessage = dismissalMessage;
        this.dismissalMessageHTML = dismissalMessageHTML;
        this.id = id;
        this.previousReviewState = previousReviewState;
        this.pullRequest = pullRequest;
        this.pullRequestCommit = pullRequestCommit;
        this.resourcePath = resourcePath;
        this.review = review;
        this.url = url;
    }

    public ActorTO getActor() {
        return actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getDismissalMessage() {
        return dismissalMessage;
    }

    public String getDismissalMessageHTML() {
        return dismissalMessageHTML;
    }

    public String getId() {
        return id;
    }

    public PullRequestReviewStateTO getPreviousReviewState() {
        return previousReviewState;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public PullRequestCommitTO getPullRequestCommit() {
        return pullRequestCommit;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public PullRequestReviewTO getReview() {
        return review;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ReviewDismissedEventTO that = (ReviewDismissedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(databaseId, that.databaseId)
            && Objects.equals(dismissalMessage, that.dismissalMessage)
            && Objects.equals(dismissalMessageHTML, that.dismissalMessageHTML)
            && Objects.equals(id, that.id)
            && Objects.equals(previousReviewState, that.previousReviewState)
            && Objects.equals(pullRequest, that.pullRequest)
            && Objects.equals(pullRequestCommit, that.pullRequestCommit)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(review, that.review)
            && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, createdAt, databaseId, dismissalMessage, dismissalMessageHTML, id, previousReviewState, pullRequest, pullRequestCommit, resourcePath, review, url);
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
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (dismissalMessage != null) {
            joiner.add("dismissalMessage: " + GraphQLRequestSerializer.getEntry(dismissalMessage));
        }
        if (dismissalMessageHTML != null) {
            joiner.add("dismissalMessageHTML: " + GraphQLRequestSerializer.getEntry(dismissalMessageHTML));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (previousReviewState != null) {
            joiner.add("previousReviewState: " + GraphQLRequestSerializer.getEntry(previousReviewState));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (pullRequestCommit != null) {
            joiner.add("pullRequestCommit: " + GraphQLRequestSerializer.getEntry(pullRequestCommit));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (review != null) {
            joiner.add("review: " + GraphQLRequestSerializer.getEntry(review));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static ReviewDismissedEventTO.Builder builder() {
        return new ReviewDismissedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private Integer databaseId;
        private String dismissalMessage;
        private String dismissalMessageHTML;
        private String id;
        private PullRequestReviewStateTO previousReviewState;
        private PullRequestTO pullRequest;
        private PullRequestCommitTO pullRequestCommit;
        private String resourcePath;
        private PullRequestReviewTO review;
        private String url;

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

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setDismissalMessage(String dismissalMessage) {
            this.dismissalMessage = dismissalMessage;
            return this;
        }

        public Builder setDismissalMessageHTML(String dismissalMessageHTML) {
            this.dismissalMessageHTML = dismissalMessageHTML;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPreviousReviewState(PullRequestReviewStateTO previousReviewState) {
            this.previousReviewState = previousReviewState;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        public Builder setPullRequestCommit(PullRequestCommitTO pullRequestCommit) {
            this.pullRequestCommit = pullRequestCommit;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setReview(PullRequestReviewTO review) {
            this.review = review;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public ReviewDismissedEventTO build() {
            return new ReviewDismissedEventTO(actor, createdAt, databaseId, dismissalMessage, dismissalMessageHTML, id, previousReviewState, pullRequest, pullRequestCommit, resourcePath, review, url);
        }

    }
}
