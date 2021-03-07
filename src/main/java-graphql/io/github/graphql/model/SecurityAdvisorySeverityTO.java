package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum SecurityAdvisorySeverityTO {

    CRITICAL("CRITICAL"),
    HIGH("HIGH"),
    LOW("LOW"),
    MODERATE("MODERATE");

    private final String graphqlName;

    private SecurityAdvisorySeverityTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
