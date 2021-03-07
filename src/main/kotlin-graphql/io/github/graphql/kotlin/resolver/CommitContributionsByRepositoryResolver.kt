package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for CommitContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface CommitContributionsByRepositoryResolver {

    @Throws(Exception::class)
    fun contributions(commitContributionsByRepositoryTO: CommitContributionsByRepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: CommitContributionOrderTO?): CreatedCommitContributionConnectionTO

}
