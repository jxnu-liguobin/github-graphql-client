package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum ReactionContentTO {

    CONFUSED("CONFUSED"),
    EYES("EYES"),
    HEART("HEART"),
    HOORAY("HOORAY"),
    LAUGH("LAUGH"),
    ROCKET("ROCKET"),
    THUMBS_DOWN("THUMBS_DOWN"),
    THUMBS_UP("THUMBS_UP");

    private final String graphqlName;

    private ReactionContentTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
