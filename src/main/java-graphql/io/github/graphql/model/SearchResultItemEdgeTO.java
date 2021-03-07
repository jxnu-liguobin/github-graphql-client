package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SearchResultItemEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private SearchResultItemTO node;
    private java.util.List<TextMatchTO> textMatches;

    public SearchResultItemEdgeTO() {
    }

    public SearchResultItemEdgeTO(String cursor, SearchResultItemTO node, java.util.List<TextMatchTO> textMatches) {
        this.cursor = cursor;
        this.node = node;
        this.textMatches = textMatches;
    }

    public String getCursor() {
        return cursor;
    }

    public SearchResultItemTO getNode() {
        return node;
    }

    public java.util.List<TextMatchTO> getTextMatches() {
        return textMatches;
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
        if (textMatches != null) {
            joiner.add("textMatches: " + GraphQLRequestSerializer.getEntry(textMatches));
        }
        return joiner.toString();
    }

    public static SearchResultItemEdgeTO.Builder builder() {
        return new SearchResultItemEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private SearchResultItemTO node;
        private java.util.List<TextMatchTO> textMatches;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(SearchResultItemTO node) {
            this.node = node;
            return this;
        }

        public Builder setTextMatches(java.util.List<TextMatchTO> textMatches) {
            this.textMatches = textMatches;
            return this;
        }


        public SearchResultItemEdgeTO build() {
            return new SearchResultItemEdgeTO(cursor, node, textMatches);
        }

    }
}
