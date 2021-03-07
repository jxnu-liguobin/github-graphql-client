package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for CommitContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface CommitContributionsByRepositoryResolver {

    @Throws(Exception::class)
    fun contributions(commitContributionsByRepositoryTO: CommitContributionsByRepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: CommitContributionOrderTO?): CreatedCommitContributionConnectionTO

}
