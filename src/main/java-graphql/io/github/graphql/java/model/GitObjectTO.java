package io.github.graphql.java.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface GitObjectTO {

    @javax.validation.constraints.NotNull
    String getAbbreviatedOid();

    @javax.validation.constraints.NotNull
    String getCommitResourcePath();

    @javax.validation.constraints.NotNull
    String getCommitUrl();

    @javax.validation.constraints.NotNull
    String getId();

    @javax.validation.constraints.NotNull
    String getOid();

    @javax.validation.constraints.NotNull
    RepositoryTO getRepository();

}
