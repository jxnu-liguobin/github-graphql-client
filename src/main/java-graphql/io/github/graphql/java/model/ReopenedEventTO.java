package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReopenedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private ClosableTO closable;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;

    public ReopenedEventTO() {
    }

    public ReopenedEventTO(ActorTO actor, ClosableTO closable, String createdAt, String id) {
        this.actor = actor;
        this.closable = closable;
        this.createdAt = createdAt;
        this.id = id;
    }

    public ActorTO getActor() {
        return actor;
    }

    public ClosableTO getClosable() {
        return closable;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ReopenedEventTO that = (ReopenedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(closable, that.closable)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, closable, createdAt, id);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (closable != null) {
            joiner.add("closable: " + GraphQLRequestSerializer.getEntry(closable));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

    public static ReopenedEventTO.Builder builder() {
        return new ReopenedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private ClosableTO closable;
        private String createdAt;
        private String id;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setClosable(ClosableTO closable) {
            this.closable = closable;
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


        public ReopenedEventTO build() {
            return new ReopenedEventTO(actor, closable, createdAt, id);
        }

    }
}
