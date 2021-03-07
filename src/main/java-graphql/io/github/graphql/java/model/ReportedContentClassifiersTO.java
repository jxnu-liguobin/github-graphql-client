package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
