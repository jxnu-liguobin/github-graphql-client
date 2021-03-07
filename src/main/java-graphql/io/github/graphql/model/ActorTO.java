package io.github.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public interface ActorTO {

    @javax.validation.constraints.NotNull
    String getLogin();

    @javax.validation.constraints.NotNull
    String getResourcePath();

    @javax.validation.constraints.NotNull
    String getUrl();

}
