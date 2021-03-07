package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum TeamRepositoryOrderFieldTO {

    CREATED_AT("CREATED_AT"),
    NAME("NAME"),
    PERMISSION("PERMISSION"),
    PUSHED_AT("PUSHED_AT"),
    STARGAZERS("STARGAZERS"),
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    private TeamRepositoryOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
