package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum UserBlockDurationTO {

    ONE_DAY("ONE_DAY"),
    ONE_MONTH("ONE_MONTH"),
    ONE_WEEK("ONE_WEEK"),
    PERMANENT("PERMANENT"),
    THREE_DAYS("THREE_DAYS");

    private final String graphqlName;

    private UserBlockDurationTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
