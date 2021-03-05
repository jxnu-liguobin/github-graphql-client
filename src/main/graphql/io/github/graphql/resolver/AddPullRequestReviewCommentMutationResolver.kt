package io.github.graphql.resolver

import io.github.graphql.model.*

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface AddPullRequestReviewCommentMutationResolver {

    @Throws(Exception::class)
    fun addPullRequestReviewComment(input: AddPullRequestReviewCommentInputTO): AddPullRequestReviewCommentPayloadTO?

}
