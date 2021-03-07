package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreatedRepositoryContributionEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CreatedRepositoryContributionTO node;

    public CreatedRepositoryContributionEdgeTO() {
    }

    public CreatedRepositoryContributionEdgeTO(String cursor, CreatedRepositoryContributionTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public CreatedRepositoryContributionTO getNode() {
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

    public static CreatedRepositoryContributionEdgeTO.Builder builder() {
        return new CreatedRepositoryContributionEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private CreatedRepositoryContributionTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(CreatedRepositoryContributionTO node) {
            this.node = node;
            return this;
        }


        public CreatedRepositoryContributionEdgeTO build() {
            return new CreatedRepositoryContributionEdgeTO(cursor, node);
        }

    }
}
