package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum ProjectColumnPurposeTO {

    DONE("DONE"),
    IN_PROGRESS("IN_PROGRESS"),
    TODO("TODO");

    private final String graphqlName;

    private ProjectColumnPurposeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}