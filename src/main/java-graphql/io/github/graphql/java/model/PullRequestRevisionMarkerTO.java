package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestRevisionMarkerTO implements java.io.Serializable, PullRequestTimelineItemsTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private CommitTO lastSeenCommit;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;

    public PullRequestRevisionMarkerTO() {
    }

    public PullRequestRevisionMarkerTO(String createdAt, CommitTO lastSeenCommit, PullRequestTO pullRequest) {
        this.createdAt = createdAt;
        this.lastSeenCommit = lastSeenCommit;
        this.pullRequest = pullRequest;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public CommitTO getLastSeenCommit() {
        return lastSeenCommit;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PullRequestRevisionMarkerTO that = (PullRequestRevisionMarkerTO) obj;
        return Objects.equals(createdAt, that.createdAt)
            && Objects.equals(lastSeenCommit, that.lastSeenCommit)
            && Objects.equals(pullRequest, that.pullRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, lastSeenCommit, pullRequest);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (lastSeenCommit != null) {
            joiner.add("lastSeenCommit: " + GraphQLRequestSerializer.getEntry(lastSeenCommit));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        return joiner.toString();
    }

    public static PullRequestRevisionMarkerTO.Builder builder() {
        return new PullRequestRevisionMarkerTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private CommitTO lastSeenCommit;
        private PullRequestTO pullRequest;

        public Builder() {
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setLastSeenCommit(CommitTO lastSeenCommit) {
            this.lastSeenCommit = lastSeenCommit;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }


        public PullRequestRevisionMarkerTO build() {
            return new PullRequestRevisionMarkerTO(createdAt, lastSeenCommit, pullRequest);
        }

    }
}
