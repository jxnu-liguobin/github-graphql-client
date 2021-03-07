package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class MarkedAsDuplicateEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;

    public MarkedAsDuplicateEventTO() {
    }

    public MarkedAsDuplicateEventTO(ActorTO actor, String createdAt, String id) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
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
        return joiner.toString();
    }

    public static MarkedAsDuplicateEventTO.Builder builder() {
        return new MarkedAsDuplicateEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;

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


        public MarkedAsDuplicateEventTO build() {
            return new MarkedAsDuplicateEventTO(actor, createdAt, id);
        }

    }
}
