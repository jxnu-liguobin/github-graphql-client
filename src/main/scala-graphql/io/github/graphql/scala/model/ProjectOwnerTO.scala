package io.github.graphql.scala.model


@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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
