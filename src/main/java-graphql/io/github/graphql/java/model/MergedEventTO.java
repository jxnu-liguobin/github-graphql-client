package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MergedEventTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, UniformResourceLocatableTO, NodeTO {

    private ActorTO actor;
    private CommitTO commit;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    private RefTO mergeRef;
    @javax.validation.constraints.NotNull
    private String mergeRefName;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;

    public MergedEventTO() {
    }

    public MergedEventTO(ActorTO actor, CommitTO commit, String createdAt, String id, RefTO mergeRef, String mergeRefName, PullRequestTO pullRequest, String resourcePath, String url) {
        this.actor = actor;
        this.commit = commit;
        this.createdAt = createdAt;
        this.id = id;
        this.mergeRef = mergeRef;
        this.mergeRefName = mergeRefName;
        this.pullRequest = pullRequest;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public ActorTO getActor() {
        return actor;
    }

    public CommitTO getCommit() {
        return commit;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public RefTO getMergeRef() {
        return mergeRef;
    }

    public String getMergeRefName() {
        return mergeRefName;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public String getResourcePath() {
        return resourcePath;
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
        final MergedEventTO that = (MergedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(commit, that.commit)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id)
            && Objects.equals(mergeRef, that.mergeRef)
            && Objects.equals(mergeRefName, that.mergeRefName)
            && Objects.equals(pullRequest, that.pullRequest)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, commit, createdAt, id, mergeRef, mergeRefName, pullRequest, resourcePath, url);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (mergeRef != null) {
            joiner.add("mergeRef: " + GraphQLRequestSerializer.getEntry(mergeRef));
        }
        if (mergeRefName != null) {
            joiner.add("mergeRefName: " + GraphQLRequestSerializer.getEntry(mergeRefName));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static MergedEventTO.Builder builder() {
        return new MergedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private CommitTO commit;
        private String createdAt;
        private String id;
        private RefTO mergeRef;
        private String mergeRefName;
        private PullRequestTO pullRequest;
        private String resourcePath;
        private String url;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setCommit(CommitTO commit) {
            this.commit = commit;
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

        public Builder setMergeRef(RefTO mergeRef) {
            this.mergeRef = mergeRef;
            return this;
        }

        public Builder setMergeRefName(String mergeRefName) {
            this.mergeRefName = mergeRefName;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
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


        public MergedEventTO build() {
            return new MergedEventTO(actor, commit, createdAt, id, mergeRef, mergeRefName, pullRequest, resourcePath, url);
        }

    }
}
