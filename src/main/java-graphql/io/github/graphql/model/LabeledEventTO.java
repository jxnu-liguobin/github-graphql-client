package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LabeledEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private LabelTO label;
    @javax.validation.constraints.NotNull
    private LabelableTO labelable;

    public LabeledEventTO() {
    }

    public LabeledEventTO(ActorTO actor, String createdAt, String id, LabelTO label, LabelableTO labelable) {
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

    public static LabeledEventTO.Builder builder() {
        return new LabeledEventTO.Builder();
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


        public LabeledEventTO build() {
            return new LabeledEventTO(actor, createdAt, id, label, labelable);
        }

    }
}
