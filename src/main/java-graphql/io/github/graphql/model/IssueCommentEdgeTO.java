package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueCommentEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private IssueCommentTO node;

    public IssueCommentEdgeTO() {
    }

    public IssueCommentEdgeTO(String cursor, IssueCommentTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public IssueCommentTO getNode() {
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

    public static IssueCommentEdgeTO.Builder builder() {
        return new IssueCommentEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private IssueCommentTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(IssueCommentTO node) {
            this.node = node;
            return this;
        }


        public IssueCommentEdgeTO build() {
            return new IssueCommentEdgeTO(cursor, node);
        }

    }
}