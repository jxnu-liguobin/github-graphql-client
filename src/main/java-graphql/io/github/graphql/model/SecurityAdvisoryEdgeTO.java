package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SecurityAdvisoryEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private SecurityAdvisoryTO node;

    public SecurityAdvisoryEdgeTO() {
    }

    public SecurityAdvisoryEdgeTO(String cursor, SecurityAdvisoryTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public SecurityAdvisoryTO getNode() {
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

    public static SecurityAdvisoryEdgeTO.Builder builder() {
        return new SecurityAdvisoryEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private SecurityAdvisoryTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(SecurityAdvisoryTO node) {
            this.node = node;
            return this;
        }


        public SecurityAdvisoryEdgeTO build() {
            return new SecurityAdvisoryEdgeTO(cursor, node);
        }

    }
}
