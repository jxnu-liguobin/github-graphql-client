package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import Seq[RepositoryAffiliationTO]._
import Seq[RepositoryAffiliationTO]._
import RepositoryPrivacyTO._
import Seq[RepositoryAffiliationTO]._
import Seq[RepositoryAffiliationTO]._

/**
 * Resolver for RepositoryOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait RepositoryOwnerResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def avatarUrl(repositoryOwnerTO: RepositoryOwnerTO, size: Option[Int]): String

    @deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pinnedRepositories(repositoryOwnerTO: RepositoryOwnerTO, affiliations: Seq[RepositoryAffiliationTO], after: String, before: String, first: Option[Int], isLocked: Option[Boolean], last: Option[Int], orderBy: RepositoryOrderTO, ownerAffiliations: Seq[RepositoryAffiliationTO], privacy: RepositoryPrivacyTO): RepositoryConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def repositories(repositoryOwnerTO: RepositoryOwnerTO, affiliations: Seq[RepositoryAffiliationTO], after: String, before: String, first: Option[Int], isFork: Option[Boolean], isLocked: Option[Boolean], last: Option[Int], orderBy: RepositoryOrderTO, ownerAffiliations: Seq[RepositoryAffiliationTO], privacy: RepositoryPrivacyTO): RepositoryConnectionTO

    @throws[Exception]
    def repository(repositoryOwnerTO: RepositoryOwnerTO, name: String): RepositoryTO

}
