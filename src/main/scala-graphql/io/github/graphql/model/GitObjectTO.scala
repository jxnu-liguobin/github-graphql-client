package io.github.graphql.model


@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
