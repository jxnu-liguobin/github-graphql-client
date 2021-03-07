package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PinnedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private IssueTO issue;

    public PinnedEventTO() {
    }

    public PinnedEventTO(ActorTO actor, String createdAt, String id, IssueTO issue) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.issue = issue;
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

    public IssueTO getIssue() {
        return issue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PinnedEventTO that = (PinnedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id)
            && Objects.equals(issue, that.issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, createdAt, id, issue);
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
        if (issue != null) {
            joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue));
        }
        return joiner.toString();
    }

    public static PinnedEventTO.Builder builder() {
        return new PinnedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;
        private IssueTO issue;

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

        public Builder setIssue(IssueTO issue) {
            this.issue = issue;
            return this;
        }


        public PinnedEventTO build() {
            return new PinnedEventTO(actor, createdAt, id, issue);
        }

    }
}
