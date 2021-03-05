package io.github.graphql.model

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:08:59+0800"
)
enum class PinnableItemTypeTO(val graphqlName: String) {

    GIST("GIST"),
    ISSUE("ISSUE"),
    ORGANIZATION("ORGANIZATION"),
    PROJECT("PROJECT"),
    PULL_REQUEST("PULL_REQUEST"),
    REPOSITORY("REPOSITORY"),
    TEAM("TEAM"),
    USER("USER")
}
