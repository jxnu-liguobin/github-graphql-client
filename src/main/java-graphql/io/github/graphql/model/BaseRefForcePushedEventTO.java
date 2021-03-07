package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class BaseRefForcePushedEventTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    private CommitTO afterCommit;
    private CommitTO beforeCommit;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    private RefTO ref;

    public BaseRefForcePushedEventTO() {
    }

    public BaseRefForcePushedEventTO(ActorTO actor, CommitTO afterCommit, CommitTO beforeCommit, String createdAt, String id, PullRequestTO pullRequest, RefTO ref) {
        this.actor = actor;
        this.afterCommit = afterCommit;
        this.beforeCommit = beforeCommit;
        this.createdAt = createdAt;
        this.id = id;
        this.pullRequest = pullRequest;
        this.ref = ref;
    }

    public ActorTO getActor() {
        return actor;
    }

    public CommitTO getAfterCommit() {
        return afterCommit;
    }

    public CommitTO getBeforeCommit() {
        return beforeCommit;
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

    public RefTO getRef() {
        return ref;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (afterCommit != null) {
            joiner.add("afterCommit: " + GraphQLRequestSerializer.getEntry(afterCommit));
        }
        if (beforeCommit != null) {
            joiner.add("beforeCommit: " + GraphQLRequestSerializer.getEntry(beforeCommit));
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
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref));
        }
        return joiner.toString();
    }

    public static BaseRefForcePushedEventTO.Builder builder() {
        return new BaseRefForcePushedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private CommitTO afterCommit;
        private CommitTO beforeCommit;
        private String createdAt;
        private String id;
        private PullRequestTO pullRequest;
        private RefTO ref;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setAfterCommit(CommitTO afterCommit) {
            this.afterCommit = afterCommit;
            return this;
        }

        public Builder setBeforeCommit(CommitTO beforeCommit) {
            this.beforeCommit = beforeCommit;
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

        public Builder setRef(RefTO ref) {
            this.ref = ref;
            return this;
        }


        public BaseRefForcePushedEventTO build() {
            return new BaseRefForcePushedEventTO(actor, afterCommit, beforeCommit, createdAt, id, pullRequest, ref);
        }

    }
}
