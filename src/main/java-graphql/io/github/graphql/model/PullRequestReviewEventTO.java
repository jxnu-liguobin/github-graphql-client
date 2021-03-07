package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum PullRequestReviewEventTO {

    APPROVE("APPROVE"),
    COMMENT("COMMENT"),
    DISMISS("DISMISS"),
    REQUEST_CHANGES("REQUEST_CHANGES");

    private final String graphqlName;

    private PullRequestReviewEventTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
