package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum RepositoryAffiliationTO {

    COLLABORATOR("COLLABORATOR"),
    ORGANIZATION_MEMBER("ORGANIZATION_MEMBER"),
    OWNER("OWNER");

    private final String graphqlName;

    private RepositoryAffiliationTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
