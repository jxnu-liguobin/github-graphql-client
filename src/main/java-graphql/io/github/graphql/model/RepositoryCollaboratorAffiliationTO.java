package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum RepositoryCollaboratorAffiliationTO {

    ALL("ALL"),
    OUTSIDE("OUTSIDE");

    private final String graphqlName;

    private RepositoryCollaboratorAffiliationTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
