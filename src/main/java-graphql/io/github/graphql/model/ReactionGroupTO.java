package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ReactionGroupTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private ReactionContentTO content;
    private String createdAt;
    @javax.validation.constraints.NotNull
    private ReactableTO subject;
    private boolean viewerHasReacted;

    public ReactionGroupTO() {
    }

    public ReactionGroupTO(ReactionContentTO content, String createdAt, ReactableTO subject, boolean viewerHasReacted) {
        this.content = content;
        this.createdAt = createdAt;
        this.subject = subject;
        this.viewerHasReacted = viewerHasReacted;
    }

    public ReactionContentTO getContent() {
        return content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ReactableTO getSubject() {
        return subject;
    }

    public boolean getViewerHasReacted() {
        return viewerHasReacted;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (content != null) {
            joiner.add("content: " + GraphQLRequestSerializer.getEntry(content));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject));
        }
        joiner.add("viewerHasReacted: " + GraphQLRequestSerializer.getEntry(viewerHasReacted));
        return joiner.toString();
    }

    public static ReactionGroupTO.Builder builder() {
        return new ReactionGroupTO.Builder();
    }

    public static class Builder {

        private ReactionContentTO content;
        private String createdAt;
        private ReactableTO subject;
        private boolean viewerHasReacted;

        public Builder() {
        }

        public Builder setContent(ReactionContentTO content) {
            this.content = content;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setSubject(ReactableTO subject) {
            this.subject = subject;
            return this;
        }

        public Builder setViewerHasReacted(boolean viewerHasReacted) {
            this.viewerHasReacted = viewerHasReacted;
            return this;
        }


        public ReactionGroupTO build() {
            return new ReactionGroupTO(content, createdAt, subject, viewerHasReacted);
        }

    }
}
