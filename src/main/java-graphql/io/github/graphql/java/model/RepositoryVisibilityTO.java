package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum RepositoryVisibilityTO {

    INTERNAL("INTERNAL"),
    PRIVATE("PRIVATE"),
    PUBLIC("PUBLIC");

    private final String graphqlName;

    private RepositoryVisibilityTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
