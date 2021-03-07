package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for CommitContributionsByRepository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait CommitContributionsByRepositoryResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def contributions(commitContributionsByRepositoryTO: CommitContributionsByRepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: CommitContributionOrderTO): CreatedCommitContributionConnectionTO

}
