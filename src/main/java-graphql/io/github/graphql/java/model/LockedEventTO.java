package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LockedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    private LockReasonTO lockReason;
    @javax.validation.constraints.NotNull
    private LockableTO lockable;

    public LockedEventTO() {
    }

    public LockedEventTO(ActorTO actor, String createdAt, String id, LockReasonTO lockReason, LockableTO lockable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.lockReason = lockReason;
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

    public LockReasonTO getLockReason() {
        return lockReason;
    }

    public LockableTO getLockable() {
        return lockable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final LockedEventTO that = (LockedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id)
            && Objects.equals(lockReason, that.lockReason)
            && Objects.equals(lockable, that.lockable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, createdAt, id, lockReason, lockable);
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
        if (lockReason != null) {
            joiner.add("lockReason: " + GraphQLRequestSerializer.getEntry(lockReason));
        }
        if (lockable != null) {
            joiner.add("lockable: " + GraphQLRequestSerializer.getEntry(lockable));
        }
        return joiner.toString();
    }

    public static LockedEventTO.Builder builder() {
        return new LockedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;
        private LockReasonTO lockReason;
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

        public Builder setLockReason(LockReasonTO lockReason) {
            this.lockReason = lockReason;
            return this;
        }

        public Builder setLockable(LockableTO lockable) {
            this.lockable = lockable;
            return this;
        }


        public LockedEventTO build() {
            return new LockedEventTO(actor, createdAt, id, lockReason, lockable);
        }

    }
}
