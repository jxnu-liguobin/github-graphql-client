package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum StatusStateTO {

    ERROR("ERROR"),
    EXPECTED("EXPECTED"),
    FAILURE("FAILURE"),
    PENDING("PENDING"),
    SUCCESS("SUCCESS");

    private final String graphqlName;

    private StatusStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
