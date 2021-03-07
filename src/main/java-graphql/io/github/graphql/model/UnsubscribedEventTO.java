package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UnsubscribedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private SubscribableTO subscribable;

    public UnsubscribedEventTO() {
    }

    public UnsubscribedEventTO(ActorTO actor, String createdAt, String id, SubscribableTO subscribable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.subscribable = subscribable;
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

    public SubscribableTO getSubscribable() {
        return subscribable;
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
        if (subscribable != null) {
            joiner.add("subscribable: " + GraphQLRequestSerializer.getEntry(subscribable));
        }
        return joiner.toString();
    }

    public static UnsubscribedEventTO.Builder builder() {
        return new UnsubscribedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;
        private SubscribableTO subscribable;

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

        public Builder setSubscribable(SubscribableTO subscribable) {
            this.subscribable = subscribable;
            return this;
        }


        public UnsubscribedEventTO build() {
            return new UnsubscribedEventTO(actor, createdAt, id, subscribable);
        }

    }
}
