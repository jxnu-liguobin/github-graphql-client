package io.github.graphql.java.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface ActorTO {

    @javax.validation.constraints.NotNull
    String getLogin();

    @javax.validation.constraints.NotNull
    String getResourcePath();

    @javax.validation.constraints.NotNull
    String getUrl();

}
