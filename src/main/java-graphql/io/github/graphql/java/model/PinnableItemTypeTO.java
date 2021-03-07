package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum PinnableItemTypeTO {

    GIST("GIST"),
    ISSUE("ISSUE"),
    ORGANIZATION("ORGANIZATION"),
    PROJECT("PROJECT"),
    PULL_REQUEST("PULL_REQUEST"),
    REPOSITORY("REPOSITORY"),
    TEAM("TEAM"),
    USER("USER");

    private final String graphqlName;

    private PinnableItemTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
