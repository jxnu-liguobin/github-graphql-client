package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LanguageEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private LanguageTO node;
    private int size;

    public LanguageEdgeTO() {
    }

    public LanguageEdgeTO(String cursor, LanguageTO node, int size) {
        this.cursor = cursor;
        this.node = node;
        this.size = size;
    }

    public String getCursor() {
        return cursor;
    }

    public LanguageTO getNode() {
        return node;
    }

    public int getSize() {
        return size;
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
        joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        return joiner.toString();
    }

    public static LanguageEdgeTO.Builder builder() {
        return new LanguageEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private LanguageTO node;
        private int size;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(LanguageTO node) {
            this.node = node;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }


        public LanguageEdgeTO build() {
            return new LanguageEdgeTO(cursor, node, size);
        }

    }
}
