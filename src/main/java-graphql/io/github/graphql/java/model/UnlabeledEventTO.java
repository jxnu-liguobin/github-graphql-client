package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UnlabeledEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private LabelTO label;
    @javax.validation.constraints.NotNull
    private LabelableTO labelable;

    public UnlabeledEventTO() {
    }

    public UnlabeledEventTO(ActorTO actor, String createdAt, String id, LabelTO label, LabelableTO labelable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.label = label;
        this.labelable = labelable;
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

    public LabelTO getLabel() {
        return label;
    }

    public LabelableTO getLabelable() {
        return labelable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UnlabeledEventTO that = (UnlabeledEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id)
            && Objects.equals(label, that.label)
            && Objects.equals(labelable, that.labelable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, createdAt, id, label, labelable);
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
        if (label != null) {
            joiner.add("label: " + GraphQLRequestSerializer.getEntry(label));
        }
        if (labelable != null) {
            joiner.add("labelable: " + GraphQLRequestSerializer.getEntry(labelable));
        }
        return joiner.toString();
    }

    public static UnlabeledEventTO.Builder builder() {
        return new UnlabeledEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;
        private LabelTO label;
        private LabelableTO labelable;

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

        public Builder setLabel(LabelTO label) {
            this.label = label;
            return this;
        }

        public Builder setLabelable(LabelableTO labelable) {
            this.labelable = labelable;
            return this;
        }


        public UnlabeledEventTO build() {
            return new UnlabeledEventTO(actor, createdAt, id, label, labelable);
        }

    }
}
