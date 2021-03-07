package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum SearchTypeTO {

    ISSUE("ISSUE"),
    REPOSITORY("REPOSITORY"),
    USER("USER");

    private final String graphqlName;

    private SearchTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
