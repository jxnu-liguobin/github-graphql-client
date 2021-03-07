package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum LockReasonTO {

    OFF_TOPIC("OFF_TOPIC"),
    RESOLVED("RESOLVED"),
    SPAM("SPAM"),
    TOO_HEATED("TOO_HEATED");

    private final String graphqlName;

    private LockReasonTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
