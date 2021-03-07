package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import CollaboratorAffiliationTO._
import Seq[RepositoryAffiliationTO]._
import Seq[RepositoryAffiliationTO]._
import RepositoryPrivacyTO._
import Seq[IssueStateTO]._
import Seq[MilestoneStateTO]._
import Seq[ProjectStateTO]._
import Seq[PullRequestStateTO]._
import OrderDirectionTO._
import RegistryPackageTypeTO._

/**
 * Resolver for Repository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait RepositoryResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def assignableUsers(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def branchProtectionRules(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int]): BranchProtectionRuleConnectionTO

    @throws[Exception]
    def collaborators(repositoryTO: RepositoryTO, affiliation: CollaboratorAffiliationTO, after: String, before: String, first: Option[Int], last: Option[Int]): RepositoryCollaboratorConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def commitComments(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int]): CommitCommentConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def deployKeys(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int]): DeployKeyConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def deployments(repositoryTO: RepositoryTO, after: String, before: String, environments: Seq[String], first: Option[Int], last: Option[Int], orderBy: DeploymentOrderTO): DeploymentConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def forks(repositoryTO: RepositoryTO, affiliations: Seq[RepositoryAffiliationTO], after: String, before: String, first: Option[Int], isLocked: Option[Boolean], last: Option[Int], orderBy: RepositoryOrderTO, ownerAffiliations: Seq[RepositoryAffiliationTO], privacy: RepositoryPrivacyTO): RepositoryConnectionTO

    @throws[Exception]
    def issue(repositoryTO: RepositoryTO, number: Int): IssueTO

    @throws[Exception]
    def issueOrPullRequest(repositoryTO: RepositoryTO, number: Int): IssueOrPullRequestTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def issues(repositoryTO: RepositoryTO, after: String, before: String, filterBy: IssueFiltersTO, first: Option[Int], labels: Seq[String], last: Option[Int], orderBy: IssueOrderTO, states: Seq[IssueStateTO]): IssueConnectionTO

    @throws[Exception]
    def label(repositoryTO: RepositoryTO, name: String): LabelTO

    @throws[Exception]
    def labels(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int], query: String): LabelConnectionTO

    @throws[Exception]
    def languages(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: LanguageOrderTO): LanguageConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def mentionableUsers(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserConnectionTO

    @throws[Exception]
    def milestone(repositoryTO: RepositoryTO, number: Int): MilestoneTO

    @throws[Exception]
    def milestones(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: MilestoneOrderTO, states: Seq[MilestoneStateTO]): MilestoneConnectionTO

    @throws[Exception]
    def `object`(repositoryTO: RepositoryTO, expression: String, oid: String): GitObjectTO

    @throws[Exception]
    def project(repositoryTO: RepositoryTO, number: Int): ProjectTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def projects(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: ProjectOrderTO, search: String, states: Seq[ProjectStateTO]): ProjectConnectionTO

    @throws[Exception]
    def pullRequest(repositoryTO: RepositoryTO, number: Int): PullRequestTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pullRequests(repositoryTO: RepositoryTO, after: String, baseRefName: String, before: String, first: Option[Int], headRefName: String, labels: Seq[String], last: Option[Int], orderBy: IssueOrderTO, states: Seq[PullRequestStateTO]): PullRequestConnectionTO

    @throws[Exception]
    def ref(repositoryTO: RepositoryTO, qualifiedName: String): RefTO

    @throws[Exception]
    def refs(repositoryTO: RepositoryTO, after: String, before: String, direction: OrderDirectionTO, first: Option[Int], last: Option[Int], orderBy: RefOrderTO, refPrefix: String): RefConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def registryPackages(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int], name: String, names: Seq[String], packageType: RegistryPackageTypeTO, publicOnly: Option[Boolean], registryPackageType: String, repositoryId: String): RegistryPackageConnectionTO

    @throws[Exception]
    def release(repositoryTO: RepositoryTO, tagName: String): ReleaseTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def releases(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: ReleaseOrderTO): ReleaseConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def repositoryTopics(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int]): RepositoryTopicConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def shortDescriptionHTML(repositoryTO: RepositoryTO, limit: Option[Int]): String

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def stargazers(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: StarOrderTO): StargazerConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def watchers(repositoryTO: RepositoryTO, after: String, before: String, first: Option[Int], last: Option[Int]): UserConnectionTO

}
