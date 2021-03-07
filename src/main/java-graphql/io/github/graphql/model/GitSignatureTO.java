package io.github.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public interface GitSignatureTO {

    @javax.validation.constraints.NotNull
    String getEmail();

    boolean getIsValid();

    @javax.validation.constraints.NotNull
    String getPayload();

    @javax.validation.constraints.NotNull
    String getSignature();

    UserTO getSigner();

    @javax.validation.constraints.NotNull
    GitSignatureStateTO getState();

    boolean getWasSignedByGitHub();

}