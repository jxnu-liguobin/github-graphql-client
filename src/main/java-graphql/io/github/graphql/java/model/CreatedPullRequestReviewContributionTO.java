package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedPullRequestReviewContributionTO implements java.io.Serializable, ContributionTO {

    private boolean isRestricted;
    @javax.validation.constraints.NotNull
    private String occurredAt;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    @javax.validation.constraints.NotNull
    private PullRequestReviewTO pullRequestReview;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private UserTO user;

    public CreatedPullRequestReviewContributionTO() {
    }

    public CreatedPullRequestReviewContributionTO(boolean isRestricted, String occurredAt, PullRequestTO pullRequest, PullRequestReviewTO pullRequestReview, RepositoryTO repository, String resourcePath, String url, UserTO user) {
        this.isRestricted = isRestricted;
        this.occurredAt = occurredAt;
        this.pullRequest = pullRequest;
        this.pullRequestReview = pullRequestReview;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.url = url;
        this.user = user;
    }

    public boolean getIsRestricted() {
        return isRestricted;
    }

    public String getOccurredAt() {
        return occurredAt;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public PullRequestReviewTO getPullRequestReview() {
        return pullRequestReview;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public String getUrl() {
        return url;
    }

    public UserTO getUser() {
        return user;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreatedPullRequestReviewContributionTO that = (CreatedPullRequestReviewContributionTO) obj;
        return Objects.equals(isRestricted, that.isRestricted)
            && Objects.equals(occurredAt, that.occurredAt)
            && Objects.equals(pullRequest, that.pullRequest)
            && Objects.equals(pullRequestReview, that.pullRequestReview)
            && Objects.equals(repository, that.repository)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(url, that.url)
            && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRestricted, occurredAt, pullRequest, pullRequestReview, repository, resourcePath, url, user);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("isRestricted: " + GraphQLRequestSerializer.getEntry(isRestricted));
        if (occurredAt != null) {
            joiner.add("occurredAt: " + GraphQLRequestSerializer.getEntry(occurredAt));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (pullRequestReview != null) {
            joiner.add("pullRequestReview: " + GraphQLRequestSerializer.getEntry(pullRequestReview));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static CreatedPullRequestReviewContributionTO.Builder builder() {
        return new CreatedPullRequestReviewContributionTO.Builder();
    }

    public static class Builder {

        private boolean isRestricted;
        private String occurredAt;
        private PullRequestTO pullRequest;
        private PullRequestReviewTO pullRequestReview;
        private RepositoryTO repository;
        private String resourcePath;
        private String url;
        private UserTO user;

        public Builder() {
        }

        public Builder setIsRestricted(boolean isRestricted) {
            this.isRestricted = isRestricted;
            return this;
        }

        public Builder setOccurredAt(String occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        public Builder setPullRequestReview(PullRequestReviewTO pullRequestReview) {
            this.pullRequestReview = pullRequestReview;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }


        public CreatedPullRequestReviewContributionTO build() {
            return new CreatedPullRequestReviewContributionTO(isRestricted, occurredAt, pullRequest, pullRequestReview, repository, resourcePath, url, user);
        }

    }
}
