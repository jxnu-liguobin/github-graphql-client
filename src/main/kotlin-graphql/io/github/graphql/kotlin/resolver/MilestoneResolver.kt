package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Milestone
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface MilestoneResolver {

    @Throws(Exception::class)
    fun issues(milestoneTO: MilestoneTO, after: String?, before: String?, filterBy: IssueFiltersTO?, first: Int?, labels: List<String>?, last: Int?, orderBy: IssueOrderTO?, states: List<IssueStateTO>?): IssueConnectionTO

    @Throws(Exception::class)
    fun pullRequests(milestoneTO: MilestoneTO, after: String?, baseRefName: String?, before: String?, first: Int?, headRefName: String?, labels: List<String>?, last: Int?, orderBy: IssueOrderTO?, states: List<PullRequestStateTO>?): PullRequestConnectionTO

}
