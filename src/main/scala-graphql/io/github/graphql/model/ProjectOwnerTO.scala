package io.github.graphql.model


@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
trait ProjectOwnerTO {

    @javax.validation.constraints.NotNull
    val id: String

    @javax.validation.constraints.NotNull
    val projectsResourcePath: String

    @javax.validation.constraints.NotNull
    val projectsUrl: String

    val viewerCanCreateProjects: Boolean

}
