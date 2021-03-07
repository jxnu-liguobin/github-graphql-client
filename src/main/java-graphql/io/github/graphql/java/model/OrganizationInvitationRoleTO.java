package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum OrganizationInvitationRoleTO {

    ADMIN("ADMIN"),
    BILLING_MANAGER("BILLING_MANAGER"),
    DIRECT_MEMBER("DIRECT_MEMBER"),
    REINSTATE("REINSTATE");

    private final String graphqlName;

    private OrganizationInvitationRoleTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
