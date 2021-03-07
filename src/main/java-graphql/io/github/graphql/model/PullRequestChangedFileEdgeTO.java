package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestChangedFileEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PullRequestChangedFileTO node;

    public PullRequestChangedFileEdgeTO() {
    }

    public PullRequestChangedFileEdgeTO(String cursor, PullRequestChangedFileTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public PullRequestChangedFileTO getNode() {
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

    public static PullRequestChangedFileEdgeTO.Builder builder() {
        return new PullRequestChangedFileEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private PullRequestChangedFileTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(PullRequestChangedFileTO node) {
            this.node = node;
            return this;
        }


        public PullRequestChangedFileEdgeTO build() {
            return new PullRequestChangedFileEdgeTO(cursor, node);
        }

    }
}
