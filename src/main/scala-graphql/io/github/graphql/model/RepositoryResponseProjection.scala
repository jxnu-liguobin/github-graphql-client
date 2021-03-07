package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Repository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RepositoryResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", 0) + 1)
            this.assignableUsers(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", 0) + 1)
            this.branchProtectionRules(new BranchProtectionRuleConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) + 1)
            this.codeOfConduct(new CodeOfConductResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", 0) + 1)
            this.collaborators(new RepositoryCollaboratorConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) + 1)
            this.commitComments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0)))
        }
        this.createdAt()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", 0) + 1)
            this.defaultBranchRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", 0) + 1)
            this.deployKeys(new DeployKeyConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) + 1)
            this.deployments(new DeploymentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", 0)))
        }
        this.description()
        this.descriptionHTML()
        this.diskUsage()
        this.forkCount()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", 0) + 1)
            this.forks(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", 0)))
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
            projectionDepthOnFields.put("RepositoryResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueResponseProjection.issue", 0) + 1)
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueResponseProjection.issue", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", 0) + 1)
            this.issueOrPullRequest(new IssueOrPullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1)
            this.issues(new IssueConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelResponseProjection.label", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LabelResponseProjection.label", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelResponseProjection.label", 0) + 1)
            this.label(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelResponseProjection.label", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1)
            this.labels(new LabelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", 0) + 1)
            this.languages(new LanguageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", 0) + 1)
            this.licenseInfo(new LicenseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", 0)))
        }
        this.lockReason()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", 0) + 1)
            this.mentionableUsers(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", 0)))
        }
        this.mergeCommitAllowed()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneResponseProjection.milestone", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.MilestoneResponseProjection.milestone", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneResponseProjection.milestone", 0) + 1)
            this.milestone(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneResponseProjection.milestone", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", 0) + 1)
            this.milestones(new MilestoneConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", 0)))
        }
        this.mirrorUrl()
        this.name()
        this.nameWithOwner()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.GitObjectResponseProjection.`object`", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.GitObjectResponseProjection.`object`", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.GitObjectResponseProjection.`object`", 0) + 1)
            this.`object`(new GitObjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.GitObjectResponseProjection.`object`", 0)))
        }
        this.openGraphImageUrl()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", 0) + 1)
            this.owner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.parent", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryResponseProjection.parent", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.parent", 0) + 1)
            this.parent(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.parent", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", 0) + 1)
            this.primaryLanguage(new LanguageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1)
            this.projects(new ProjectConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", 0)))
        }
        this.projectsResourcePath()
        this.projectsUrl()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1)
            this.pullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)))
        }
        this.pushedAt()
        this.rebaseMergeAllowed()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.ref", 0) + 1)
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.ref", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefConnectionResponseProjection.refs", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RefConnectionResponseProjection.refs", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefConnectionResponseProjection.refs", 0) + 1)
            this.refs(new RefConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefConnectionResponseProjection.refs", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1)
            this.registryPackages(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseResponseProjection.release", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.ReleaseResponseProjection.release", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseResponseProjection.release", 0) + 1)
            this.release(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseResponseProjection.release", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", 0) + 1)
            this.releases(new ReleaseConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", 0) + 1)
            this.repositoryTopics(new RepositoryTopicConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", 0)))
        }
        this.resourcePath()
        this.shortDescriptionHTML()
        this.squashMergeAllowed()
        this.sshUrl()
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1)
            this.stargazers(new StargazerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", 0) + 1)
            this.templateRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", 0)))
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
            projectionDepthOnFields.put("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", 0) + 1)
            this.watchers(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", 0)))
        }
        this.typename()
        this
    }

    def assignableUsers(subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        assignableUsers(null.asInstanceOf[String], subProjection)
    }

    def assignableUsers(alias: String, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("assignableUsers").alias(alias).projection(subProjection))
        this
    }

    def assignableUsers(input: RepositoryAssignableUsersParametrizedInput,subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        assignableUsers(null.asInstanceOf[String], input, subProjection)
    }

    def assignableUsers(alias: String, input: RepositoryAssignableUsersParametrizedInput , subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("assignableUsers").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def branchProtectionRules(subProjection: BranchProtectionRuleConnectionResponseProjection): RepositoryResponseProjection = {
        branchProtectionRules(null.asInstanceOf[String], subProjection)
    }

    def branchProtectionRules(alias: String, subProjection: BranchProtectionRuleConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("branchProtectionRules").alias(alias).projection(subProjection))
        this
    }

    def branchProtectionRules(input: RepositoryBranchProtectionRulesParametrizedInput,subProjection: BranchProtectionRuleConnectionResponseProjection): RepositoryResponseProjection = {
        branchProtectionRules(null.asInstanceOf[String], input, subProjection)
    }

    def branchProtectionRules(alias: String, input: RepositoryBranchProtectionRulesParametrizedInput , subProjection: BranchProtectionRuleConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("branchProtectionRules").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def codeOfConduct(subProjection: CodeOfConductResponseProjection): RepositoryResponseProjection = {
        codeOfConduct(null.asInstanceOf[String], subProjection)
    }

    def codeOfConduct(alias: String, subProjection: CodeOfConductResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("codeOfConduct").alias(alias).projection(subProjection))
        this
    }

    def collaborators(subProjection: RepositoryCollaboratorConnectionResponseProjection): RepositoryResponseProjection = {
        collaborators(null.asInstanceOf[String], subProjection)
    }

    def collaborators(alias: String, subProjection: RepositoryCollaboratorConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("collaborators").alias(alias).projection(subProjection))
        this
    }

    def collaborators(input: RepositoryCollaboratorsParametrizedInput,subProjection: RepositoryCollaboratorConnectionResponseProjection): RepositoryResponseProjection = {
        collaborators(null.asInstanceOf[String], input, subProjection)
    }

    def collaborators(alias: String, input: RepositoryCollaboratorsParametrizedInput , subProjection: RepositoryCollaboratorConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("collaborators").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def commitComments(subProjection: CommitCommentConnectionResponseProjection): RepositoryResponseProjection = {
        commitComments(null.asInstanceOf[String], subProjection)
    }

    def commitComments(alias: String, subProjection: CommitCommentConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("commitComments").alias(alias).projection(subProjection))
        this
    }

    def commitComments(input: RepositoryCommitCommentsParametrizedInput,subProjection: CommitCommentConnectionResponseProjection): RepositoryResponseProjection = {
        commitComments(null.asInstanceOf[String], input, subProjection)
    }

    def commitComments(alias: String, input: RepositoryCommitCommentsParametrizedInput , subProjection: CommitCommentConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("commitComments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createdAt(): RepositoryResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): RepositoryResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def defaultBranchRef(subProjection: RefResponseProjection): RepositoryResponseProjection = {
        defaultBranchRef(null.asInstanceOf[String], subProjection)
    }

    def defaultBranchRef(alias: String, subProjection: RefResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("defaultBranchRef").alias(alias).projection(subProjection))
        this
    }

    def deployKeys(subProjection: DeployKeyConnectionResponseProjection): RepositoryResponseProjection = {
        deployKeys(null.asInstanceOf[String], subProjection)
    }

    def deployKeys(alias: String, subProjection: DeployKeyConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("deployKeys").alias(alias).projection(subProjection))
        this
    }

    def deployKeys(input: RepositoryDeployKeysParametrizedInput,subProjection: DeployKeyConnectionResponseProjection): RepositoryResponseProjection = {
        deployKeys(null.asInstanceOf[String], input, subProjection)
    }

    def deployKeys(alias: String, input: RepositoryDeployKeysParametrizedInput , subProjection: DeployKeyConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("deployKeys").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def deployments(subProjection: DeploymentConnectionResponseProjection): RepositoryResponseProjection = {
        deployments(null.asInstanceOf[String], subProjection)
    }

    def deployments(alias: String, subProjection: DeploymentConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("deployments").alias(alias).projection(subProjection))
        this
    }

    def deployments(input: RepositoryDeploymentsParametrizedInput,subProjection: DeploymentConnectionResponseProjection): RepositoryResponseProjection = {
        deployments(null.asInstanceOf[String], input, subProjection)
    }

    def deployments(alias: String, input: RepositoryDeploymentsParametrizedInput , subProjection: DeploymentConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("deployments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def description(): RepositoryResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def descriptionHTML(): RepositoryResponseProjection = {
        descriptionHTML(null.asInstanceOf[String])
    }

    def descriptionHTML(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("descriptionHTML").alias(alias))
        this
    }

    def diskUsage(): RepositoryResponseProjection = {
        diskUsage(null.asInstanceOf[String])
    }

    def diskUsage(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("diskUsage").alias(alias))
        this
    }

    def forkCount(): RepositoryResponseProjection = {
        forkCount(null.asInstanceOf[String])
    }

    def forkCount(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("forkCount").alias(alias))
        this
    }

    def forks(subProjection: RepositoryConnectionResponseProjection): RepositoryResponseProjection = {
        forks(null.asInstanceOf[String], subProjection)
    }

    def forks(alias: String, subProjection: RepositoryConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("forks").alias(alias).projection(subProjection))
        this
    }

    def forks(input: RepositoryForksParametrizedInput,subProjection: RepositoryConnectionResponseProjection): RepositoryResponseProjection = {
        forks(null.asInstanceOf[String], input, subProjection)
    }

    def forks(alias: String, input: RepositoryForksParametrizedInput , subProjection: RepositoryConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("forks").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def hasIssuesEnabled(): RepositoryResponseProjection = {
        hasIssuesEnabled(null.asInstanceOf[String])
    }

    def hasIssuesEnabled(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("hasIssuesEnabled").alias(alias))
        this
    }

    def hasWikiEnabled(): RepositoryResponseProjection = {
        hasWikiEnabled(null.asInstanceOf[String])
    }

    def hasWikiEnabled(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("hasWikiEnabled").alias(alias))
        this
    }

    def homepageUrl(): RepositoryResponseProjection = {
        homepageUrl(null.asInstanceOf[String])
    }

    def homepageUrl(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("homepageUrl").alias(alias))
        this
    }

    def id(): RepositoryResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isArchived(): RepositoryResponseProjection = {
        isArchived(null.asInstanceOf[String])
    }

    def isArchived(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("isArchived").alias(alias))
        this
    }

    def isDisabled(): RepositoryResponseProjection = {
        isDisabled(null.asInstanceOf[String])
    }

    def isDisabled(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("isDisabled").alias(alias))
        this
    }

    def isFork(): RepositoryResponseProjection = {
        isFork(null.asInstanceOf[String])
    }

    def isFork(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("isFork").alias(alias))
        this
    }

    def isLocked(): RepositoryResponseProjection = {
        isLocked(null.asInstanceOf[String])
    }

    def isLocked(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("isLocked").alias(alias))
        this
    }

    def isMirror(): RepositoryResponseProjection = {
        isMirror(null.asInstanceOf[String])
    }

    def isMirror(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("isMirror").alias(alias))
        this
    }

    def isPrivate(): RepositoryResponseProjection = {
        isPrivate(null.asInstanceOf[String])
    }

    def isPrivate(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("isPrivate").alias(alias))
        this
    }

    def isTemplate(): RepositoryResponseProjection = {
        isTemplate(null.asInstanceOf[String])
    }

    def isTemplate(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("isTemplate").alias(alias))
        this
    }

    def issue(subProjection: IssueResponseProjection): RepositoryResponseProjection = {
        issue(null.asInstanceOf[String], subProjection)
    }

    def issue(alias: String, subProjection: IssueResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection))
        this
    }

    def issue(input: RepositoryIssueParametrizedInput,subProjection: IssueResponseProjection): RepositoryResponseProjection = {
        issue(null.asInstanceOf[String], input, subProjection)
    }

    def issue(alias: String, input: RepositoryIssueParametrizedInput , subProjection: IssueResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("issue").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def issueOrPullRequest(subProjection: IssueOrPullRequestResponseProjection): RepositoryResponseProjection = {
        issueOrPullRequest(null.asInstanceOf[String], subProjection)
    }

    def issueOrPullRequest(alias: String, subProjection: IssueOrPullRequestResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("issueOrPullRequest").alias(alias).projection(subProjection))
        this
    }

    def issueOrPullRequest(input: RepositoryIssueOrPullRequestParametrizedInput,subProjection: IssueOrPullRequestResponseProjection): RepositoryResponseProjection = {
        issueOrPullRequest(null.asInstanceOf[String], input, subProjection)
    }

    def issueOrPullRequest(alias: String, input: RepositoryIssueOrPullRequestParametrizedInput , subProjection: IssueOrPullRequestResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("issueOrPullRequest").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def issues(subProjection: IssueConnectionResponseProjection): RepositoryResponseProjection = {
        issues(null.asInstanceOf[String], subProjection)
    }

    def issues(alias: String, subProjection: IssueConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("issues").alias(alias).projection(subProjection))
        this
    }

    def issues(input: RepositoryIssuesParametrizedInput,subProjection: IssueConnectionResponseProjection): RepositoryResponseProjection = {
        issues(null.asInstanceOf[String], input, subProjection)
    }

    def issues(alias: String, input: RepositoryIssuesParametrizedInput , subProjection: IssueConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def label(subProjection: LabelResponseProjection): RepositoryResponseProjection = {
        label(null.asInstanceOf[String], subProjection)
    }

    def label(alias: String, subProjection: LabelResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("label").alias(alias).projection(subProjection))
        this
    }

    def label(input: RepositoryLabelParametrizedInput,subProjection: LabelResponseProjection): RepositoryResponseProjection = {
        label(null.asInstanceOf[String], input, subProjection)
    }

    def label(alias: String, input: RepositoryLabelParametrizedInput , subProjection: LabelResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("label").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def labels(subProjection: LabelConnectionResponseProjection): RepositoryResponseProjection = {
        labels(null.asInstanceOf[String], subProjection)
    }

    def labels(alias: String, subProjection: LabelConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("labels").alias(alias).projection(subProjection))
        this
    }

    def labels(input: RepositoryLabelsParametrizedInput,subProjection: LabelConnectionResponseProjection): RepositoryResponseProjection = {
        labels(null.asInstanceOf[String], input, subProjection)
    }

    def labels(alias: String, input: RepositoryLabelsParametrizedInput , subProjection: LabelConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def languages(subProjection: LanguageConnectionResponseProjection): RepositoryResponseProjection = {
        languages(null.asInstanceOf[String], subProjection)
    }

    def languages(alias: String, subProjection: LanguageConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("languages").alias(alias).projection(subProjection))
        this
    }

    def languages(input: RepositoryLanguagesParametrizedInput,subProjection: LanguageConnectionResponseProjection): RepositoryResponseProjection = {
        languages(null.asInstanceOf[String], input, subProjection)
    }

    def languages(alias: String, input: RepositoryLanguagesParametrizedInput , subProjection: LanguageConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("languages").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def licenseInfo(subProjection: LicenseResponseProjection): RepositoryResponseProjection = {
        licenseInfo(null.asInstanceOf[String], subProjection)
    }

    def licenseInfo(alias: String, subProjection: LicenseResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("licenseInfo").alias(alias).projection(subProjection))
        this
    }

    def lockReason(): RepositoryResponseProjection = {
        lockReason(null.asInstanceOf[String])
    }

    def lockReason(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("lockReason").alias(alias))
        this
    }

    def mentionableUsers(subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        mentionableUsers(null.asInstanceOf[String], subProjection)
    }

    def mentionableUsers(alias: String, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("mentionableUsers").alias(alias).projection(subProjection))
        this
    }

    def mentionableUsers(input: RepositoryMentionableUsersParametrizedInput,subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        mentionableUsers(null.asInstanceOf[String], input, subProjection)
    }

    def mentionableUsers(alias: String, input: RepositoryMentionableUsersParametrizedInput , subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("mentionableUsers").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def mergeCommitAllowed(): RepositoryResponseProjection = {
        mergeCommitAllowed(null.asInstanceOf[String])
    }

    def mergeCommitAllowed(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("mergeCommitAllowed").alias(alias))
        this
    }

    def milestone(subProjection: MilestoneResponseProjection): RepositoryResponseProjection = {
        milestone(null.asInstanceOf[String], subProjection)
    }

    def milestone(alias: String, subProjection: MilestoneResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("milestone").alias(alias).projection(subProjection))
        this
    }

    def milestone(input: RepositoryMilestoneParametrizedInput,subProjection: MilestoneResponseProjection): RepositoryResponseProjection = {
        milestone(null.asInstanceOf[String], input, subProjection)
    }

    def milestone(alias: String, input: RepositoryMilestoneParametrizedInput , subProjection: MilestoneResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("milestone").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def milestones(subProjection: MilestoneConnectionResponseProjection): RepositoryResponseProjection = {
        milestones(null.asInstanceOf[String], subProjection)
    }

    def milestones(alias: String, subProjection: MilestoneConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("milestones").alias(alias).projection(subProjection))
        this
    }

    def milestones(input: RepositoryMilestonesParametrizedInput,subProjection: MilestoneConnectionResponseProjection): RepositoryResponseProjection = {
        milestones(null.asInstanceOf[String], input, subProjection)
    }

    def milestones(alias: String, input: RepositoryMilestonesParametrizedInput , subProjection: MilestoneConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("milestones").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def mirrorUrl(): RepositoryResponseProjection = {
        mirrorUrl(null.asInstanceOf[String])
    }

    def mirrorUrl(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("mirrorUrl").alias(alias))
        this
    }

    def name(): RepositoryResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def nameWithOwner(): RepositoryResponseProjection = {
        nameWithOwner(null.asInstanceOf[String])
    }

    def nameWithOwner(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("nameWithOwner").alias(alias))
        this
    }

    def `object`(subProjection: GitObjectResponseProjection): RepositoryResponseProjection = {
        `object`(null.asInstanceOf[String], subProjection)
    }

    def `object`(alias: String, subProjection: GitObjectResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("object").alias(alias).projection(subProjection))
        this
    }

    def `object`(input: RepositoryObjectParametrizedInput,subProjection: GitObjectResponseProjection): RepositoryResponseProjection = {
        `object`(null.asInstanceOf[String], input, subProjection)
    }

    def `object`(alias: String, input: RepositoryObjectParametrizedInput , subProjection: GitObjectResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("object").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def openGraphImageUrl(): RepositoryResponseProjection = {
        openGraphImageUrl(null.asInstanceOf[String])
    }

    def openGraphImageUrl(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("openGraphImageUrl").alias(alias))
        this
    }

    def owner(subProjection: RepositoryOwnerResponseProjection): RepositoryResponseProjection = {
        owner(null.asInstanceOf[String], subProjection)
    }

    def owner(alias: String, subProjection: RepositoryOwnerResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection))
        this
    }

    def parent(subProjection: RepositoryResponseProjection): RepositoryResponseProjection = {
        parent(null.asInstanceOf[String], subProjection)
    }

    def parent(alias: String, subProjection: RepositoryResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("parent").alias(alias).projection(subProjection))
        this
    }

    def primaryLanguage(subProjection: LanguageResponseProjection): RepositoryResponseProjection = {
        primaryLanguage(null.asInstanceOf[String], subProjection)
    }

    def primaryLanguage(alias: String, subProjection: LanguageResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("primaryLanguage").alias(alias).projection(subProjection))
        this
    }

    def project(subProjection: ProjectResponseProjection): RepositoryResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def project(input: RepositoryProjectParametrizedInput,subProjection: ProjectResponseProjection): RepositoryResponseProjection = {
        project(null.asInstanceOf[String], input, subProjection)
    }

    def project(alias: String, input: RepositoryProjectParametrizedInput , subProjection: ProjectResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def projects(subProjection: ProjectConnectionResponseProjection): RepositoryResponseProjection = {
        projects(null.asInstanceOf[String], subProjection)
    }

    def projects(alias: String, subProjection: ProjectConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection))
        this
    }

    def projects(input: RepositoryProjectsParametrizedInput,subProjection: ProjectConnectionResponseProjection): RepositoryResponseProjection = {
        projects(null.asInstanceOf[String], input, subProjection)
    }

    def projects(alias: String, input: RepositoryProjectsParametrizedInput , subProjection: ProjectConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def projectsResourcePath(): RepositoryResponseProjection = {
        projectsResourcePath(null.asInstanceOf[String])
    }

    def projectsResourcePath(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("projectsResourcePath").alias(alias))
        this
    }

    def projectsUrl(): RepositoryResponseProjection = {
        projectsUrl(null.asInstanceOf[String])
    }

    def projectsUrl(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("projectsUrl").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): RepositoryResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def pullRequest(input: RepositoryPullRequestParametrizedInput,subProjection: PullRequestResponseProjection): RepositoryResponseProjection = {
        pullRequest(null.asInstanceOf[String], input, subProjection)
    }

    def pullRequest(alias: String, input: RepositoryPullRequestParametrizedInput , subProjection: PullRequestResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pullRequests(subProjection: PullRequestConnectionResponseProjection): RepositoryResponseProjection = {
        pullRequests(null.asInstanceOf[String], subProjection)
    }

    def pullRequests(alias: String, subProjection: PullRequestConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).projection(subProjection))
        this
    }

    def pullRequests(input: RepositoryPullRequestsParametrizedInput,subProjection: PullRequestConnectionResponseProjection): RepositoryResponseProjection = {
        pullRequests(null.asInstanceOf[String], input, subProjection)
    }

    def pullRequests(alias: String, input: RepositoryPullRequestsParametrizedInput , subProjection: PullRequestConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pushedAt(): RepositoryResponseProjection = {
        pushedAt(null.asInstanceOf[String])
    }

    def pushedAt(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("pushedAt").alias(alias))
        this
    }

    def rebaseMergeAllowed(): RepositoryResponseProjection = {
        rebaseMergeAllowed(null.asInstanceOf[String])
    }

    def rebaseMergeAllowed(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("rebaseMergeAllowed").alias(alias))
        this
    }

    def ref(subProjection: RefResponseProjection): RepositoryResponseProjection = {
        ref(null.asInstanceOf[String], subProjection)
    }

    def ref(alias: String, subProjection: RefResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection))
        this
    }

    def ref(input: RepositoryRefParametrizedInput,subProjection: RefResponseProjection): RepositoryResponseProjection = {
        ref(null.asInstanceOf[String], input, subProjection)
    }

    def ref(alias: String, input: RepositoryRefParametrizedInput , subProjection: RefResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("ref").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def refs(subProjection: RefConnectionResponseProjection): RepositoryResponseProjection = {
        refs(null.asInstanceOf[String], subProjection)
    }

    def refs(alias: String, subProjection: RefConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("refs").alias(alias).projection(subProjection))
        this
    }

    def refs(input: RepositoryRefsParametrizedInput,subProjection: RefConnectionResponseProjection): RepositoryResponseProjection = {
        refs(null.asInstanceOf[String], input, subProjection)
    }

    def refs(alias: String, input: RepositoryRefsParametrizedInput , subProjection: RefConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("refs").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def registryPackages(subProjection: RegistryPackageConnectionResponseProjection): RepositoryResponseProjection = {
        registryPackages(null.asInstanceOf[String], subProjection)
    }

    def registryPackages(alias: String, subProjection: RegistryPackageConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).projection(subProjection))
        this
    }

    def registryPackages(input: RepositoryRegistryPackagesParametrizedInput,subProjection: RegistryPackageConnectionResponseProjection): RepositoryResponseProjection = {
        registryPackages(null.asInstanceOf[String], input, subProjection)
    }

    def registryPackages(alias: String, input: RepositoryRegistryPackagesParametrizedInput , subProjection: RegistryPackageConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def release(subProjection: ReleaseResponseProjection): RepositoryResponseProjection = {
        release(null.asInstanceOf[String], subProjection)
    }

    def release(alias: String, subProjection: ReleaseResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("release").alias(alias).projection(subProjection))
        this
    }

    def release(input: RepositoryReleaseParametrizedInput,subProjection: ReleaseResponseProjection): RepositoryResponseProjection = {
        release(null.asInstanceOf[String], input, subProjection)
    }

    def release(alias: String, input: RepositoryReleaseParametrizedInput , subProjection: ReleaseResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("release").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def releases(subProjection: ReleaseConnectionResponseProjection): RepositoryResponseProjection = {
        releases(null.asInstanceOf[String], subProjection)
    }

    def releases(alias: String, subProjection: ReleaseConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("releases").alias(alias).projection(subProjection))
        this
    }

    def releases(input: RepositoryReleasesParametrizedInput,subProjection: ReleaseConnectionResponseProjection): RepositoryResponseProjection = {
        releases(null.asInstanceOf[String], input, subProjection)
    }

    def releases(alias: String, input: RepositoryReleasesParametrizedInput , subProjection: ReleaseConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("releases").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repositoryTopics(subProjection: RepositoryTopicConnectionResponseProjection): RepositoryResponseProjection = {
        repositoryTopics(null.asInstanceOf[String], subProjection)
    }

    def repositoryTopics(alias: String, subProjection: RepositoryTopicConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("repositoryTopics").alias(alias).projection(subProjection))
        this
    }

    def repositoryTopics(input: RepositoryRepositoryTopicsParametrizedInput,subProjection: RepositoryTopicConnectionResponseProjection): RepositoryResponseProjection = {
        repositoryTopics(null.asInstanceOf[String], input, subProjection)
    }

    def repositoryTopics(alias: String, input: RepositoryRepositoryTopicsParametrizedInput , subProjection: RepositoryTopicConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("repositoryTopics").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def resourcePath(): RepositoryResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def shortDescriptionHTML(): RepositoryResponseProjection = {
        shortDescriptionHTML(null.asInstanceOf[String])
    }

    def shortDescriptionHTML(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("shortDescriptionHTML").alias(alias))
        this
    }

    def shortDescriptionHTML(input: RepositoryShortDescriptionHTMLParametrizedInput): RepositoryResponseProjection = {
        shortDescriptionHTML(null.asInstanceOf[String], input)
    }

    def shortDescriptionHTML(alias: String, input: RepositoryShortDescriptionHTMLParametrizedInput ): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("shortDescriptionHTML").alias(alias).parameters(input))
        this
    }

    def squashMergeAllowed(): RepositoryResponseProjection = {
        squashMergeAllowed(null.asInstanceOf[String])
    }

    def squashMergeAllowed(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("squashMergeAllowed").alias(alias))
        this
    }

    def sshUrl(): RepositoryResponseProjection = {
        sshUrl(null.asInstanceOf[String])
    }

    def sshUrl(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("sshUrl").alias(alias))
        this
    }

    def stargazers(subProjection: StargazerConnectionResponseProjection): RepositoryResponseProjection = {
        stargazers(null.asInstanceOf[String], subProjection)
    }

    def stargazers(alias: String, subProjection: StargazerConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).projection(subProjection))
        this
    }

    def stargazers(input: RepositoryStargazersParametrizedInput,subProjection: StargazerConnectionResponseProjection): RepositoryResponseProjection = {
        stargazers(null.asInstanceOf[String], input, subProjection)
    }

    def stargazers(alias: String, input: RepositoryStargazersParametrizedInput , subProjection: StargazerConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def templateRepository(subProjection: RepositoryResponseProjection): RepositoryResponseProjection = {
        templateRepository(null.asInstanceOf[String], subProjection)
    }

    def templateRepository(alias: String, subProjection: RepositoryResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("templateRepository").alias(alias).projection(subProjection))
        this
    }

    def updatedAt(): RepositoryResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): RepositoryResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def usesCustomOpenGraphImage(): RepositoryResponseProjection = {
        usesCustomOpenGraphImage(null.asInstanceOf[String])
    }

    def usesCustomOpenGraphImage(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("usesCustomOpenGraphImage").alias(alias))
        this
    }

    def viewerCanAdminister(): RepositoryResponseProjection = {
        viewerCanAdminister(null.asInstanceOf[String])
    }

    def viewerCanAdminister(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanAdminister").alias(alias))
        this
    }

    def viewerCanCreateProjects(): RepositoryResponseProjection = {
        viewerCanCreateProjects(null.asInstanceOf[String])
    }

    def viewerCanCreateProjects(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanCreateProjects").alias(alias))
        this
    }

    def viewerCanSubscribe(): RepositoryResponseProjection = {
        viewerCanSubscribe(null.asInstanceOf[String])
    }

    def viewerCanSubscribe(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias))
        this
    }

    def viewerCanUpdateTopics(): RepositoryResponseProjection = {
        viewerCanUpdateTopics(null.asInstanceOf[String])
    }

    def viewerCanUpdateTopics(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUpdateTopics").alias(alias))
        this
    }

    def viewerHasStarred(): RepositoryResponseProjection = {
        viewerHasStarred(null.asInstanceOf[String])
    }

    def viewerHasStarred(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("viewerHasStarred").alias(alias))
        this
    }

    def viewerPermission(): RepositoryResponseProjection = {
        viewerPermission(null.asInstanceOf[String])
    }

    def viewerPermission(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("viewerPermission").alias(alias))
        this
    }

    def viewerSubscription(): RepositoryResponseProjection = {
        viewerSubscription(null.asInstanceOf[String])
    }

    def viewerSubscription(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias))
        this
    }

    def watchers(subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        watchers(null.asInstanceOf[String], subProjection)
    }

    def watchers(alias: String, subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("watchers").alias(alias).projection(subProjection))
        this
    }

    def watchers(input: RepositoryWatchersParametrizedInput,subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        watchers(null.asInstanceOf[String], input, subProjection)
    }

    def watchers(alias: String, input: RepositoryWatchersParametrizedInput , subProjection: UserConnectionResponseProjection): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("watchers").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def typename(): RepositoryResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
