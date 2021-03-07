package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for PullRequestCommitCommentThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
interface PullRequestCommitCommentThreadResolver {

    @Throws(Exception::class)
    fun comments(pullRequestCommitCommentThreadTO: PullRequestCommitCommentThreadTO, after: String?, before: String?, first: Int?, last: Int?): CommitCommentConnectionTO

}
