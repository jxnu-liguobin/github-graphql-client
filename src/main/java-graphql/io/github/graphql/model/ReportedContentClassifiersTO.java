package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum ReportedContentClassifiersTO {

    ABUSE("ABUSE"),
    OFF_TOPIC("OFF_TOPIC"),
    OUTDATED("OUTDATED"),
    RESOLVED("RESOLVED"),
    SPAM("SPAM");

    private final String graphqlName;

    private ReportedContentClassifiersTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
