package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestTimelineItemEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestTimelineItemTO node;

    public PullRequestTimelineItemEdgeTO() {
    }

    public PullRequestTimelineItemEdgeTO(String cursor, PullRequestTimelineItemTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public PullRequestTimelineItemTO getNode() {
        return node;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        return joiner.toString();
    }

    public static PullRequestTimelineItemEdgeTO.Builder builder() {
        return new PullRequestTimelineItemEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private PullRequestTimelineItemTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(PullRequestTimelineItemTO node) {
            this.node = node;
            return this;
        }


        public PullRequestTimelineItemEdgeTO build() {
            return new PullRequestTimelineItemEdgeTO(cursor, node);
        }

    }
}
