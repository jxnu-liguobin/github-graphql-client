package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum IdentityProviderConfigurationStateTO {

    CONFIGURED("CONFIGURED"),
    ENFORCED("ENFORCED"),
    UNCONFIGURED("UNCONFIGURED");

    private final String graphqlName;

    private IdentityProviderConfigurationStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
