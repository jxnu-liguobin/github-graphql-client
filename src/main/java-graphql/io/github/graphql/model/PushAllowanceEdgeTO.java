package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PushAllowanceEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private PushAllowanceTO node;

    public PushAllowanceEdgeTO() {
    }

    public PushAllowanceEdgeTO(String cursor, PushAllowanceTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public PushAllowanceTO getNode() {
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

    public static PushAllowanceEdgeTO.Builder builder() {
        return new PushAllowanceEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private PushAllowanceTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(PushAllowanceTO node) {
            this.node = node;
            return this;
        }


        public PushAllowanceEdgeTO build() {
            return new PushAllowanceEdgeTO(cursor, node);
        }

    }
}
