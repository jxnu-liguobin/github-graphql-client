package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class StargazerEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private UserTO node;
    @javax.validation.constraints.NotNull
    private String starredAt;

    public StargazerEdgeTO() {
    }

    public StargazerEdgeTO(String cursor, UserTO node, String starredAt) {
        this.cursor = cursor;
        this.node = node;
        this.starredAt = starredAt;
    }

    public String getCursor() {
        return cursor;
    }

    public UserTO getNode() {
        return node;
    }

    public String getStarredAt() {
        return starredAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final StargazerEdgeTO that = (StargazerEdgeTO) obj;
        return Objects.equals(cursor, that.cursor)
            && Objects.equals(node, that.node)
            && Objects.equals(starredAt, that.starredAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor, node, starredAt);
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
        if (starredAt != null) {
            joiner.add("starredAt: " + GraphQLRequestSerializer.getEntry(starredAt));
        }
        return joiner.toString();
    }

    public static StargazerEdgeTO.Builder builder() {
        return new StargazerEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private UserTO node;
        private String starredAt;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(UserTO node) {
            this.node = node;
            return this;
        }

        public Builder setStarredAt(String starredAt) {
            this.starredAt = starredAt;
            return this;
        }


        public StargazerEdgeTO build() {
            return new StargazerEdgeTO(cursor, node, starredAt);
        }

    }
}
