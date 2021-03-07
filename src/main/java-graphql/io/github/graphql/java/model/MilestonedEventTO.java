package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MilestonedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String milestoneTitle;
    @javax.validation.constraints.NotNull
    private MilestoneItemTO subject;

    public MilestonedEventTO() {
    }

    public MilestonedEventTO(ActorTO actor, String createdAt, String id, String milestoneTitle, MilestoneItemTO subject) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.milestoneTitle = milestoneTitle;
        this.subject = subject;
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

    public String getMilestoneTitle() {
        return milestoneTitle;
    }

    public MilestoneItemTO getSubject() {
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
        final MilestonedEventTO that = (MilestonedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id)
            && Objects.equals(milestoneTitle, that.milestoneTitle)
            && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, createdAt, id, milestoneTitle, subject);
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
        if (milestoneTitle != null) {
            joiner.add("milestoneTitle: " + GraphQLRequestSerializer.getEntry(milestoneTitle));
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject));
        }
        return joiner.toString();
    }

    public static MilestonedEventTO.Builder builder() {
        return new MilestonedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;
        private String milestoneTitle;
        private MilestoneItemTO subject;

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

        public Builder setMilestoneTitle(String milestoneTitle) {
            this.milestoneTitle = milestoneTitle;
            return this;
        }

        public Builder setSubject(MilestoneItemTO subject) {
            this.subject = subject;
            return this;
        }


        public MilestonedEventTO build() {
            return new MilestonedEventTO(actor, createdAt, id, milestoneTitle, subject);
        }

    }
}
