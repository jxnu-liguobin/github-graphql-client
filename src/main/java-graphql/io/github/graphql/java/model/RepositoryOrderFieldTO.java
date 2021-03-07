package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum RepositoryOrderFieldTO {

    CREATED_AT("CREATED_AT"),
    NAME("NAME"),
    PUSHED_AT("PUSHED_AT"),
    STARGAZERS("STARGAZERS"),
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    private RepositoryOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
