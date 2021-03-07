package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for PullRequestReviewThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface PullRequestReviewThreadResolver {

    @Throws(Exception::class)
    fun comments(pullRequestReviewThreadTO: PullRequestReviewThreadTO, after: String?, before: String?, first: Int?, last: Int?): PullRequestReviewCommentConnectionTO

}
