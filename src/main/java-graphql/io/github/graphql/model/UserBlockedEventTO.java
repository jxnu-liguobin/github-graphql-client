package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UserBlockedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private UserBlockDurationTO blockDuration;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    private UserTO subject;

    public UserBlockedEventTO() {
    }

    public UserBlockedEventTO(ActorTO actor, UserBlockDurationTO blockDuration, String createdAt, String id, UserTO subject) {
        this.actor = actor;
        this.blockDuration = blockDuration;
        this.createdAt = createdAt;
        this.id = id;
        this.subject = subject;
    }

    public ActorTO getActor() {
        return actor;
    }

    public UserBlockDurationTO getBlockDuration() {
        return blockDuration;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public UserTO getSubject() {
        return subject;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (blockDuration != null) {
            joiner.add("blockDuration: " + GraphQLRequestSerializer.getEntry(blockDuration));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject));
        }
        return joiner.toString();
    }

    public static UserBlockedEventTO.Builder builder() {
        return new UserBlockedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private UserBlockDurationTO blockDuration;
        private String createdAt;
        private String id;
        private UserTO subject;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setBlockDuration(UserBlockDurationTO blockDuration) {
            this.blockDuration = blockDuration;
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

        public Builder setSubject(UserTO subject) {
            this.subject = subject;
            return this;
        }


        public UserBlockedEventTO build() {
            return new UserBlockedEventTO(actor, blockDuration, createdAt, id, subject);
        }

    }
}
