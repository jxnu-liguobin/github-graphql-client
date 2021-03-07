package io.github.graphql.model


@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
interface GitObjectTO {

    val abbreviatedOid: String

    val commitResourcePath: String

    val commitUrl: String

    val id: String

    val oid: String

    val repository: RepositoryTO

}
