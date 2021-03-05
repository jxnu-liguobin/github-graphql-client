package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Ref
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface RefResolver {

    @Throws(Exception::class)
    fun associatedPullRequests(refTO: RefTO, after: String?, baseRefName: String?, before: String?, first: Int?, headRefName: String?, labels: List<String>?, last: Int?, orderBy: IssueOrderTO?, states: List<PullRequestStateTO>?): PullRequestConnectionTO

}
