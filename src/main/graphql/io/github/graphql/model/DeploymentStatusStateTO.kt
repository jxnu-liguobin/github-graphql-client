package io.github.graphql.model

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:08:59+0800"
)
enum class DeploymentStatusStateTO(val graphqlName: String) {

    ERROR("ERROR"),
    FAILURE("FAILURE"),
    INACTIVE("INACTIVE"),
    IN_PROGRESS("IN_PROGRESS"),
    PENDING("PENDING"),
    QUEUED("QUEUED"),
    SUCCESS("SUCCESS")
}
