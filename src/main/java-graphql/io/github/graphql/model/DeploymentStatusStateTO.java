package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum DeploymentStatusStateTO {

    ERROR("ERROR"),
    FAILURE("FAILURE"),
    INACTIVE("INACTIVE"),
    IN_PROGRESS("IN_PROGRESS"),
    PENDING("PENDING"),
    QUEUED("QUEUED"),
    SUCCESS("SUCCESS");

    private final String graphqlName;

    private DeploymentStatusStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
