package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeploymentStatusEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private DeploymentStatusTO node;

    public DeploymentStatusEdgeTO() {
    }

    public DeploymentStatusEdgeTO(String cursor, DeploymentStatusTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public DeploymentStatusTO getNode() {
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

    public static DeploymentStatusEdgeTO.Builder builder() {
        return new DeploymentStatusEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private DeploymentStatusTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(DeploymentStatusTO node) {
            this.node = node;
            return this;
        }


        public DeploymentStatusEdgeTO build() {
            return new DeploymentStatusEdgeTO(cursor, node);
        }

    }
}
