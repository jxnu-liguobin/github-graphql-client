package io.github.graphql.model


@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
trait UniformResourceLocatableTO {

    @javax.validation.constraints.NotNull
    val resourcePath: String

    @javax.validation.constraints.NotNull
    val url: String

}
