package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Repository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RepositoryResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", 0) + 1
            this.assignableUsers(UserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", 0) + 1
            this.branchProtectionRules(BranchProtectionRuleConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) + 1
            this.codeOfConduct(CodeOfConductResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", 0) + 1
            this.collaborators(RepositoryCollaboratorConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) + 1
            this.commitComments(CommitCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0)))
        }
        this.createdAt()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RefResponseProjection.defaultBranchRef"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", 0) + 1
            this.defaultBranchRef(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", 0) + 1
            this.deployKeys(DeployKeyConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) + 1
            this.deployments(DeploymentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", 0)))
        }
        this.description()
        this.descriptionHTML()
        this.diskUsage()
        this.forkCount()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", 0) + 1
            this.forks(RepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", 0)))
        }
        this.hasIssuesEnabled()
        this.hasWikiEnabled()
        this.homepageUrl()
        this.id()
        this.isArchived()
        this.isDisabled()
        this.isFork()
        this.isLocked()
        this.isMirror()
        this.isPrivate()
        this.isTemplate()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueResponseProjection.issue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", 0) + 1
            this.issueOrPullRequest(IssueOrPullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.IssueConnectionResponseProjection.issues"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1
            this.issues(IssueConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelResponseProjection.label", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.LabelResponseProjection.label"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelResponseProjection.label", 0) + 1
            this.label(LabelResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelResponseProjection.label", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.LabelConnectionResponseProjection.labels"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1
            this.labels(LabelConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.LanguageConnectionResponseProjection.languages"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", 0) + 1
            this.languages(LanguageConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.LicenseResponseProjection.licenseInfo"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", 0) + 1
            this.licenseInfo(LicenseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", 0)))
        }
        this.lockReason()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", 0) + 1
            this.mentionableUsers(UserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", 0)))
        }
        this.mergeCommitAllowed()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneResponseProjection.milestone", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.MilestoneResponseProjection.milestone"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneResponseProjection.milestone", 0) + 1
            this.milestone(MilestoneResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneResponseProjection.milestone", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", 0) + 1
            this.milestones(MilestoneConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", 0)))
        }
        this.mirrorUrl()
        this.name()
        this.nameWithOwner()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.GitObjectResponseProjection.`object`", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.GitObjectResponseProjection.`object`"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.GitObjectResponseProjection.`object`", 0) + 1
            this.`object`(GitObjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.GitObjectResponseProjection.`object`", 0)))
        }
        this.openGraphImageUrl()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", 0) + 1
            this.owner(RepositoryOwnerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.parent", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RepositoryResponseProjection.parent"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.parent", 0) + 1
            this.parent(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.parent", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", 0) + 1
            this.primaryLanguage(LanguageResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.ProjectConnectionResponseProjection.projects"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1
            this.projects(ProjectConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", 0)))
        }
        this.projectsResourcePath()
        this.projectsUrl()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1
            this.pullRequests(PullRequestConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)))
        }
        this.pushedAt()
        this.rebaseMergeAllowed()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RefResponseProjection.ref"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.ref", 0) + 1
            this.ref(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.ref", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefConnectionResponseProjection.refs", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RefConnectionResponseProjection.refs"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefConnectionResponseProjection.refs", 0) + 1
            this.refs(RefConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefConnectionResponseProjection.refs", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1
            this.registryPackages(RegistryPackageConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseResponseProjection.release", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.ReleaseResponseProjection.release"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseResponseProjection.release", 0) + 1
            this.release(ReleaseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseResponseProjection.release", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", 0) + 1
            this.releases(ReleaseConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", 0) + 1
            this.repositoryTopics(RepositoryTopicConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", 0)))
        }
        this.resourcePath()
        this.shortDescriptionHTML()
        this.squashMergeAllowed()
        this.sshUrl()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1
            this.stargazers(StargazerConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.RepositoryResponseProjection.templateRepository"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", 0) + 1
            this.templateRepository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", 0)))
        }
        this.updatedAt()
        this.url()
        this.usesCustomOpenGraphImage()
        this.viewerCanAdminister()
        this.viewerCanCreateProjects()
        this.viewerCanSubscribe()
        this.viewerCanUpdateTopics()
        this.viewerHasStarred()
        this.viewerPermission()
        this.viewerSubscription()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryResponseProjection.UserConnectionResponseProjection.watchers"] = projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", 0) + 1
            this.watchers(UserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", 0)))
        }
        this.typename()
        return this
    }

    fun assignableUsers(subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = assignableUsers(null, subProjection)

    fun assignableUsers(alias: String?, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("assignableUsers").alias(alias).projection(subProjection))
        return this
    }

    fun assignableUsers(input: RepositoryAssignableUsersParametrizedInput, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = assignableUsers(null, input, subProjection)

    fun assignableUsers(alias: String?, input: RepositoryAssignableUsersParametrizedInput, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("assignableUsers").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun branchProtectionRules(subProjection: BranchProtectionRuleConnectionResponseProjection): RepositoryResponseProjection = branchProtectionRules(null, subProjection)

    fun branchProtectionRules(alias: String?, subProjection: BranchProtectionRuleConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("branchProtectionRules").alias(alias).projection(subProjection))
        return this
    }

    fun branchProtectionRules(input: RepositoryBranchProtectionRulesParametrizedInput, subProjection: BranchProtectionRuleConnectionResponseProjection): RepositoryResponseProjection = branchProtectionRules(null, input, subProjection)

    fun branchProtectionRules(alias: String?, input: RepositoryBranchProtectionRulesParametrizedInput, subProjection: BranchProtectionRuleConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("branchProtectionRules").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun codeOfConduct(subProjection: CodeOfConductResponseProjection): RepositoryResponseProjection = codeOfConduct(null, subProjection)

    fun codeOfConduct(alias: String?, subProjection: CodeOfConductResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("codeOfConduct").alias(alias).projection(subProjection))
        return this
    }

    fun collaborators(subProjection: RepositoryCollaboratorConnectionResponseProjection): RepositoryResponseProjection = collaborators(null, subProjection)

    fun collaborators(alias: String?, subProjection: RepositoryCollaboratorConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("collaborators").alias(alias).projection(subProjection))
        return this
    }

    fun collaborators(input: RepositoryCollaboratorsParametrizedInput, subProjection: RepositoryCollaboratorConnectionResponseProjection): RepositoryResponseProjection = collaborators(null, input, subProjection)

    fun collaborators(alias: String?, input: RepositoryCollaboratorsParametrizedInput, subProjection: RepositoryCollaboratorConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("collaborators").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun commitComments(subProjection: CommitCommentConnectionResponseProjection): RepositoryResponseProjection = commitComments(null, subProjection)

    fun commitComments(alias: String?, subProjection: CommitCommentConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("commitComments").alias(alias).projection(subProjection))
        return this
    }

    fun commitComments(input: RepositoryCommitCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): RepositoryResponseProjection = commitComments(null, input, subProjection)

    fun commitComments(alias: String?, input: RepositoryCommitCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("commitComments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createdAt(): RepositoryResponseProjection = createdAt(null)

    fun createdAt(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): RepositoryResponseProjection = databaseId(null)

    fun databaseId(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun defaultBranchRef(subProjection: RefResponseProjection): RepositoryResponseProjection = defaultBranchRef(null, subProjection)

    fun defaultBranchRef(alias: String?, subProjection: RefResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("defaultBranchRef").alias(alias).projection(subProjection))
        return this
    }

    fun deployKeys(subProjection: DeployKeyConnectionResponseProjection): RepositoryResponseProjection = deployKeys(null, subProjection)

    fun deployKeys(alias: String?, subProjection: DeployKeyConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("deployKeys").alias(alias).projection(subProjection))
        return this
    }

    fun deployKeys(input: RepositoryDeployKeysParametrizedInput, subProjection: DeployKeyConnectionResponseProjection): RepositoryResponseProjection = deployKeys(null, input, subProjection)

    fun deployKeys(alias: String?, input: RepositoryDeployKeysParametrizedInput, subProjection: DeployKeyConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("deployKeys").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun deployments(subProjection: DeploymentConnectionResponseProjection): RepositoryResponseProjection = deployments(null, subProjection)

    fun deployments(alias: String?, subProjection: DeploymentConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("deployments").alias(alias).projection(subProjection))
        return this
    }

    fun deployments(input: RepositoryDeploymentsParametrizedInput, subProjection: DeploymentConnectionResponseProjection): RepositoryResponseProjection = deployments(null, input, subProjection)

    fun deployments(alias: String?, input: RepositoryDeploymentsParametrizedInput, subProjection: DeploymentConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("deployments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun description(): RepositoryResponseProjection = description(null)

    fun description(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun descriptionHTML(): RepositoryResponseProjection = descriptionHTML(null)

    fun descriptionHTML(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("descriptionHTML").alias(alias))
        return this
    }

    fun diskUsage(): RepositoryResponseProjection = diskUsage(null)

    fun diskUsage(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("diskUsage").alias(alias))
        return this
    }

    fun forkCount(): RepositoryResponseProjection = forkCount(null)

    fun forkCount(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("forkCount").alias(alias))
        return this
    }

    fun forks(subProjection: RepositoryConnectionResponseProjection): RepositoryResponseProjection = forks(null, subProjection)

    fun forks(alias: String?, subProjection: RepositoryConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("forks").alias(alias).projection(subProjection))
        return this
    }

    fun forks(input: RepositoryForksParametrizedInput, subProjection: RepositoryConnectionResponseProjection): RepositoryResponseProjection = forks(null, input, subProjection)

    fun forks(alias: String?, input: RepositoryForksParametrizedInput, subProjection: RepositoryConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("forks").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun hasIssuesEnabled(): RepositoryResponseProjection = hasIssuesEnabled(null)

    fun hasIssuesEnabled(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("hasIssuesEnabled").alias(alias))
        return this
    }

    fun hasWikiEnabled(): RepositoryResponseProjection = hasWikiEnabled(null)

    fun hasWikiEnabled(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("hasWikiEnabled").alias(alias))
        return this
    }

    fun homepageUrl(): RepositoryResponseProjection = homepageUrl(null)

    fun homepageUrl(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("homepageUrl").alias(alias))
        return this
    }

    fun id(): RepositoryResponseProjection = id(null)

    fun id(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isArchived(): RepositoryResponseProjection = isArchived(null)

    fun isArchived(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("isArchived").alias(alias))
        return this
    }

    fun isDisabled(): RepositoryResponseProjection = isDisabled(null)

    fun isDisabled(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("isDisabled").alias(alias))
        return this
    }

    fun isFork(): RepositoryResponseProjection = isFork(null)

    fun isFork(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("isFork").alias(alias))
        return this
    }

    fun isLocked(): RepositoryResponseProjection = isLocked(null)

    fun isLocked(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("isLocked").alias(alias))
        return this
    }

    fun isMirror(): RepositoryResponseProjection = isMirror(null)

    fun isMirror(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("isMirror").alias(alias))
        return this
    }

    fun isPrivate(): RepositoryResponseProjection = isPrivate(null)

    fun isPrivate(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("isPrivate").alias(alias))
        return this
    }

    fun isTemplate(): RepositoryResponseProjection = isTemplate(null)

    fun isTemplate(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("isTemplate").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): RepositoryResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun issue(input: RepositoryIssueParametrizedInput, subProjection: IssueResponseProjection): RepositoryResponseProjection = issue(null, input, subProjection)

    fun issue(alias: String?, input: RepositoryIssueParametrizedInput, subProjection: IssueResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun issueOrPullRequest(subProjection: IssueOrPullRequestResponseProjection): RepositoryResponseProjection = issueOrPullRequest(null, subProjection)

    fun issueOrPullRequest(alias: String?, subProjection: IssueOrPullRequestResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("issueOrPullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun issueOrPullRequest(input: RepositoryIssueOrPullRequestParametrizedInput, subProjection: IssueOrPullRequestResponseProjection): RepositoryResponseProjection = issueOrPullRequest(null, input, subProjection)

    fun issueOrPullRequest(alias: String?, input: RepositoryIssueOrPullRequestParametrizedInput, subProjection: IssueOrPullRequestResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("issueOrPullRequest").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun issues(subProjection: IssueConnectionResponseProjection): RepositoryResponseProjection = issues(null, subProjection)

    fun issues(alias: String?, subProjection: IssueConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("issues").alias(alias).projection(subProjection))
        return this
    }

    fun issues(input: RepositoryIssuesParametrizedInput, subProjection: IssueConnectionResponseProjection): RepositoryResponseProjection = issues(null, input, subProjection)

    fun issues(alias: String?, input: RepositoryIssuesParametrizedInput, subProjection: IssueConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun label(subProjection: LabelResponseProjection): RepositoryResponseProjection = label(null, subProjection)

    fun label(alias: String?, subProjection: LabelResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("label").alias(alias).projection(subProjection))
        return this
    }

    fun label(input: RepositoryLabelParametrizedInput, subProjection: LabelResponseProjection): RepositoryResponseProjection = label(null, input, subProjection)

    fun label(alias: String?, input: RepositoryLabelParametrizedInput, subProjection: LabelResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("label").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun labels(subProjection: LabelConnectionResponseProjection): RepositoryResponseProjection = labels(null, subProjection)

    fun labels(alias: String?, subProjection: LabelConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("labels").alias(alias).projection(subProjection))
        return this
    }

    fun labels(input: RepositoryLabelsParametrizedInput, subProjection: LabelConnectionResponseProjection): RepositoryResponseProjection = labels(null, input, subProjection)

    fun labels(alias: String?, input: RepositoryLabelsParametrizedInput, subProjection: LabelConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun languages(subProjection: LanguageConnectionResponseProjection): RepositoryResponseProjection = languages(null, subProjection)

    fun languages(alias: String?, subProjection: LanguageConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("languages").alias(alias).projection(subProjection))
        return this
    }

    fun languages(input: RepositoryLanguagesParametrizedInput, subProjection: LanguageConnectionResponseProjection): RepositoryResponseProjection = languages(null, input, subProjection)

    fun languages(alias: String?, input: RepositoryLanguagesParametrizedInput, subProjection: LanguageConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("languages").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun licenseInfo(subProjection: LicenseResponseProjection): RepositoryResponseProjection = licenseInfo(null, subProjection)

    fun licenseInfo(alias: String?, subProjection: LicenseResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("licenseInfo").alias(alias).projection(subProjection))
        return this
    }

    fun lockReason(): RepositoryResponseProjection = lockReason(null)

    fun lockReason(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("lockReason").alias(alias))
        return this
    }

    fun mentionableUsers(subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = mentionableUsers(null, subProjection)

    fun mentionableUsers(alias: String?, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("mentionableUsers").alias(alias).projection(subProjection))
        return this
    }

    fun mentionableUsers(input: RepositoryMentionableUsersParametrizedInput, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = mentionableUsers(null, input, subProjection)

    fun mentionableUsers(alias: String?, input: RepositoryMentionableUsersParametrizedInput, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("mentionableUsers").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun mergeCommitAllowed(): RepositoryResponseProjection = mergeCommitAllowed(null)

    fun mergeCommitAllowed(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("mergeCommitAllowed").alias(alias))
        return this
    }

    fun milestone(subProjection: MilestoneResponseProjection): RepositoryResponseProjection = milestone(null, subProjection)

    fun milestone(alias: String?, subProjection: MilestoneResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("milestone").alias(alias).projection(subProjection))
        return this
    }

    fun milestone(input: RepositoryMilestoneParametrizedInput, subProjection: MilestoneResponseProjection): RepositoryResponseProjection = milestone(null, input, subProjection)

    fun milestone(alias: String?, input: RepositoryMilestoneParametrizedInput, subProjection: MilestoneResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("milestone").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun milestones(subProjection: MilestoneConnectionResponseProjection): RepositoryResponseProjection = milestones(null, subProjection)

    fun milestones(alias: String?, subProjection: MilestoneConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("milestones").alias(alias).projection(subProjection))
        return this
    }

    fun milestones(input: RepositoryMilestonesParametrizedInput, subProjection: MilestoneConnectionResponseProjection): RepositoryResponseProjection = milestones(null, input, subProjection)

    fun milestones(alias: String?, input: RepositoryMilestonesParametrizedInput, subProjection: MilestoneConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("milestones").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun mirrorUrl(): RepositoryResponseProjection = mirrorUrl(null)

    fun mirrorUrl(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("mirrorUrl").alias(alias))
        return this
    }

    fun name(): RepositoryResponseProjection = name(null)

    fun name(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun nameWithOwner(): RepositoryResponseProjection = nameWithOwner(null)

    fun nameWithOwner(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("nameWithOwner").alias(alias))
        return this
    }

    fun `object`(subProjection: GitObjectResponseProjection): RepositoryResponseProjection = `object`(null, subProjection)

    fun `object`(alias: String?, subProjection: GitObjectResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("object").alias(alias).projection(subProjection))
        return this
    }

    fun `object`(input: RepositoryObjectParametrizedInput, subProjection: GitObjectResponseProjection): RepositoryResponseProjection = `object`(null, input, subProjection)

    fun `object`(alias: String?, input: RepositoryObjectParametrizedInput, subProjection: GitObjectResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("object").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun openGraphImageUrl(): RepositoryResponseProjection = openGraphImageUrl(null)

    fun openGraphImageUrl(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("openGraphImageUrl").alias(alias))
        return this
    }

    fun owner(subProjection: RepositoryOwnerResponseProjection): RepositoryResponseProjection = owner(null, subProjection)

    fun owner(alias: String?, subProjection: RepositoryOwnerResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("owner").alias(alias).projection(subProjection))
        return this
    }

    fun parent(subProjection: RepositoryResponseProjection): RepositoryResponseProjection = parent(null, subProjection)

    fun parent(alias: String?, subProjection: RepositoryResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("parent").alias(alias).projection(subProjection))
        return this
    }

    fun primaryLanguage(subProjection: LanguageResponseProjection): RepositoryResponseProjection = primaryLanguage(null, subProjection)

    fun primaryLanguage(alias: String?, subProjection: LanguageResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("primaryLanguage").alias(alias).projection(subProjection))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): RepositoryResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun project(input: RepositoryProjectParametrizedInput, subProjection: ProjectResponseProjection): RepositoryResponseProjection = project(null, input, subProjection)

    fun project(alias: String?, input: RepositoryProjectParametrizedInput, subProjection: ProjectResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun projects(subProjection: ProjectConnectionResponseProjection): RepositoryResponseProjection = projects(null, subProjection)

    fun projects(alias: String?, subProjection: ProjectConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("projects").alias(alias).projection(subProjection))
        return this
    }

    fun projects(input: RepositoryProjectsParametrizedInput, subProjection: ProjectConnectionResponseProjection): RepositoryResponseProjection = projects(null, input, subProjection)

    fun projects(alias: String?, input: RepositoryProjectsParametrizedInput, subProjection: ProjectConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun projectsResourcePath(): RepositoryResponseProjection = projectsResourcePath(null)

    fun projectsResourcePath(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("projectsResourcePath").alias(alias))
        return this
    }

    fun projectsUrl(): RepositoryResponseProjection = projectsUrl(null)

    fun projectsUrl(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("projectsUrl").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): RepositoryResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequest(input: RepositoryPullRequestParametrizedInput, subProjection: PullRequestResponseProjection): RepositoryResponseProjection = pullRequest(null, input, subProjection)

    fun pullRequest(alias: String?, input: RepositoryPullRequestParametrizedInput, subProjection: PullRequestResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pullRequests(subProjection: PullRequestConnectionResponseProjection): RepositoryResponseProjection = pullRequests(null, subProjection)

    fun pullRequests(alias: String?, subProjection: PullRequestConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("pullRequests").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequests(input: RepositoryPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): RepositoryResponseProjection = pullRequests(null, input, subProjection)

    fun pullRequests(alias: String?, input: RepositoryPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pushedAt(): RepositoryResponseProjection = pushedAt(null)

    fun pushedAt(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("pushedAt").alias(alias))
        return this
    }

    fun rebaseMergeAllowed(): RepositoryResponseProjection = rebaseMergeAllowed(null)

    fun rebaseMergeAllowed(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("rebaseMergeAllowed").alias(alias))
        return this
    }

    fun ref(subProjection: RefResponseProjection): RepositoryResponseProjection = ref(null, subProjection)

    fun ref(alias: String?, subProjection: RefResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("ref").alias(alias).projection(subProjection))
        return this
    }

    fun ref(input: RepositoryRefParametrizedInput, subProjection: RefResponseProjection): RepositoryResponseProjection = ref(null, input, subProjection)

    fun ref(alias: String?, input: RepositoryRefParametrizedInput, subProjection: RefResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("ref").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun refs(subProjection: RefConnectionResponseProjection): RepositoryResponseProjection = refs(null, subProjection)

    fun refs(alias: String?, subProjection: RefConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("refs").alias(alias).projection(subProjection))
        return this
    }

    fun refs(input: RepositoryRefsParametrizedInput, subProjection: RefConnectionResponseProjection): RepositoryResponseProjection = refs(null, input, subProjection)

    fun refs(alias: String?, input: RepositoryRefsParametrizedInput, subProjection: RefConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("refs").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun registryPackages(subProjection: RegistryPackageConnectionResponseProjection): RepositoryResponseProjection = registryPackages(null, subProjection)

    fun registryPackages(alias: String?, subProjection: RegistryPackageConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("registryPackages").alias(alias).projection(subProjection))
        return this
    }

    fun registryPackages(input: RepositoryRegistryPackagesParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): RepositoryResponseProjection = registryPackages(null, input, subProjection)

    fun registryPackages(alias: String?, input: RepositoryRegistryPackagesParametrizedInput, subProjection: RegistryPackageConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun release(subProjection: ReleaseResponseProjection): RepositoryResponseProjection = release(null, subProjection)

    fun release(alias: String?, subProjection: ReleaseResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("release").alias(alias).projection(subProjection))
        return this
    }

    fun release(input: RepositoryReleaseParametrizedInput, subProjection: ReleaseResponseProjection): RepositoryResponseProjection = release(null, input, subProjection)

    fun release(alias: String?, input: RepositoryReleaseParametrizedInput, subProjection: ReleaseResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("release").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun releases(subProjection: ReleaseConnectionResponseProjection): RepositoryResponseProjection = releases(null, subProjection)

    fun releases(alias: String?, subProjection: ReleaseConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("releases").alias(alias).projection(subProjection))
        return this
    }

    fun releases(input: RepositoryReleasesParametrizedInput, subProjection: ReleaseConnectionResponseProjection): RepositoryResponseProjection = releases(null, input, subProjection)

    fun releases(alias: String?, input: RepositoryReleasesParametrizedInput, subProjection: ReleaseConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("releases").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repositoryTopics(subProjection: RepositoryTopicConnectionResponseProjection): RepositoryResponseProjection = repositoryTopics(null, subProjection)

    fun repositoryTopics(alias: String?, subProjection: RepositoryTopicConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("repositoryTopics").alias(alias).projection(subProjection))
        return this
    }

    fun repositoryTopics(input: RepositoryRepositoryTopicsParametrizedInput, subProjection: RepositoryTopicConnectionResponseProjection): RepositoryResponseProjection = repositoryTopics(null, input, subProjection)

    fun repositoryTopics(alias: String?, input: RepositoryRepositoryTopicsParametrizedInput, subProjection: RepositoryTopicConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("repositoryTopics").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun resourcePath(): RepositoryResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun shortDescriptionHTML(): RepositoryResponseProjection = shortDescriptionHTML(null)

    fun shortDescriptionHTML(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("shortDescriptionHTML").alias(alias))
        return this
    }

    fun shortDescriptionHTML(input: RepositoryShortDescriptionHTMLParametrizedInput): RepositoryResponseProjection = shortDescriptionHTML(null, input)

    fun shortDescriptionHTML(alias: String?, input: RepositoryShortDescriptionHTMLParametrizedInput): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("shortDescriptionHTML").alias(alias).parameters(input))
        return this
    }

    fun squashMergeAllowed(): RepositoryResponseProjection = squashMergeAllowed(null)

    fun squashMergeAllowed(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("squashMergeAllowed").alias(alias))
        return this
    }

    fun sshUrl(): RepositoryResponseProjection = sshUrl(null)

    fun sshUrl(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("sshUrl").alias(alias))
        return this
    }

    fun stargazers(subProjection: StargazerConnectionResponseProjection): RepositoryResponseProjection = stargazers(null, subProjection)

    fun stargazers(alias: String?, subProjection: StargazerConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("stargazers").alias(alias).projection(subProjection))
        return this
    }

    fun stargazers(input: RepositoryStargazersParametrizedInput, subProjection: StargazerConnectionResponseProjection): RepositoryResponseProjection = stargazers(null, input, subProjection)

    fun stargazers(alias: String?, input: RepositoryStargazersParametrizedInput, subProjection: StargazerConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun templateRepository(subProjection: RepositoryResponseProjection): RepositoryResponseProjection = templateRepository(null, subProjection)

    fun templateRepository(alias: String?, subProjection: RepositoryResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("templateRepository").alias(alias).projection(subProjection))
        return this
    }

    fun updatedAt(): RepositoryResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): RepositoryResponseProjection = url(null)

    fun url(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun usesCustomOpenGraphImage(): RepositoryResponseProjection = usesCustomOpenGraphImage(null)

    fun usesCustomOpenGraphImage(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("usesCustomOpenGraphImage").alias(alias))
        return this
    }

    fun viewerCanAdminister(): RepositoryResponseProjection = viewerCanAdminister(null)

    fun viewerCanAdminister(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("viewerCanAdminister").alias(alias))
        return this
    }

    fun viewerCanCreateProjects(): RepositoryResponseProjection = viewerCanCreateProjects(null)

    fun viewerCanCreateProjects(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("viewerCanCreateProjects").alias(alias))
        return this
    }

    fun viewerCanSubscribe(): RepositoryResponseProjection = viewerCanSubscribe(null)

    fun viewerCanSubscribe(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("viewerCanSubscribe").alias(alias))
        return this
    }

    fun viewerCanUpdateTopics(): RepositoryResponseProjection = viewerCanUpdateTopics(null)

    fun viewerCanUpdateTopics(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdateTopics").alias(alias))
        return this
    }

    fun viewerHasStarred(): RepositoryResponseProjection = viewerHasStarred(null)

    fun viewerHasStarred(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("viewerHasStarred").alias(alias))
        return this
    }

    fun viewerPermission(): RepositoryResponseProjection = viewerPermission(null)

    fun viewerPermission(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("viewerPermission").alias(alias))
        return this
    }

    fun viewerSubscription(): RepositoryResponseProjection = viewerSubscription(null)

    fun viewerSubscription(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("viewerSubscription").alias(alias))
        return this
    }

    fun watchers(subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = watchers(null, subProjection)

    fun watchers(alias: String?, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("watchers").alias(alias).projection(subProjection))
        return this
    }

    fun watchers(input: RepositoryWatchersParametrizedInput, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = watchers(null, input, subProjection)

    fun watchers(alias: String?, input: RepositoryWatchersParametrizedInput, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("watchers").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun typename(): RepositoryResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RepositoryResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
