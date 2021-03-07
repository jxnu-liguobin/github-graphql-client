package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryResponseProjection extends GraphQLResponseProjection {

    public RepositoryResponseProjection() {
    }

    @Override
    public RepositoryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", 0) + 1);
            this.assignableUsers(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.assignableUsers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", 0) + 1);
            this.branchProtectionRules(new BranchProtectionRuleConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.BranchProtectionRuleConnectionResponseProjection.branchProtectionRules", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) + 1);
            this.codeOfConduct(new CodeOfConductResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", 0) + 1);
            this.collaborators(new RepositoryCollaboratorConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryCollaboratorConnectionResponseProjection.collaborators", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0) + 1);
            this.commitComments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.CommitCommentConnectionResponseProjection.commitComments", 0)));
        }
        this.createdAt();
        this.databaseId();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", 0) + 1);
            this.defaultBranchRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.defaultBranchRef", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", 0) + 1);
            this.deployKeys(new DeployKeyConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeployKeyConnectionResponseProjection.deployKeys", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) + 1);
            this.deployments(new DeploymentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.DeploymentConnectionResponseProjection.deployments", 0)));
        }
        this.description();
        this.descriptionHTML();
        this.diskUsage();
        this.forkCount();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", 0) + 1);
            this.forks(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryConnectionResponseProjection.forks", 0)));
        }
        this.hasIssuesEnabled();
        this.hasWikiEnabled();
        this.homepageUrl();
        this.id();
        this.isArchived();
        this.isDisabled();
        this.isFork();
        this.isLocked();
        this.isMirror();
        this.isPrivate();
        this.isTemplate();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueResponseProjection.issue", 0) + 1);
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueResponseProjection.issue", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", 0) + 1);
            this.issueOrPullRequest(new IssueOrPullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueOrPullRequestResponseProjection.issueOrPullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1);
            this.issues(new IssueConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.IssueConnectionResponseProjection.issues", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelResponseProjection.label", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LabelResponseProjection.label", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelResponseProjection.label", 0) + 1);
            this.label(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelResponseProjection.label", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1);
            this.labels(new LabelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LabelConnectionResponseProjection.labels", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", 0) + 1);
            this.languages(new LanguageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageConnectionResponseProjection.languages", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", 0) + 1);
            this.licenseInfo(new LicenseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LicenseResponseProjection.licenseInfo", 0)));
        }
        this.lockReason();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", 0) + 1);
            this.mentionableUsers(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.mentionableUsers", 0)));
        }
        this.mergeCommitAllowed();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneResponseProjection.milestone", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.MilestoneResponseProjection.milestone", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneResponseProjection.milestone", 0) + 1);
            this.milestone(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneResponseProjection.milestone", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", 0) + 1);
            this.milestones(new MilestoneConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.MilestoneConnectionResponseProjection.milestones", 0)));
        }
        this.mirrorUrl();
        this.name();
        this.nameWithOwner();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.GitObjectResponseProjection.object", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.GitObjectResponseProjection.object", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.GitObjectResponseProjection.object", 0) + 1);
            this.object(new GitObjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.GitObjectResponseProjection.object", 0)));
        }
        this.openGraphImageUrl();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", 0) + 1);
            this.owner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryOwnerResponseProjection.owner", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.parent", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryResponseProjection.parent", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.parent", 0) + 1);
            this.parent(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.parent", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", 0) + 1);
            this.primaryLanguage(new LanguageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.LanguageResponseProjection.primaryLanguage", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectResponseProjection.project", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1);
            this.projects(new ProjectConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ProjectConnectionResponseProjection.projects", 0)));
        }
        this.projectsResourcePath();
        this.projectsUrl();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1);
            this.pullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)));
        }
        this.pushedAt();
        this.rebaseMergeAllowed();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.ref", 0) + 1);
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefResponseProjection.ref", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefConnectionResponseProjection.refs", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RefConnectionResponseProjection.refs", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefConnectionResponseProjection.refs", 0) + 1);
            this.refs(new RefConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RefConnectionResponseProjection.refs", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0) + 1);
            this.registryPackages(new RegistryPackageConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RegistryPackageConnectionResponseProjection.registryPackages", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseResponseProjection.release", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.ReleaseResponseProjection.release", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseResponseProjection.release", 0) + 1);
            this.release(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseResponseProjection.release", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", 0) + 1);
            this.releases(new ReleaseConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.ReleaseConnectionResponseProjection.releases", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", 0) + 1);
            this.repositoryTopics(new RepositoryTopicConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryTopicConnectionResponseProjection.repositoryTopics", 0)));
        }
        this.resourcePath();
        this.shortDescriptionHTML();
        this.squashMergeAllowed();
        this.sshUrl();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1);
            this.stargazers(new StargazerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", 0) + 1);
            this.templateRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.RepositoryResponseProjection.templateRepository", 0)));
        }
        this.updatedAt();
        this.url();
        this.usesCustomOpenGraphImage();
        this.viewerCanAdminister();
        this.viewerCanCreateProjects();
        this.viewerCanSubscribe();
        this.viewerCanUpdateTopics();
        this.viewerHasStarred();
        this.viewerPermission();
        this.viewerSubscription();
        if (projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", 0) + 1);
            this.watchers(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryResponseProjection.UserConnectionResponseProjection.watchers", 0)));
        }
        this.typename();
        return this;
    }

    public RepositoryResponseProjection assignableUsers(UserConnectionResponseProjection subProjection) {
        return assignableUsers((String)null, subProjection);
    }

    public RepositoryResponseProjection assignableUsers(String alias, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignableUsers").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection assignableUsers(RepositoryAssignableUsersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return assignableUsers(null, input, subProjection);
    }

    public RepositoryResponseProjection assignableUsers(String alias, RepositoryAssignableUsersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignableUsers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection branchProtectionRules(BranchProtectionRuleConnectionResponseProjection subProjection) {
        return branchProtectionRules((String)null, subProjection);
    }

    public RepositoryResponseProjection branchProtectionRules(String alias, BranchProtectionRuleConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("branchProtectionRules").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection branchProtectionRules(RepositoryBranchProtectionRulesParametrizedInput input, BranchProtectionRuleConnectionResponseProjection subProjection) {
        return branchProtectionRules(null, input, subProjection);
    }

    public RepositoryResponseProjection branchProtectionRules(String alias, RepositoryBranchProtectionRulesParametrizedInput input, BranchProtectionRuleConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("branchProtectionRules").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection codeOfConduct(CodeOfConductResponseProjection subProjection) {
        return codeOfConduct(null, subProjection);
    }

    public RepositoryResponseProjection codeOfConduct(String alias, CodeOfConductResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("codeOfConduct").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection collaborators(RepositoryCollaboratorConnectionResponseProjection subProjection) {
        return collaborators((String)null, subProjection);
    }

    public RepositoryResponseProjection collaborators(String alias, RepositoryCollaboratorConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("collaborators").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection collaborators(RepositoryCollaboratorsParametrizedInput input, RepositoryCollaboratorConnectionResponseProjection subProjection) {
        return collaborators(null, input, subProjection);
    }

    public RepositoryResponseProjection collaborators(String alias, RepositoryCollaboratorsParametrizedInput input, RepositoryCollaboratorConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("collaborators").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection commitComments(CommitCommentConnectionResponseProjection subProjection) {
        return commitComments((String)null, subProjection);
    }

    public RepositoryResponseProjection commitComments(String alias, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commitComments").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection commitComments(RepositoryCommitCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        return commitComments(null, input, subProjection);
    }

    public RepositoryResponseProjection commitComments(String alias, RepositoryCommitCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commitComments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection createdAt() {
        return createdAt(null);
    }

    public RepositoryResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public RepositoryResponseProjection databaseId() {
        return databaseId(null);
    }

    public RepositoryResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public RepositoryResponseProjection defaultBranchRef(RefResponseProjection subProjection) {
        return defaultBranchRef(null, subProjection);
    }

    public RepositoryResponseProjection defaultBranchRef(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("defaultBranchRef").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection deployKeys(DeployKeyConnectionResponseProjection subProjection) {
        return deployKeys((String)null, subProjection);
    }

    public RepositoryResponseProjection deployKeys(String alias, DeployKeyConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deployKeys").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection deployKeys(RepositoryDeployKeysParametrizedInput input, DeployKeyConnectionResponseProjection subProjection) {
        return deployKeys(null, input, subProjection);
    }

    public RepositoryResponseProjection deployKeys(String alias, RepositoryDeployKeysParametrizedInput input, DeployKeyConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deployKeys").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection deployments(DeploymentConnectionResponseProjection subProjection) {
        return deployments((String)null, subProjection);
    }

    public RepositoryResponseProjection deployments(String alias, DeploymentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deployments").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection deployments(RepositoryDeploymentsParametrizedInput input, DeploymentConnectionResponseProjection subProjection) {
        return deployments(null, input, subProjection);
    }

    public RepositoryResponseProjection deployments(String alias, RepositoryDeploymentsParametrizedInput input, DeploymentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deployments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection description() {
        return description(null);
    }

    public RepositoryResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public RepositoryResponseProjection descriptionHTML() {
        return descriptionHTML(null);
    }

    public RepositoryResponseProjection descriptionHTML(String alias) {
        fields.add(new GraphQLResponseField("descriptionHTML").alias(alias));
        return this;
    }

    public RepositoryResponseProjection diskUsage() {
        return diskUsage(null);
    }

    public RepositoryResponseProjection diskUsage(String alias) {
        fields.add(new GraphQLResponseField("diskUsage").alias(alias));
        return this;
    }

    public RepositoryResponseProjection forkCount() {
        return forkCount(null);
    }

    public RepositoryResponseProjection forkCount(String alias) {
        fields.add(new GraphQLResponseField("forkCount").alias(alias));
        return this;
    }

    public RepositoryResponseProjection forks(RepositoryConnectionResponseProjection subProjection) {
        return forks((String)null, subProjection);
    }

    public RepositoryResponseProjection forks(String alias, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("forks").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection forks(RepositoryForksParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        return forks(null, input, subProjection);
    }

    public RepositoryResponseProjection forks(String alias, RepositoryForksParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("forks").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection hasIssuesEnabled() {
        return hasIssuesEnabled(null);
    }

    public RepositoryResponseProjection hasIssuesEnabled(String alias) {
        fields.add(new GraphQLResponseField("hasIssuesEnabled").alias(alias));
        return this;
    }

    public RepositoryResponseProjection hasWikiEnabled() {
        return hasWikiEnabled(null);
    }

    public RepositoryResponseProjection hasWikiEnabled(String alias) {
        fields.add(new GraphQLResponseField("hasWikiEnabled").alias(alias));
        return this;
    }

    public RepositoryResponseProjection homepageUrl() {
        return homepageUrl(null);
    }

    public RepositoryResponseProjection homepageUrl(String alias) {
        fields.add(new GraphQLResponseField("homepageUrl").alias(alias));
        return this;
    }

    public RepositoryResponseProjection id() {
        return id(null);
    }

    public RepositoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RepositoryResponseProjection isArchived() {
        return isArchived(null);
    }

    public RepositoryResponseProjection isArchived(String alias) {
        fields.add(new GraphQLResponseField("isArchived").alias(alias));
        return this;
    }

    public RepositoryResponseProjection isDisabled() {
        return isDisabled(null);
    }

    public RepositoryResponseProjection isDisabled(String alias) {
        fields.add(new GraphQLResponseField("isDisabled").alias(alias));
        return this;
    }

    public RepositoryResponseProjection isFork() {
        return isFork(null);
    }

    public RepositoryResponseProjection isFork(String alias) {
        fields.add(new GraphQLResponseField("isFork").alias(alias));
        return this;
    }

    public RepositoryResponseProjection isLocked() {
        return isLocked(null);
    }

    public RepositoryResponseProjection isLocked(String alias) {
        fields.add(new GraphQLResponseField("isLocked").alias(alias));
        return this;
    }

    public RepositoryResponseProjection isMirror() {
        return isMirror(null);
    }

    public RepositoryResponseProjection isMirror(String alias) {
        fields.add(new GraphQLResponseField("isMirror").alias(alias));
        return this;
    }

    public RepositoryResponseProjection isPrivate() {
        return isPrivate(null);
    }

    public RepositoryResponseProjection isPrivate(String alias) {
        fields.add(new GraphQLResponseField("isPrivate").alias(alias));
        return this;
    }

    public RepositoryResponseProjection isTemplate() {
        return isTemplate(null);
    }

    public RepositoryResponseProjection isTemplate(String alias) {
        fields.add(new GraphQLResponseField("isTemplate").alias(alias));
        return this;
    }

    public RepositoryResponseProjection issue(IssueResponseProjection subProjection) {
        return issue((String)null, subProjection);
    }

    public RepositoryResponseProjection issue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection issue(RepositoryIssueParametrizedInput input, IssueResponseProjection subProjection) {
        return issue(null, input, subProjection);
    }

    public RepositoryResponseProjection issue(String alias, RepositoryIssueParametrizedInput input, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection issueOrPullRequest(IssueOrPullRequestResponseProjection subProjection) {
        return issueOrPullRequest((String)null, subProjection);
    }

    public RepositoryResponseProjection issueOrPullRequest(String alias, IssueOrPullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issueOrPullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection issueOrPullRequest(RepositoryIssueOrPullRequestParametrizedInput input, IssueOrPullRequestResponseProjection subProjection) {
        return issueOrPullRequest(null, input, subProjection);
    }

    public RepositoryResponseProjection issueOrPullRequest(String alias, RepositoryIssueOrPullRequestParametrizedInput input, IssueOrPullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issueOrPullRequest").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection issues(IssueConnectionResponseProjection subProjection) {
        return issues((String)null, subProjection);
    }

    public RepositoryResponseProjection issues(String alias, IssueConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issues").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection issues(RepositoryIssuesParametrizedInput input, IssueConnectionResponseProjection subProjection) {
        return issues(null, input, subProjection);
    }

    public RepositoryResponseProjection issues(String alias, RepositoryIssuesParametrizedInput input, IssueConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection label(LabelResponseProjection subProjection) {
        return label((String)null, subProjection);
    }

    public RepositoryResponseProjection label(String alias, LabelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("label").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection label(RepositoryLabelParametrizedInput input, LabelResponseProjection subProjection) {
        return label(null, input, subProjection);
    }

    public RepositoryResponseProjection label(String alias, RepositoryLabelParametrizedInput input, LabelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("label").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection labels(LabelConnectionResponseProjection subProjection) {
        return labels((String)null, subProjection);
    }

    public RepositoryResponseProjection labels(String alias, LabelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labels").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection labels(RepositoryLabelsParametrizedInput input, LabelConnectionResponseProjection subProjection) {
        return labels(null, input, subProjection);
    }

    public RepositoryResponseProjection labels(String alias, RepositoryLabelsParametrizedInput input, LabelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection languages(LanguageConnectionResponseProjection subProjection) {
        return languages((String)null, subProjection);
    }

    public RepositoryResponseProjection languages(String alias, LanguageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("languages").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection languages(RepositoryLanguagesParametrizedInput input, LanguageConnectionResponseProjection subProjection) {
        return languages(null, input, subProjection);
    }

    public RepositoryResponseProjection languages(String alias, RepositoryLanguagesParametrizedInput input, LanguageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("languages").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection licenseInfo(LicenseResponseProjection subProjection) {
        return licenseInfo(null, subProjection);
    }

    public RepositoryResponseProjection licenseInfo(String alias, LicenseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("licenseInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection lockReason() {
        return lockReason(null);
    }

    public RepositoryResponseProjection lockReason(String alias) {
        fields.add(new GraphQLResponseField("lockReason").alias(alias));
        return this;
    }

    public RepositoryResponseProjection mentionableUsers(UserConnectionResponseProjection subProjection) {
        return mentionableUsers((String)null, subProjection);
    }

    public RepositoryResponseProjection mentionableUsers(String alias, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mentionableUsers").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection mentionableUsers(RepositoryMentionableUsersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return mentionableUsers(null, input, subProjection);
    }

    public RepositoryResponseProjection mentionableUsers(String alias, RepositoryMentionableUsersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mentionableUsers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection mergeCommitAllowed() {
        return mergeCommitAllowed(null);
    }

    public RepositoryResponseProjection mergeCommitAllowed(String alias) {
        fields.add(new GraphQLResponseField("mergeCommitAllowed").alias(alias));
        return this;
    }

    public RepositoryResponseProjection milestone(MilestoneResponseProjection subProjection) {
        return milestone((String)null, subProjection);
    }

    public RepositoryResponseProjection milestone(String alias, MilestoneResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("milestone").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection milestone(RepositoryMilestoneParametrizedInput input, MilestoneResponseProjection subProjection) {
        return milestone(null, input, subProjection);
    }

    public RepositoryResponseProjection milestone(String alias, RepositoryMilestoneParametrizedInput input, MilestoneResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("milestone").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection milestones(MilestoneConnectionResponseProjection subProjection) {
        return milestones((String)null, subProjection);
    }

    public RepositoryResponseProjection milestones(String alias, MilestoneConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("milestones").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection milestones(RepositoryMilestonesParametrizedInput input, MilestoneConnectionResponseProjection subProjection) {
        return milestones(null, input, subProjection);
    }

    public RepositoryResponseProjection milestones(String alias, RepositoryMilestonesParametrizedInput input, MilestoneConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("milestones").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection mirrorUrl() {
        return mirrorUrl(null);
    }

    public RepositoryResponseProjection mirrorUrl(String alias) {
        fields.add(new GraphQLResponseField("mirrorUrl").alias(alias));
        return this;
    }

    public RepositoryResponseProjection name() {
        return name(null);
    }

    public RepositoryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RepositoryResponseProjection nameWithOwner() {
        return nameWithOwner(null);
    }

    public RepositoryResponseProjection nameWithOwner(String alias) {
        fields.add(new GraphQLResponseField("nameWithOwner").alias(alias));
        return this;
    }

    public RepositoryResponseProjection object(GitObjectResponseProjection subProjection) {
        return object((String)null, subProjection);
    }

    public RepositoryResponseProjection object(String alias, GitObjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("object").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection object(RepositoryObjectParametrizedInput input, GitObjectResponseProjection subProjection) {
        return object(null, input, subProjection);
    }

    public RepositoryResponseProjection object(String alias, RepositoryObjectParametrizedInput input, GitObjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("object").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection openGraphImageUrl() {
        return openGraphImageUrl(null);
    }

    public RepositoryResponseProjection openGraphImageUrl(String alias) {
        fields.add(new GraphQLResponseField("openGraphImageUrl").alias(alias));
        return this;
    }

    public RepositoryResponseProjection owner(RepositoryOwnerResponseProjection subProjection) {
        return owner(null, subProjection);
    }

    public RepositoryResponseProjection owner(String alias, RepositoryOwnerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection parent(RepositoryResponseProjection subProjection) {
        return parent(null, subProjection);
    }

    public RepositoryResponseProjection parent(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parent").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection primaryLanguage(LanguageResponseProjection subProjection) {
        return primaryLanguage(null, subProjection);
    }

    public RepositoryResponseProjection primaryLanguage(String alias, LanguageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("primaryLanguage").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection project(ProjectResponseProjection subProjection) {
        return project((String)null, subProjection);
    }

    public RepositoryResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection project(RepositoryProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        return project(null, input, subProjection);
    }

    public RepositoryResponseProjection project(String alias, RepositoryProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection projects(ProjectConnectionResponseProjection subProjection) {
        return projects((String)null, subProjection);
    }

    public RepositoryResponseProjection projects(String alias, ProjectConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection projects(RepositoryProjectsParametrizedInput input, ProjectConnectionResponseProjection subProjection) {
        return projects(null, input, subProjection);
    }

    public RepositoryResponseProjection projects(String alias, RepositoryProjectsParametrizedInput input, ProjectConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection projectsResourcePath() {
        return projectsResourcePath(null);
    }

    public RepositoryResponseProjection projectsResourcePath(String alias) {
        fields.add(new GraphQLResponseField("projectsResourcePath").alias(alias));
        return this;
    }

    public RepositoryResponseProjection projectsUrl() {
        return projectsUrl(null);
    }

    public RepositoryResponseProjection projectsUrl(String alias) {
        fields.add(new GraphQLResponseField("projectsUrl").alias(alias));
        return this;
    }

    public RepositoryResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest((String)null, subProjection);
    }

    public RepositoryResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection pullRequest(RepositoryPullRequestParametrizedInput input, PullRequestResponseProjection subProjection) {
        return pullRequest(null, input, subProjection);
    }

    public RepositoryResponseProjection pullRequest(String alias, RepositoryPullRequestParametrizedInput input, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection pullRequests(PullRequestConnectionResponseProjection subProjection) {
        return pullRequests((String)null, subProjection);
    }

    public RepositoryResponseProjection pullRequests(String alias, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection pullRequests(RepositoryPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        return pullRequests(null, input, subProjection);
    }

    public RepositoryResponseProjection pullRequests(String alias, RepositoryPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection pushedAt() {
        return pushedAt(null);
    }

    public RepositoryResponseProjection pushedAt(String alias) {
        fields.add(new GraphQLResponseField("pushedAt").alias(alias));
        return this;
    }

    public RepositoryResponseProjection rebaseMergeAllowed() {
        return rebaseMergeAllowed(null);
    }

    public RepositoryResponseProjection rebaseMergeAllowed(String alias) {
        fields.add(new GraphQLResponseField("rebaseMergeAllowed").alias(alias));
        return this;
    }

    public RepositoryResponseProjection ref(RefResponseProjection subProjection) {
        return ref((String)null, subProjection);
    }

    public RepositoryResponseProjection ref(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection ref(RepositoryRefParametrizedInput input, RefResponseProjection subProjection) {
        return ref(null, input, subProjection);
    }

    public RepositoryResponseProjection ref(String alias, RepositoryRefParametrizedInput input, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ref").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection refs(RefConnectionResponseProjection subProjection) {
        return refs((String)null, subProjection);
    }

    public RepositoryResponseProjection refs(String alias, RefConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("refs").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection refs(RepositoryRefsParametrizedInput input, RefConnectionResponseProjection subProjection) {
        return refs(null, input, subProjection);
    }

    public RepositoryResponseProjection refs(String alias, RepositoryRefsParametrizedInput input, RefConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("refs").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection registryPackages(RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackages((String)null, subProjection);
    }

    public RepositoryResponseProjection registryPackages(String alias, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection registryPackages(RepositoryRegistryPackagesParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        return registryPackages(null, input, subProjection);
    }

    public RepositoryResponseProjection registryPackages(String alias, RepositoryRegistryPackagesParametrizedInput input, RegistryPackageConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackages").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection release(ReleaseResponseProjection subProjection) {
        return release((String)null, subProjection);
    }

    public RepositoryResponseProjection release(String alias, ReleaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("release").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection release(RepositoryReleaseParametrizedInput input, ReleaseResponseProjection subProjection) {
        return release(null, input, subProjection);
    }

    public RepositoryResponseProjection release(String alias, RepositoryReleaseParametrizedInput input, ReleaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("release").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection releases(ReleaseConnectionResponseProjection subProjection) {
        return releases((String)null, subProjection);
    }

    public RepositoryResponseProjection releases(String alias, ReleaseConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("releases").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection releases(RepositoryReleasesParametrizedInput input, ReleaseConnectionResponseProjection subProjection) {
        return releases(null, input, subProjection);
    }

    public RepositoryResponseProjection releases(String alias, RepositoryReleasesParametrizedInput input, ReleaseConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("releases").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection repositoryTopics(RepositoryTopicConnectionResponseProjection subProjection) {
        return repositoryTopics((String)null, subProjection);
    }

    public RepositoryResponseProjection repositoryTopics(String alias, RepositoryTopicConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositoryTopics").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection repositoryTopics(RepositoryRepositoryTopicsParametrizedInput input, RepositoryTopicConnectionResponseProjection subProjection) {
        return repositoryTopics(null, input, subProjection);
    }

    public RepositoryResponseProjection repositoryTopics(String alias, RepositoryRepositoryTopicsParametrizedInput input, RepositoryTopicConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositoryTopics").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public RepositoryResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public RepositoryResponseProjection shortDescriptionHTML() {
        return shortDescriptionHTML((String)null);
    }

    public RepositoryResponseProjection shortDescriptionHTML(String alias) {
        fields.add(new GraphQLResponseField("shortDescriptionHTML").alias(alias));
        return this;
    }

    public RepositoryResponseProjection shortDescriptionHTML(RepositoryShortDescriptionHTMLParametrizedInput input) {
        return shortDescriptionHTML(null, input);
    }

    public RepositoryResponseProjection shortDescriptionHTML(String alias, RepositoryShortDescriptionHTMLParametrizedInput input) {
        fields.add(new GraphQLResponseField("shortDescriptionHTML").alias(alias).parameters(input));
        return this;
    }

    public RepositoryResponseProjection squashMergeAllowed() {
        return squashMergeAllowed(null);
    }

    public RepositoryResponseProjection squashMergeAllowed(String alias) {
        fields.add(new GraphQLResponseField("squashMergeAllowed").alias(alias));
        return this;
    }

    public RepositoryResponseProjection sshUrl() {
        return sshUrl(null);
    }

    public RepositoryResponseProjection sshUrl(String alias) {
        fields.add(new GraphQLResponseField("sshUrl").alias(alias));
        return this;
    }

    public RepositoryResponseProjection stargazers(StargazerConnectionResponseProjection subProjection) {
        return stargazers((String)null, subProjection);
    }

    public RepositoryResponseProjection stargazers(String alias, StargazerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection stargazers(RepositoryStargazersParametrizedInput input, StargazerConnectionResponseProjection subProjection) {
        return stargazers(null, input, subProjection);
    }

    public RepositoryResponseProjection stargazers(String alias, RepositoryStargazersParametrizedInput input, StargazerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection templateRepository(RepositoryResponseProjection subProjection) {
        return templateRepository(null, subProjection);
    }

    public RepositoryResponseProjection templateRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("templateRepository").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public RepositoryResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public RepositoryResponseProjection url() {
        return url(null);
    }

    public RepositoryResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public RepositoryResponseProjection usesCustomOpenGraphImage() {
        return usesCustomOpenGraphImage(null);
    }

    public RepositoryResponseProjection usesCustomOpenGraphImage(String alias) {
        fields.add(new GraphQLResponseField("usesCustomOpenGraphImage").alias(alias));
        return this;
    }

    public RepositoryResponseProjection viewerCanAdminister() {
        return viewerCanAdminister(null);
    }

    public RepositoryResponseProjection viewerCanAdminister(String alias) {
        fields.add(new GraphQLResponseField("viewerCanAdminister").alias(alias));
        return this;
    }

    public RepositoryResponseProjection viewerCanCreateProjects() {
        return viewerCanCreateProjects(null);
    }

    public RepositoryResponseProjection viewerCanCreateProjects(String alias) {
        fields.add(new GraphQLResponseField("viewerCanCreateProjects").alias(alias));
        return this;
    }

    public RepositoryResponseProjection viewerCanSubscribe() {
        return viewerCanSubscribe(null);
    }

    public RepositoryResponseProjection viewerCanSubscribe(String alias) {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias));
        return this;
    }

    public RepositoryResponseProjection viewerCanUpdateTopics() {
        return viewerCanUpdateTopics(null);
    }

    public RepositoryResponseProjection viewerCanUpdateTopics(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdateTopics").alias(alias));
        return this;
    }

    public RepositoryResponseProjection viewerHasStarred() {
        return viewerHasStarred(null);
    }

    public RepositoryResponseProjection viewerHasStarred(String alias) {
        fields.add(new GraphQLResponseField("viewerHasStarred").alias(alias));
        return this;
    }

    public RepositoryResponseProjection viewerPermission() {
        return viewerPermission(null);
    }

    public RepositoryResponseProjection viewerPermission(String alias) {
        fields.add(new GraphQLResponseField("viewerPermission").alias(alias));
        return this;
    }

    public RepositoryResponseProjection viewerSubscription() {
        return viewerSubscription(null);
    }

    public RepositoryResponseProjection viewerSubscription(String alias) {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias));
        return this;
    }

    public RepositoryResponseProjection watchers(UserConnectionResponseProjection subProjection) {
        return watchers((String)null, subProjection);
    }

    public RepositoryResponseProjection watchers(String alias, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("watchers").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection watchers(RepositoryWatchersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return watchers(null, input, subProjection);
    }

    public RepositoryResponseProjection watchers(String alias, RepositoryWatchersParametrizedInput input, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("watchers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryResponseProjection typename() {
        return typename(null);
    }

    public RepositoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RepositoryResponseProjection that = (RepositoryResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
