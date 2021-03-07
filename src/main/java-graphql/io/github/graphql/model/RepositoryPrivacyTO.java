package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum RepositoryPrivacyTO {

    PRIVATE("PRIVATE"),
    PUBLIC("PUBLIC");

    private final String graphqlName;

    private RepositoryPrivacyTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
