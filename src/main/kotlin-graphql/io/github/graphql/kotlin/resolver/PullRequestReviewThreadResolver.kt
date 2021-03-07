package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for PullRequestReviewThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface PullRequestReviewThreadResolver {

    @Throws(Exception::class)
    fun comments(pullRequestReviewThreadTO: PullRequestReviewThreadTO, after: String?, before: String?, first: Int?, last: Int?): PullRequestReviewCommentConnectionTO

}
