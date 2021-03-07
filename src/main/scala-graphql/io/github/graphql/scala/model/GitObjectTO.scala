package io.github.graphql.scala.model


@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
trait GitObjectTO {

    @javax.validation.constraints.NotNull
    val abbreviatedOid: String

    @javax.validation.constraints.NotNull
    val commitResourcePath: String

    @javax.validation.constraints.NotNull
    val commitUrl: String

    @javax.validation.constraints.NotNull
    val id: String

    @javax.validation.constraints.NotNull
    val oid: String

    @javax.validation.constraints.NotNull
    val repository: RepositoryTO

}
