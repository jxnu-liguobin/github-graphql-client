package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Repository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface RepositoryResolver {

    @Throws(Exception::class)
    fun assignableUsers(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

    @Throws(Exception::class)
    fun branchProtectionRules(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?): BranchProtectionRuleConnectionTO

    @Throws(Exception::class)
    fun collaborators(repositoryTO: RepositoryTO, affiliation: CollaboratorAffiliationTO?, after: String?, before: String?, first: Int?, last: Int?): RepositoryCollaboratorConnectionTO?

    @Throws(Exception::class)
    fun commitComments(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?): CommitCommentConnectionTO

    @Throws(Exception::class)
    fun deployKeys(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?): DeployKeyConnectionTO

    @Throws(Exception::class)
    fun deployments(repositoryTO: RepositoryTO, after: String?, before: String?, environments: List<String>?, first: Int?, last: Int?, orderBy: DeploymentOrderTO?): DeploymentConnectionTO

    @Throws(Exception::class)
    fun forks(repositoryTO: RepositoryTO, affiliations: List<RepositoryAffiliationTO?>?, after: String?, before: String?, first: Int?, isLocked: Boolean?, last: Int?, orderBy: RepositoryOrderTO?, ownerAffiliations: List<RepositoryAffiliationTO?>?, privacy: RepositoryPrivacyTO?): RepositoryConnectionTO

    @Throws(Exception::class)
    fun issue(repositoryTO: RepositoryTO, number: Int): IssueTO?

    @Throws(Exception::class)
    fun issueOrPullRequest(repositoryTO: RepositoryTO, number: Int): IssueOrPullRequestTO?

    @Throws(Exception::class)
    fun issues(repositoryTO: RepositoryTO, after: String?, before: String?, filterBy: IssueFiltersTO?, first: Int?, labels: List<String>?, last: Int?, orderBy: IssueOrderTO?, states: List<IssueStateTO>?): IssueConnectionTO

    @Throws(Exception::class)
    fun label(repositoryTO: RepositoryTO, name: String): LabelTO?

    @Throws(Exception::class)
    fun labels(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?, query: String?): LabelConnectionTO?

    @Throws(Exception::class)
    fun languages(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: LanguageOrderTO?): LanguageConnectionTO?

    @Throws(Exception::class)
    fun mentionableUsers(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

    @Throws(Exception::class)
    fun milestone(repositoryTO: RepositoryTO, number: Int): MilestoneTO?

    @Throws(Exception::class)
    fun milestones(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: MilestoneOrderTO?, states: List<MilestoneStateTO>?): MilestoneConnectionTO?

    @Throws(Exception::class)
    fun `object`(repositoryTO: RepositoryTO, expression: String?, oid: String?): GitObjectTO?

    @Throws(Exception::class)
    fun project(repositoryTO: RepositoryTO, number: Int): ProjectTO?

    @Throws(Exception::class)
    fun projects(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ProjectOrderTO?, search: String?, states: List<ProjectStateTO>?): ProjectConnectionTO

    @Throws(Exception::class)
    fun pullRequest(repositoryTO: RepositoryTO, number: Int): PullRequestTO?

    @Throws(Exception::class)
    fun pullRequests(repositoryTO: RepositoryTO, after: String?, baseRefName: String?, before: String?, first: Int?, headRefName: String?, labels: List<String>?, last: Int?, orderBy: IssueOrderTO?, states: List<PullRequestStateTO>?): PullRequestConnectionTO

    @Throws(Exception::class)
    fun ref(repositoryTO: RepositoryTO, qualifiedName: String): RefTO?

    @Throws(Exception::class)
    fun refs(repositoryTO: RepositoryTO, after: String?, before: String?, direction: OrderDirectionTO?, first: Int?, last: Int?, orderBy: RefOrderTO?, refPrefix: String): RefConnectionTO?

    @Throws(Exception::class)
    fun registryPackages(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?, name: String?, names: List<String?>?, packageType: RegistryPackageTypeTO?, publicOnly: Boolean?, registryPackageType: String?, repositoryId: String?): RegistryPackageConnectionTO

    @Throws(Exception::class)
    fun release(repositoryTO: RepositoryTO, tagName: String): ReleaseTO?

    @Throws(Exception::class)
    fun releases(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ReleaseOrderTO?): ReleaseConnectionTO

    @Throws(Exception::class)
    fun repositoryTopics(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?): RepositoryTopicConnectionTO

    @Throws(Exception::class)
    fun shortDescriptionHTML(repositoryTO: RepositoryTO, limit: Int?): String

    @Throws(Exception::class)
    fun stargazers(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: StarOrderTO?): StargazerConnectionTO

    @Throws(Exception::class)
    fun watchers(repositoryTO: RepositoryTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

}
