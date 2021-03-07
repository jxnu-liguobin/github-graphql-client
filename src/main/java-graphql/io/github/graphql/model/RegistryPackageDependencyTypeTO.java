package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum RegistryPackageDependencyTypeTO {

    BUNDLED("BUNDLED"),
    DEFAULT("DEFAULT"),
    DEV("DEV"),
    OPTIONAL("OPTIONAL"),
    PEER("PEER"),
    TEST("TEST");

    private final String graphqlName;

    private RegistryPackageDependencyTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
