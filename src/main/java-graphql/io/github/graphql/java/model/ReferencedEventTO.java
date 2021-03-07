package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReferencedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    private CommitTO commit;
    @javax.validation.constraints.NotNull
    private RepositoryTO commitRepository;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isCrossRepository;
    private boolean isDirectReference;
    @javax.validation.constraints.NotNull
    private ReferencedSubjectTO subject;

    public ReferencedEventTO() {
    }

    public ReferencedEventTO(ActorTO actor, CommitTO commit, RepositoryTO commitRepository, String createdAt, String id, boolean isCrossRepository, boolean isDirectReference, ReferencedSubjectTO subject) {
        this.actor = actor;
        this.commit = commit;
        this.commitRepository = commitRepository;
        this.createdAt = createdAt;
        this.id = id;
        this.isCrossRepository = isCrossRepository;
        this.isDirectReference = isDirectReference;
        this.subject = subject;
    }

    public ActorTO getActor() {
        return actor;
    }

    public CommitTO getCommit() {
        return commit;
    }

    public RepositoryTO getCommitRepository() {
        return commitRepository;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public boolean getIsCrossRepository() {
        return isCrossRepository;
    }

    public boolean getIsDirectReference() {
        return isDirectReference;
    }

    public ReferencedSubjectTO getSubject() {
        return subject;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ReferencedEventTO that = (ReferencedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(commit, that.commit)
            && Objects.equals(commitRepository, that.commitRepository)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id)
            && Objects.equals(isCrossRepository, that.isCrossRepository)
            && Objects.equals(isDirectReference, that.isDirectReference)
            && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, commit, commitRepository, createdAt, id, isCrossRepository, isDirectReference, subject);
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
        if (commitRepository != null) {
            joiner.add("commitRepository: " + GraphQLRequestSerializer.getEntry(commitRepository));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isCrossRepository: " + GraphQLRequestSerializer.getEntry(isCrossRepository));
        joiner.add("isDirectReference: " + GraphQLRequestSerializer.getEntry(isDirectReference));
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject));
        }
        return joiner.toString();
    }

    public static ReferencedEventTO.Builder builder() {
        return new ReferencedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private CommitTO commit;
        private RepositoryTO commitRepository;
        private String createdAt;
        private String id;
        private boolean isCrossRepository;
        private boolean isDirectReference;
        private ReferencedSubjectTO subject;

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

        public Builder setCommitRepository(RepositoryTO commitRepository) {
            this.commitRepository = commitRepository;
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

        public Builder setIsCrossRepository(boolean isCrossRepository) {
            this.isCrossRepository = isCrossRepository;
            return this;
        }

        public Builder setIsDirectReference(boolean isDirectReference) {
            this.isDirectReference = isDirectReference;
            return this;
        }

        public Builder setSubject(ReferencedSubjectTO subject) {
            this.subject = subject;
            return this;
        }


        public ReferencedEventTO build() {
            return new ReferencedEventTO(actor, commit, commitRepository, createdAt, id, isCrossRepository, isDirectReference, subject);
        }

    }
}
