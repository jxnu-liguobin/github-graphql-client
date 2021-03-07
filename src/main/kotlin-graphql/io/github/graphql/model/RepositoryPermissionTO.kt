package io.github.graphql.model

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
enum class RepositoryPermissionTO(val graphqlName: String) {

    ADMIN("ADMIN"),
    MAINTAIN("MAINTAIN"),
    READ("READ"),
    TRIAGE("TRIAGE"),
    WRITE("WRITE")
}
