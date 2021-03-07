package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class HeadRefDeletedEventTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private RefTO headRef;
    @javax.validation.constraints.NotNull
    private String headRefName;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;

    public HeadRefDeletedEventTO() {
    }

    public HeadRefDeletedEventTO(ActorTO actor, String createdAt, RefTO headRef, String headRefName, String id, PullRequestTO pullRequest) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.headRef = headRef;
        this.headRefName = headRefName;
        this.id = id;
        this.pullRequest = pullRequest;
    }

    public ActorTO getActor() {
        return actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public RefTO getHeadRef() {
        return headRef;
    }

    public String getHeadRefName() {
        return headRefName;
    }

    public String getId() {
        return id;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final HeadRefDeletedEventTO that = (HeadRefDeletedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(headRef, that.headRef)
            && Objects.equals(headRefName, that.headRefName)
            && Objects.equals(id, that.id)
            && Objects.equals(pullRequest, that.pullRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, createdAt, headRef, headRefName, id, pullRequest);
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
        if (headRef != null) {
            joiner.add("headRef: " + GraphQLRequestSerializer.getEntry(headRef));
        }
        if (headRefName != null) {
            joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        return joiner.toString();
    }

    public static HeadRefDeletedEventTO.Builder builder() {
        return new HeadRefDeletedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private RefTO headRef;
        private String headRefName;
        private String id;
        private PullRequestTO pullRequest;

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

        public Builder setHeadRef(RefTO headRef) {
            this.headRef = headRef;
            return this;
        }

        public Builder setHeadRefName(String headRefName) {
            this.headRefName = headRefName;
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


        public HeadRefDeletedEventTO build() {
            return new HeadRefDeletedEventTO(actor, createdAt, headRef, headRefName, id, pullRequest);
        }

    }
}
