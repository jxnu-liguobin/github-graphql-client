package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum IssuePubSubTopicTO {

    MARKASREAD("MARKASREAD"),
    STATE("STATE"),
    TIMELINE("TIMELINE"),
    UPDATED("UPDATED");

    private final String graphqlName;

    private IssuePubSubTopicTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
