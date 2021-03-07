package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum PullRequestReviewStateTO {

    APPROVED("APPROVED"),
    CHANGES_REQUESTED("CHANGES_REQUESTED"),
    COMMENTED("COMMENTED"),
    DISMISSED("DISMISSED"),
    PENDING("PENDING");

    private final String graphqlName;

    private PullRequestReviewStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
