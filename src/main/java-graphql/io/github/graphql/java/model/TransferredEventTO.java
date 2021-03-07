package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TransferredEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private RepositoryTO fromRepository;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private IssueTO issue;

    public TransferredEventTO() {
    }

    public TransferredEventTO(ActorTO actor, String createdAt, RepositoryTO fromRepository, String id, IssueTO issue) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.fromRepository = fromRepository;
        this.id = id;
        this.issue = issue;
    }

    public ActorTO getActor() {
        return actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public RepositoryTO getFromRepository() {
        return fromRepository;
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
        final TransferredEventTO that = (TransferredEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(fromRepository, that.fromRepository)
            && Objects.equals(id, that.id)
            && Objects.equals(issue, that.issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, createdAt, fromRepository, id, issue);
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
        if (fromRepository != null) {
            joiner.add("fromRepository: " + GraphQLRequestSerializer.getEntry(fromRepository));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (issue != null) {
            joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue));
        }
        return joiner.toString();
    }

    public static TransferredEventTO.Builder builder() {
        return new TransferredEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private RepositoryTO fromRepository;
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

        public Builder setFromRepository(RepositoryTO fromRepository) {
            this.fromRepository = fromRepository;
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


        public TransferredEventTO build() {
            return new TransferredEventTO(actor, createdAt, fromRepository, id, issue);
        }

    }
}
