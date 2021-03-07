package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedCommitContributionEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CreatedCommitContributionTO node;

    public CreatedCommitContributionEdgeTO() {
    }

    public CreatedCommitContributionEdgeTO(String cursor, CreatedCommitContributionTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public CreatedCommitContributionTO getNode() {
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
        final CreatedCommitContributionEdgeTO that = (CreatedCommitContributionEdgeTO) obj;
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

    public static CreatedCommitContributionEdgeTO.Builder builder() {
        return new CreatedCommitContributionEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private CreatedCommitContributionTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(CreatedCommitContributionTO node) {
            this.node = node;
            return this;
        }


        public CreatedCommitContributionEdgeTO build() {
            return new CreatedCommitContributionEdgeTO(cursor, node);
        }

    }
}
