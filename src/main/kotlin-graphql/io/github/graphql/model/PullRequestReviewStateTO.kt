package io.github.graphql.model

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
enum class PullRequestReviewStateTO(val graphqlName: String) {

    APPROVED("APPROVED"),
    CHANGES_REQUESTED("CHANGES_REQUESTED"),
    COMMENTED("COMMENTED"),
    DISMISSED("DISMISSED"),
    PENDING("PENDING")
}
