package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum SecurityAdvisoryEcosystemTO {

    MAVEN("MAVEN"),
    NPM("NPM"),
    NUGET("NUGET"),
    PIP("PIP"),
    RUBYGEMS("RUBYGEMS");

    private final String graphqlName;

    private SecurityAdvisoryEcosystemTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
