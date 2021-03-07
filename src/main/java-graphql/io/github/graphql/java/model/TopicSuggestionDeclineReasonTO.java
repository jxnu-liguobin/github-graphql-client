package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum TopicSuggestionDeclineReasonTO {

    NOT_RELEVANT("NOT_RELEVANT"),
    PERSONAL_PREFERENCE("PERSONAL_PREFERENCE"),
    TOO_GENERAL("TOO_GENERAL"),
    TOO_SPECIFIC("TOO_SPECIFIC");

    private final String graphqlName;

    private TopicSuggestionDeclineReasonTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
