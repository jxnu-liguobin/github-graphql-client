package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReviewDismissalAllowanceEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ReviewDismissalAllowanceTO node;

    public ReviewDismissalAllowanceEdgeTO() {
    }

    public ReviewDismissalAllowanceEdgeTO(String cursor, ReviewDismissalAllowanceTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public ReviewDismissalAllowanceTO getNode() {
        return node;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ReviewDismissalAllowanceEdgeTO that = (ReviewDismissalAllowanceEdgeTO) obj;
        return Objects.equals(cursor, that.cursor)
            && Objects.equals(node, that.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor, node);
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

    public static ReviewDismissalAllowanceEdgeTO.Builder builder() {
        return new ReviewDismissalAllowanceEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private ReviewDismissalAllowanceTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(ReviewDismissalAllowanceTO node) {
            this.node = node;
            return this;
        }


        public ReviewDismissalAllowanceEdgeTO build() {
            return new ReviewDismissalAllowanceEdgeTO(cursor, node);
        }

    }
}
