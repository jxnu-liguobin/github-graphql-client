package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum TeamMembershipTypeTO {

    ALL("ALL"),
    CHILD_TEAM("CHILD_TEAM"),
    IMMEDIATE("IMMEDIATE");

    private final String graphqlName;

    private TeamMembershipTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
