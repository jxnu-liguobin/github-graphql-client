package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RepositoryTopicEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private RepositoryTopicTO node;

    public RepositoryTopicEdgeTO() {
    }

    public RepositoryTopicEdgeTO(String cursor, RepositoryTopicTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public RepositoryTopicTO getNode() {
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

    public static RepositoryTopicEdgeTO.Builder builder() {
        return new RepositoryTopicEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private RepositoryTopicTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(RepositoryTopicTO node) {
            this.node = node;
            return this;
        }


        public RepositoryTopicEdgeTO build() {
            return new RepositoryTopicEdgeTO(cursor, node);
        }

    }
}
