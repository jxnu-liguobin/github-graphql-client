package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum PullRequestPubSubTopicTO {

    HEAD_REF("HEAD_REF"),
    MARKASREAD("MARKASREAD"),
    STATE("STATE"),
    TIMELINE("TIMELINE"),
    UPDATED("UPDATED");

    private final String graphqlName;

    private PullRequestPubSubTopicTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
