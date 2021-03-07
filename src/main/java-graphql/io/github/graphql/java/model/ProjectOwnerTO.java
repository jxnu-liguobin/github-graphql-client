package io.github.graphql.java.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface ProjectOwnerTO {

    @javax.validation.constraints.NotNull
    String getId();

    @javax.validation.constraints.NotNull
    String getProjectsResourcePath();

    @javax.validation.constraints.NotNull
    String getProjectsUrl();

    boolean getViewerCanCreateProjects();

}
