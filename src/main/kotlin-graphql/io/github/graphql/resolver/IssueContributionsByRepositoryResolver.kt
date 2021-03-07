package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for IssueContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface IssueContributionsByRepositoryResolver {

    @Throws(Exception::class)
    fun contributions(issueContributionsByRepositoryTO: IssueContributionsByRepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedIssueContributionConnectionTO

}
