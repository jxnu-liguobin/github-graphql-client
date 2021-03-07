package io.github.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public interface ContributionTO {

    boolean getIsRestricted();

    @javax.validation.constraints.NotNull
    String getOccurredAt();

    @javax.validation.constraints.NotNull
    String getResourcePath();

    @javax.validation.constraints.NotNull
    String getUrl();

    @javax.validation.constraints.NotNull
    UserTO getUser();

}
