package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequest
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestResponseProjection = {
        this.activeLockReason()
        this.additions()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", 0) + 1)
            this.assignees(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.author", 0) + 1)
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.baseRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RefResponseProjection.baseRef", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.baseRef", 0) + 1)
            this.baseRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.baseRef", 0)))
        }
        this.baseRefName()
        this.baseRefOid()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", 0) + 1)
            this.baseRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", 0)))
        }
        this.body()
        this.bodyHTML()
        this.bodyText()
        this.changedFiles()
        this.closed()
        this.closedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) + 1)
            this.comments(new IssueCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", 0) + 1)
            this.commits(new PullRequestCommitConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        this.deletions()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.editor", 0) + 1)
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.editor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", 0) + 1)
            this.files(new PullRequestChangedFileConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.headRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RefResponseProjection.headRef", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.headRef", 0) + 1)
            this.headRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.headRef", 0)))
        }
        this.headRefName()
        this.headRefOid()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", 0) + 1)
            this.headRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", 0) + 1)
            this.headRepositoryOwner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.isCrossRepository()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1)
            this.labels(new LabelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", 0)))
        }
        this.lastEditedAt()
        this.locked()
        this.maintainerCanModify()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", 0) + 1)
            this.mergeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", 0)))
        }
        this.mergeable()
        this.merged()
        this.mergedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.mergedBy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ActorResponseProjection.mergedBy", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.mergedBy", 0) + 1)
            this.mergedBy(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.mergedBy", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.MilestoneResponseProjection.milestone", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.MilestoneResponseProjection.milestone", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.MilestoneResponseProjection.milestone", 0) + 1)
            this.milestone(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.MilestoneResponseProjection.milestone", 0)))
        }
        this.number()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.participants", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.UserConnectionResponseProjection.participants", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.participants", 0) + 1)
            this.participants(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.participants", 0)))
        }
        this.permalink()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", 0) + 1)
            this.potentialMergeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) + 1)
            this.projectCards(new ProjectCardConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0)))
        }
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1)
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1)
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.revertResourcePath()
        this.revertUrl()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", 0) + 1)
            this.reviewRequests(new ReviewRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", 0) + 1)
            this.reviewThreads(new PullRequestReviewThreadConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", 0) + 1)
            this.reviews(new PullRequestReviewConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", 0)))
        }
        this.state()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", 0) + 1)
            this.suggestedReviewers(new SuggestedReviewerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", 0) + 1)
            this.timeline(new PullRequestTimelineConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", 0) + 1)
            this.timelineItems(new PullRequestTimelineItemsConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", 0)))
        }
        this.title()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1)
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanApplySuggestion()
        this.viewerCanReact()
        this.viewerCanSubscribe()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.viewerSubscription()
        this.typename()
        this
    }

    def activeLockReason(): PullRequestResponseProjection = {
        activeLockReason(null.asInstanceOf[String])
    }

    def activeLockReason(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("activeLockReason").alias(alias))
        this
    }

    def additions(): PullRequestResponseProjection = {
        additions(null.asInstanceOf[String])
    }

    def additions(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("additions").alias(alias))
        this
    }

    def assignees(subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = {
        assignees(null.asInstanceOf[String], subProjection)
    }

    def assignees(alias: String, subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("assignees").alias(alias).projection(subProjection))
        this
    }

    def assignees(input: PullRequestAssigneesParametrizedInput,subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = {
        assignees(null.asInstanceOf[String], input, subProjection)
    }

    def assignees(alias: String, input: PullRequestAssigneesParametrizedInput , subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("assignees").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def author(subProjection: ActorResponseProjection): PullRequestResponseProjection = {
        author(null.asInstanceOf[String], subProjection)
    }

    def author(alias: String, subProjection: ActorResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection))
        this
    }

    def authorAssociation(): PullRequestResponseProjection = {
        authorAssociation(null.asInstanceOf[String])
    }

    def authorAssociation(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias))
        this
    }

    def baseRef(subProjection: RefResponseProjection): PullRequestResponseProjection = {
        baseRef(null.asInstanceOf[String], subProjection)
    }

    def baseRef(alias: String, subProjection: RefResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("baseRef").alias(alias).projection(subProjection))
        this
    }

    def baseRefName(): PullRequestResponseProjection = {
        baseRefName(null.asInstanceOf[String])
    }

    def baseRefName(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("baseRefName").alias(alias))
        this
    }

    def baseRefOid(): PullRequestResponseProjection = {
        baseRefOid(null.asInstanceOf[String])
    }

    def baseRefOid(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("baseRefOid").alias(alias))
        this
    }

    def baseRepository(subProjection: RepositoryResponseProjection): PullRequestResponseProjection = {
        baseRepository(null.asInstanceOf[String], subProjection)
    }

    def baseRepository(alias: String, subProjection: RepositoryResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("baseRepository").alias(alias).projection(subProjection))
        this
    }

    def body(): PullRequestResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def bodyHTML(): PullRequestResponseProjection = {
        bodyHTML(null.asInstanceOf[String])
    }

    def bodyHTML(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias))
        this
    }

    def bodyText(): PullRequestResponseProjection = {
        bodyText(null.asInstanceOf[String])
    }

    def bodyText(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("bodyText").alias(alias))
        this
    }

    def changedFiles(): PullRequestResponseProjection = {
        changedFiles(null.asInstanceOf[String])
    }

    def changedFiles(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("changedFiles").alias(alias))
        this
    }

    def closed(): PullRequestResponseProjection = {
        closed(null.asInstanceOf[String])
    }

    def closed(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("closed").alias(alias))
        this
    }

    def closedAt(): PullRequestResponseProjection = {
        closedAt(null.asInstanceOf[String])
    }

    def closedAt(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("closedAt").alias(alias))
        this
    }

    def comments(subProjection: IssueCommentConnectionResponseProjection): PullRequestResponseProjection = {
        comments(null.asInstanceOf[String], subProjection)
    }

    def comments(alias: String, subProjection: IssueCommentConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection))
        this
    }

    def comments(input: PullRequestCommentsParametrizedInput,subProjection: IssueCommentConnectionResponseProjection): PullRequestResponseProjection = {
        comments(null.asInstanceOf[String], input, subProjection)
    }

    def comments(alias: String, input: PullRequestCommentsParametrizedInput , subProjection: IssueCommentConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def commits(subProjection: PullRequestCommitConnectionResponseProjection): PullRequestResponseProjection = {
        commits(null.asInstanceOf[String], subProjection)
    }

    def commits(alias: String, subProjection: PullRequestCommitConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("commits").alias(alias).projection(subProjection))
        this
    }

    def commits(input: PullRequestCommitsParametrizedInput,subProjection: PullRequestCommitConnectionResponseProjection): PullRequestResponseProjection = {
        commits(null.asInstanceOf[String], input, subProjection)
    }

    def commits(alias: String, input: PullRequestCommitsParametrizedInput , subProjection: PullRequestCommitConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("commits").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createdAt(): PullRequestResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def createdViaEmail(): PullRequestResponseProjection = {
        createdViaEmail(null.asInstanceOf[String])
    }

    def createdViaEmail(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias))
        this
    }

    def databaseId(): PullRequestResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def deletions(): PullRequestResponseProjection = {
        deletions(null.asInstanceOf[String])
    }

    def deletions(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("deletions").alias(alias))
        this
    }

    def editor(subProjection: ActorResponseProjection): PullRequestResponseProjection = {
        editor(null.asInstanceOf[String], subProjection)
    }

    def editor(alias: String, subProjection: ActorResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection))
        this
    }

    def files(subProjection: PullRequestChangedFileConnectionResponseProjection): PullRequestResponseProjection = {
        files(null.asInstanceOf[String], subProjection)
    }

    def files(alias: String, subProjection: PullRequestChangedFileConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection))
        this
    }

    def files(input: PullRequestFilesParametrizedInput,subProjection: PullRequestChangedFileConnectionResponseProjection): PullRequestResponseProjection = {
        files(null.asInstanceOf[String], input, subProjection)
    }

    def files(alias: String, input: PullRequestFilesParametrizedInput , subProjection: PullRequestChangedFileConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("files").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def headRef(subProjection: RefResponseProjection): PullRequestResponseProjection = {
        headRef(null.asInstanceOf[String], subProjection)
    }

    def headRef(alias: String, subProjection: RefResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("headRef").alias(alias).projection(subProjection))
        this
    }

    def headRefName(): PullRequestResponseProjection = {
        headRefName(null.asInstanceOf[String])
    }

    def headRefName(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("headRefName").alias(alias))
        this
    }

    def headRefOid(): PullRequestResponseProjection = {
        headRefOid(null.asInstanceOf[String])
    }

    def headRefOid(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("headRefOid").alias(alias))
        this
    }

    def headRepository(subProjection: RepositoryResponseProjection): PullRequestResponseProjection = {
        headRepository(null.asInstanceOf[String], subProjection)
    }

    def headRepository(alias: String, subProjection: RepositoryResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("headRepository").alias(alias).projection(subProjection))
        this
    }

    def headRepositoryOwner(subProjection: RepositoryOwnerResponseProjection): PullRequestResponseProjection = {
        headRepositoryOwner(null.asInstanceOf[String], subProjection)
    }

    def headRepositoryOwner(alias: String, subProjection: RepositoryOwnerResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("headRepositoryOwner").alias(alias).projection(subProjection))
        this
    }

    def id(): PullRequestResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def includesCreatedEdit(): PullRequestResponseProjection = {
        includesCreatedEdit(null.asInstanceOf[String])
    }

    def includesCreatedEdit(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias))
        this
    }

    def isCrossRepository(): PullRequestResponseProjection = {
        isCrossRepository(null.asInstanceOf[String])
    }

    def isCrossRepository(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("isCrossRepository").alias(alias))
        this
    }

    def labels(subProjection: LabelConnectionResponseProjection): PullRequestResponseProjection = {
        labels(null.asInstanceOf[String], subProjection)
    }

    def labels(alias: String, subProjection: LabelConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("labels").alias(alias).projection(subProjection))
        this
    }

    def labels(input: PullRequestLabelsParametrizedInput,subProjection: LabelConnectionResponseProjection): PullRequestResponseProjection = {
        labels(null.asInstanceOf[String], input, subProjection)
    }

    def labels(alias: String, input: PullRequestLabelsParametrizedInput , subProjection: LabelConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def lastEditedAt(): PullRequestResponseProjection = {
        lastEditedAt(null.asInstanceOf[String])
    }

    def lastEditedAt(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias))
        this
    }

    def locked(): PullRequestResponseProjection = {
        locked(null.asInstanceOf[String])
    }

    def locked(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("locked").alias(alias))
        this
    }

    def maintainerCanModify(): PullRequestResponseProjection = {
        maintainerCanModify(null.asInstanceOf[String])
    }

    def maintainerCanModify(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("maintainerCanModify").alias(alias))
        this
    }

    def mergeCommit(subProjection: CommitResponseProjection): PullRequestResponseProjection = {
        mergeCommit(null.asInstanceOf[String], subProjection)
    }

    def mergeCommit(alias: String, subProjection: CommitResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("mergeCommit").alias(alias).projection(subProjection))
        this
    }

    def mergeable(): PullRequestResponseProjection = {
        mergeable(null.asInstanceOf[String])
    }

    def mergeable(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("mergeable").alias(alias))
        this
    }

    def merged(): PullRequestResponseProjection = {
        merged(null.asInstanceOf[String])
    }

    def merged(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("merged").alias(alias))
        this
    }

    def mergedAt(): PullRequestResponseProjection = {
        mergedAt(null.asInstanceOf[String])
    }

    def mergedAt(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("mergedAt").alias(alias))
        this
    }

    def mergedBy(subProjection: ActorResponseProjection): PullRequestResponseProjection = {
        mergedBy(null.asInstanceOf[String], subProjection)
    }

    def mergedBy(alias: String, subProjection: ActorResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("mergedBy").alias(alias).projection(subProjection))
        this
    }

    def milestone(subProjection: MilestoneResponseProjection): PullRequestResponseProjection = {
        milestone(null.asInstanceOf[String], subProjection)
    }

    def milestone(alias: String, subProjection: MilestoneResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("milestone").alias(alias).projection(subProjection))
        this
    }

    def number(): PullRequestResponseProjection = {
        number(null.asInstanceOf[String])
    }

    def number(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("number").alias(alias))
        this
    }

    def participants(subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = {
        participants(null.asInstanceOf[String], subProjection)
    }

    def participants(alias: String, subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("participants").alias(alias).projection(subProjection))
        this
    }

    def participants(input: PullRequestParticipantsParametrizedInput,subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = {
        participants(null.asInstanceOf[String], input, subProjection)
    }

    def participants(alias: String, input: PullRequestParticipantsParametrizedInput , subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("participants").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def permalink(): PullRequestResponseProjection = {
        permalink(null.asInstanceOf[String])
    }

    def permalink(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("permalink").alias(alias))
        this
    }

    def potentialMergeCommit(subProjection: CommitResponseProjection): PullRequestResponseProjection = {
        potentialMergeCommit(null.asInstanceOf[String], subProjection)
    }

    def potentialMergeCommit(alias: String, subProjection: CommitResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("potentialMergeCommit").alias(alias).projection(subProjection))
        this
    }

    def projectCards(subProjection: ProjectCardConnectionResponseProjection): PullRequestResponseProjection = {
        projectCards(null.asInstanceOf[String], subProjection)
    }

    def projectCards(alias: String, subProjection: ProjectCardConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("projectCards").alias(alias).projection(subProjection))
        this
    }

    def projectCards(input: PullRequestProjectCardsParametrizedInput,subProjection: ProjectCardConnectionResponseProjection): PullRequestResponseProjection = {
        projectCards(null.asInstanceOf[String], input, subProjection)
    }

    def projectCards(alias: String, input: PullRequestProjectCardsParametrizedInput , subProjection: ProjectCardConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("projectCards").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def publishedAt(): PullRequestResponseProjection = {
        publishedAt(null.asInstanceOf[String])
    }

    def publishedAt(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias))
        this
    }

    def reactionGroups(subProjection: ReactionGroupResponseProjection): PullRequestResponseProjection = {
        reactionGroups(null.asInstanceOf[String], subProjection)
    }

    def reactionGroups(alias: String, subProjection: ReactionGroupResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        this
    }

    def reactions(subProjection: ReactionConnectionResponseProjection): PullRequestResponseProjection = {
        reactions(null.asInstanceOf[String], subProjection)
    }

    def reactions(alias: String, subProjection: ReactionConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        this
    }

    def reactions(input: PullRequestReactionsParametrizedInput,subProjection: ReactionConnectionResponseProjection): PullRequestResponseProjection = {
        reactions(null.asInstanceOf[String], input, subProjection)
    }

    def reactions(alias: String, input: PullRequestReactionsParametrizedInput , subProjection: ReactionConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): PullRequestResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): PullRequestResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def revertResourcePath(): PullRequestResponseProjection = {
        revertResourcePath(null.asInstanceOf[String])
    }

    def revertResourcePath(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("revertResourcePath").alias(alias))
        this
    }

    def revertUrl(): PullRequestResponseProjection = {
        revertUrl(null.asInstanceOf[String])
    }

    def revertUrl(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("revertUrl").alias(alias))
        this
    }

    def reviewRequests(subProjection: ReviewRequestConnectionResponseProjection): PullRequestResponseProjection = {
        reviewRequests(null.asInstanceOf[String], subProjection)
    }

    def reviewRequests(alias: String, subProjection: ReviewRequestConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("reviewRequests").alias(alias).projection(subProjection))
        this
    }

    def reviewRequests(input: PullRequestReviewRequestsParametrizedInput,subProjection: ReviewRequestConnectionResponseProjection): PullRequestResponseProjection = {
        reviewRequests(null.asInstanceOf[String], input, subProjection)
    }

    def reviewRequests(alias: String, input: PullRequestReviewRequestsParametrizedInput , subProjection: ReviewRequestConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("reviewRequests").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def reviewThreads(subProjection: PullRequestReviewThreadConnectionResponseProjection): PullRequestResponseProjection = {
        reviewThreads(null.asInstanceOf[String], subProjection)
    }

    def reviewThreads(alias: String, subProjection: PullRequestReviewThreadConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("reviewThreads").alias(alias).projection(subProjection))
        this
    }

    def reviewThreads(input: PullRequestReviewThreadsParametrizedInput,subProjection: PullRequestReviewThreadConnectionResponseProjection): PullRequestResponseProjection = {
        reviewThreads(null.asInstanceOf[String], input, subProjection)
    }

    def reviewThreads(alias: String, input: PullRequestReviewThreadsParametrizedInput , subProjection: PullRequestReviewThreadConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("reviewThreads").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def reviews(subProjection: PullRequestReviewConnectionResponseProjection): PullRequestResponseProjection = {
        reviews(null.asInstanceOf[String], subProjection)
    }

    def reviews(alias: String, subProjection: PullRequestReviewConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("reviews").alias(alias).projection(subProjection))
        this
    }

    def reviews(input: PullRequestReviewsParametrizedInput,subProjection: PullRequestReviewConnectionResponseProjection): PullRequestResponseProjection = {
        reviews(null.asInstanceOf[String], input, subProjection)
    }

    def reviews(alias: String, input: PullRequestReviewsParametrizedInput , subProjection: PullRequestReviewConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("reviews").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def state(): PullRequestResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def suggestedReviewers(subProjection: SuggestedReviewerResponseProjection): PullRequestResponseProjection = {
        suggestedReviewers(null.asInstanceOf[String], subProjection)
    }

    def suggestedReviewers(alias: String, subProjection: SuggestedReviewerResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("suggestedReviewers").alias(alias).projection(subProjection))
        this
    }

    @deprecated(message = "`timeline` will be removed Use PullRequest.timelineItems instead. Removal on 2019-10-01 UTC.")
    def timeline(subProjection: PullRequestTimelineConnectionResponseProjection): PullRequestResponseProjection = {
        timeline(null.asInstanceOf[String], subProjection)
    }

    def timeline(alias: String, subProjection: PullRequestTimelineConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("timeline").alias(alias).projection(subProjection))
        this
    }

    def timeline(input: PullRequestTimelineParametrizedInput,subProjection: PullRequestTimelineConnectionResponseProjection): PullRequestResponseProjection = {
        timeline(null.asInstanceOf[String], input, subProjection)
    }

    def timeline(alias: String, input: PullRequestTimelineParametrizedInput , subProjection: PullRequestTimelineConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("timeline").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def timelineItems(subProjection: PullRequestTimelineItemsConnectionResponseProjection): PullRequestResponseProjection = {
        timelineItems(null.asInstanceOf[String], subProjection)
    }

    def timelineItems(alias: String, subProjection: PullRequestTimelineItemsConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("timelineItems").alias(alias).projection(subProjection))
        this
    }

    def timelineItems(input: PullRequestTimelineItemsParametrizedInput,subProjection: PullRequestTimelineItemsConnectionResponseProjection): PullRequestResponseProjection = {
        timelineItems(null.asInstanceOf[String], input, subProjection)
    }

    def timelineItems(alias: String, input: PullRequestTimelineItemsParametrizedInput , subProjection: PullRequestTimelineItemsConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("timelineItems").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def title(): PullRequestResponseProjection = {
        title(null.asInstanceOf[String])
    }

    def title(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("title").alias(alias))
        this
    }

    def updatedAt(): PullRequestResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): PullRequestResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def userContentEdits(subProjection: UserContentEditConnectionResponseProjection): PullRequestResponseProjection = {
        userContentEdits(null.asInstanceOf[String], subProjection)
    }

    def userContentEdits(alias: String, subProjection: UserContentEditConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        this
    }

    def userContentEdits(input: PullRequestUserContentEditsParametrizedInput,subProjection: UserContentEditConnectionResponseProjection): PullRequestResponseProjection = {
        userContentEdits(null.asInstanceOf[String], input, subProjection)
    }

    def userContentEdits(alias: String, input: PullRequestUserContentEditsParametrizedInput , subProjection: UserContentEditConnectionResponseProjection): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerCanApplySuggestion(): PullRequestResponseProjection = {
        viewerCanApplySuggestion(null.asInstanceOf[String])
    }

    def viewerCanApplySuggestion(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanApplySuggestion").alias(alias))
        this
    }

    def viewerCanReact(): PullRequestResponseProjection = {
        viewerCanReact(null.asInstanceOf[String])
    }

    def viewerCanReact(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias))
        this
    }

    def viewerCanSubscribe(): PullRequestResponseProjection = {
        viewerCanSubscribe(null.asInstanceOf[String])
    }

    def viewerCanSubscribe(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias))
        this
    }

    def viewerCanUpdate(): PullRequestResponseProjection = {
        viewerCanUpdate(null.asInstanceOf[String])
    }

    def viewerCanUpdate(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias))
        this
    }

    def viewerCannotUpdateReasons(): PullRequestResponseProjection = {
        viewerCannotUpdateReasons(null.asInstanceOf[String])
    }

    def viewerCannotUpdateReasons(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        this
    }

    def viewerDidAuthor(): PullRequestResponseProjection = {
        viewerDidAuthor(null.asInstanceOf[String])
    }

    def viewerDidAuthor(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias))
        this
    }

    def viewerSubscription(): PullRequestResponseProjection = {
        viewerSubscription(null.asInstanceOf[String])
    }

    def viewerSubscription(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias))
        this
    }

    def typename(): PullRequestResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PullRequestResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
