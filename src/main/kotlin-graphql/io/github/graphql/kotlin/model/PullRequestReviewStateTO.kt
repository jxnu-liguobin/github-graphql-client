package io.github.graphql.kotlin.model

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
enum class PullRequestReviewStateTO(val graphqlName: String) {

    APPROVED("APPROVED"),
    CHANGES_REQUESTED("CHANGES_REQUESTED"),
    COMMENTED("COMMENTED"),
    DISMISSED("DISMISSED"),
    PENDING("PENDING")
}
