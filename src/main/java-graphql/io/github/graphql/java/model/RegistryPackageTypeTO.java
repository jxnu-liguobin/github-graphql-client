package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum RegistryPackageTypeTO {

    DEBIAN("DEBIAN"),
    DOCKER("DOCKER"),
    MAVEN("MAVEN"),
    NPM("NPM"),
    NUGET("NUGET"),
    PYTHON("PYTHON"),
    RUBYGEMS("RUBYGEMS");

    private final String graphqlName;

    private RegistryPackageTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
