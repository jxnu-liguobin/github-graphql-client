package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum IssueOrderFieldTO {

    COMMENTS("COMMENTS"),
    CREATED_AT("CREATED_AT"),
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    private IssueOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
