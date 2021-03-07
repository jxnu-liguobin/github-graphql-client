package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum DeploymentStateTO {

    ABANDONED("ABANDONED"),
    ACTIVE("ACTIVE"),
    DESTROYED("DESTROYED"),
    ERROR("ERROR"),
    FAILURE("FAILURE"),
    INACTIVE("INACTIVE"),
    IN_PROGRESS("IN_PROGRESS"),
    PENDING("PENDING"),
    QUEUED("QUEUED");

    private final String graphqlName;

    private DeploymentStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
