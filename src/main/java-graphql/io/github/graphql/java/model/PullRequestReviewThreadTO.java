package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestReviewThreadTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private boolean isResolved;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    private UserTO resolvedBy;
    private boolean viewerCanResolve;
    private boolean viewerCanUnresolve;

    public PullRequestReviewThreadTO() {
    }

    public PullRequestReviewThreadTO(String id, boolean isResolved, PullRequestTO pullRequest, RepositoryTO repository, UserTO resolvedBy, boolean viewerCanResolve, boolean viewerCanUnresolve) {
        this.id = id;
        this.isResolved = isResolved;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.resolvedBy = resolvedBy;
        this.viewerCanResolve = viewerCanResolve;
        this.viewerCanUnresolve = viewerCanUnresolve;
    }

    public String getId() {
        return id;
    }

    public boolean getIsResolved() {
        return isResolved;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public UserTO getResolvedBy() {
        return resolvedBy;
    }

    public boolean getViewerCanResolve() {
        return viewerCanResolve;
    }

    public boolean getViewerCanUnresolve() {
        return viewerCanUnresolve;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PullRequestReviewThreadTO that = (PullRequestReviewThreadTO) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(isResolved, that.isResolved)
            && Objects.equals(pullRequest, that.pullRequest)
            && Objects.equals(repository, that.repository)
            && Objects.equals(resolvedBy, that.resolvedBy)
            && Objects.equals(viewerCanResolve, that.viewerCanResolve)
            && Objects.equals(viewerCanUnresolve, that.viewerCanUnresolve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isResolved, pullRequest, repository, resolvedBy, viewerCanResolve, viewerCanUnresolve);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isResolved: " + GraphQLRequestSerializer.getEntry(isResolved));
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (resolvedBy != null) {
            joiner.add("resolvedBy: " + GraphQLRequestSerializer.getEntry(resolvedBy));
        }
        joiner.add("viewerCanResolve: " + GraphQLRequestSerializer.getEntry(viewerCanResolve));
        joiner.add("viewerCanUnresolve: " + GraphQLRequestSerializer.getEntry(viewerCanUnresolve));
        return joiner.toString();
    }

    public static PullRequestReviewThreadTO.Builder builder() {
        return new PullRequestReviewThreadTO.Builder();
    }

    public static class Builder {

        private String id;
        private boolean isResolved;
        private PullRequestTO pullRequest;
        private RepositoryTO repository;
        private UserTO resolvedBy;
        private boolean viewerCanResolve;
        private boolean viewerCanUnresolve;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsResolved(boolean isResolved) {
            this.isResolved = isResolved;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }

        public Builder setResolvedBy(UserTO resolvedBy) {
            this.resolvedBy = resolvedBy;
            return this;
        }

        public Builder setViewerCanResolve(boolean viewerCanResolve) {
            this.viewerCanResolve = viewerCanResolve;
            return this;
        }

        public Builder setViewerCanUnresolve(boolean viewerCanUnresolve) {
            this.viewerCanUnresolve = viewerCanUnresolve;
            return this;
        }


        public PullRequestReviewThreadTO build() {
            return new PullRequestReviewThreadTO(id, isResolved, pullRequest, repository, resolvedBy, viewerCanResolve, viewerCanUnresolve);
        }

    }
}
