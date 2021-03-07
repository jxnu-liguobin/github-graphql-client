package io.github.graphql.scala.model


@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
trait ContributionTO {

    val isRestricted: Boolean

    @javax.validation.constraints.NotNull
    val occurredAt: String

    @javax.validation.constraints.NotNull
    val resourcePath: String

    @javax.validation.constraints.NotNull
    val url: String

    @javax.validation.constraints.NotNull
    val user: UserTO

}
