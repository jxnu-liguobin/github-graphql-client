package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum CommentCannotUpdateReasonTO {

    DENIED("DENIED"),
    INSUFFICIENT_ACCESS("INSUFFICIENT_ACCESS"),
    LOCKED("LOCKED"),
    LOGIN_REQUIRED("LOGIN_REQUIRED"),
    MAINTENANCE("MAINTENANCE"),
    VERIFIED_EMAIL_REQUIRED("VERIFIED_EMAIL_REQUIRED");

    private final String graphqlName;

    private CommentCannotUpdateReasonTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
