package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RenamedTitleEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String currentTitle;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String previousTitle;
    @javax.validation.constraints.NotNull
    private RenamedTitleSubjectTO subject;

    public RenamedTitleEventTO() {
    }

    public RenamedTitleEventTO(ActorTO actor, String createdAt, String currentTitle, String id, String previousTitle, RenamedTitleSubjectTO subject) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.currentTitle = currentTitle;
        this.id = id;
        this.previousTitle = previousTitle;
        this.subject = subject;
    }

    public ActorTO getActor() {
        return actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getCurrentTitle() {
        return currentTitle;
    }

    public String getId() {
        return id;
    }

    public String getPreviousTitle() {
        return previousTitle;
    }

    public RenamedTitleSubjectTO getSubject() {
        return subject;
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
        if (currentTitle != null) {
            joiner.add("currentTitle: " + GraphQLRequestSerializer.getEntry(currentTitle));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (previousTitle != null) {
            joiner.add("previousTitle: " + GraphQLRequestSerializer.getEntry(previousTitle));
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject));
        }
        return joiner.toString();
    }

    public static RenamedTitleEventTO.Builder builder() {
        return new RenamedTitleEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String currentTitle;
        private String id;
        private String previousTitle;
        private RenamedTitleSubjectTO subject;

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

        public Builder setCurrentTitle(String currentTitle) {
            this.currentTitle = currentTitle;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPreviousTitle(String previousTitle) {
            this.previousTitle = previousTitle;
            return this;
        }

        public Builder setSubject(RenamedTitleSubjectTO subject) {
            this.subject = subject;
            return this;
        }


        public RenamedTitleEventTO build() {
            return new RenamedTitleEventTO(actor, createdAt, currentTitle, id, previousTitle, subject);
        }

    }
}
