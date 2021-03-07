package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum RepositoryContributionTypeTO {

    COMMIT("COMMIT"),
    ISSUE("ISSUE"),
    PULL_REQUEST("PULL_REQUEST"),
    PULL_REQUEST_REVIEW("PULL_REQUEST_REVIEW"),
    REPOSITORY("REPOSITORY");

    private final String graphqlName;

    private RepositoryContributionTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
