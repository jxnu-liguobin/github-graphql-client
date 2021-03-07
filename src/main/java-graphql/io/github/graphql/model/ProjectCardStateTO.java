package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
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
