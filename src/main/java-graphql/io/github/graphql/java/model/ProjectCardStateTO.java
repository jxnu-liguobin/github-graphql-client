package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum ProjectCardStateTO {

    CONTENT_ONLY("CONTENT_ONLY"),
    NOTE_ONLY("NOTE_ONLY"),
    REDACTED("REDACTED");

    private final String graphqlName;

    private ProjectCardStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
