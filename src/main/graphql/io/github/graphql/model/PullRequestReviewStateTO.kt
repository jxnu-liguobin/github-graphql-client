package io.github.graphql.model

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:08:59+0800"
)
enum class PullRequestReviewStateTO(val graphqlName: String) {

    APPROVED("APPROVED"),
    CHANGES_REQUESTED("CHANGES_REQUESTED"),
    COMMENTED("COMMENTED"),
    DISMISSED("DISMISSED"),
    PENDING("PENDING")
}
