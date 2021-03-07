package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreatedPullRequestReviewContributionEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    private CreatedPullRequestReviewContributionTO node;

    public CreatedPullRequestReviewContributionEdgeTO() {
    }

    public CreatedPullRequestReviewContributionEdgeTO(String cursor, CreatedPullRequestReviewContributionTO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public CreatedPullRequestReviewContributionTO getNode() {
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

    public static CreatedPullRequestReviewContributionEdgeTO.Builder builder() {
        return new CreatedPullRequestReviewContributionEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private CreatedPullRequestReviewContributionTO node;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(CreatedPullRequestReviewContributionTO node) {
            this.node = node;
            return this;
        }


        public CreatedPullRequestReviewContributionEdgeTO build() {
            return new CreatedPullRequestReviewContributionEdgeTO(cursor, node);
        }

    }
}
