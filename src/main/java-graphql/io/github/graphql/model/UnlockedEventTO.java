package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UnlockedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private LockableTO lockable;

    public UnlockedEventTO() {
    }

    public UnlockedEventTO(ActorTO actor, String createdAt, String id, LockableTO lockable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.lockable = lockable;
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

    public LockableTO getLockable() {
        return lockable;
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
        if (lockable != null) {
            joiner.add("lockable: " + GraphQLRequestSerializer.getEntry(lockable));
        }
        return joiner.toString();
    }

    public static UnlockedEventTO.Builder builder() {
        return new UnlockedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;
        private LockableTO lockable;

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

        public Builder setLockable(LockableTO lockable) {
            this.lockable = lockable;
            return this;
        }


        public UnlockedEventTO build() {
            return new UnlockedEventTO(actor, createdAt, id, lockable);
        }

    }
}
