package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Commit
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface CommitResolver {

    @Throws(Exception::class)
    fun associatedPullRequests(commitTO: CommitTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: PullRequestOrderTO?): PullRequestConnectionTO?

    @Throws(Exception::class)
    fun blame(commitTO: CommitTO, path: String): BlameTO

    @Throws(Exception::class)
    fun comments(commitTO: CommitTO, after: String?, before: String?, first: Int?, last: Int?): CommitCommentConnectionTO

    @Throws(Exception::class)
    fun deployments(commitTO: CommitTO, after: String?, before: String?, environments: List<String>?, first: Int?, last: Int?, orderBy: DeploymentOrderTO?): DeploymentConnectionTO?

    @Throws(Exception::class)
    fun history(commitTO: CommitTO, after: String?, author: CommitAuthorTO?, before: String?, first: Int?, last: Int?, path: String?, since: String?, until: String?): CommitHistoryConnectionTO

    @Throws(Exception::class)
    fun parents(commitTO: CommitTO, after: String?, before: String?, first: Int?, last: Int?): CommitConnectionTO

}
