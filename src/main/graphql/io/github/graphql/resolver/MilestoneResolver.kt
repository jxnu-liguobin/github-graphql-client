package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Milestone
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface MilestoneResolver {

    @Throws(Exception::class)
    fun issues(milestoneTO: MilestoneTO, after: String?, before: String?, filterBy: IssueFiltersTO?, first: Int?, labels: List<String>?, last: Int?, orderBy: IssueOrderTO?, states: List<IssueStateTO>?): IssueConnectionTO

    @Throws(Exception::class)
    fun pullRequests(milestoneTO: MilestoneTO, after: String?, baseRefName: String?, before: String?, first: Int?, headRefName: String?, labels: List<String>?, last: Int?, orderBy: IssueOrderTO?, states: List<PullRequestStateTO>?): PullRequestConnectionTO

}
