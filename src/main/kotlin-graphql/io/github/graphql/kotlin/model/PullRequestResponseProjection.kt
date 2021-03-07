package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequest
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestResponseProjection {
        this.activeLockReason()
        this.additions()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.UserConnectionResponseProjection.assignees"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", 0) + 1
            this.assignees(UserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.assignees", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.ActorResponseProjection.author"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.author", 0) + 1
            this.author(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.baseRef", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.RefResponseProjection.baseRef"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.baseRef", 0) + 1
            this.baseRef(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.baseRef", 0)))
        }
        this.baseRefName()
        this.baseRefOid()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.RepositoryResponseProjection.baseRepository"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", 0) + 1
            this.baseRepository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.baseRepository", 0)))
        }
        this.body()
        this.bodyHTML()
        this.bodyText()
        this.changedFiles()
        this.closed()
        this.closedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) + 1
            this.comments(IssueCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.IssueCommentConnectionResponseProjection.comments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", 0) + 1
            this.commits(PullRequestCommitConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestCommitConnectionResponseProjection.commits", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        this.deletions()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.ActorResponseProjection.editor"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.editor", 0) + 1
            this.editor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.editor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", 0) + 1
            this.files(PullRequestChangedFileConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestChangedFileConnectionResponseProjection.files", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.headRef", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.RefResponseProjection.headRef"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.headRef", 0) + 1
            this.headRef(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RefResponseProjection.headRef", 0)))
        }
        this.headRefName()
        this.headRefOid()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.RepositoryResponseProjection.headRepository"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", 0) + 1
            this.headRepository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.headRepository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", 0) + 1
            this.headRepositoryOwner(RepositoryOwnerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryOwnerResponseProjection.headRepositoryOwner", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.isCrossRepository()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.LabelConnectionResponseProjection.labels"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1
            this.labels(LabelConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.LabelConnectionResponseProjection.labels", 0)))
        }
        this.lastEditedAt()
        this.locked()
        this.maintainerCanModify()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.CommitResponseProjection.mergeCommit"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", 0) + 1
            this.mergeCommit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.mergeCommit", 0)))
        }
        this.mergeable()
        this.merged()
        this.mergedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.mergedBy", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.ActorResponseProjection.mergedBy"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.mergedBy", 0) + 1
            this.mergedBy(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ActorResponseProjection.mergedBy", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.MilestoneResponseProjection.milestone", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.MilestoneResponseProjection.milestone"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.MilestoneResponseProjection.milestone", 0) + 1
            this.milestone(MilestoneResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.MilestoneResponseProjection.milestone", 0)))
        }
        this.number()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.participants", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.UserConnectionResponseProjection.participants"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.participants", 0) + 1
            this.participants(UserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserConnectionResponseProjection.participants", 0)))
        }
        this.permalink()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", 0) + 1
            this.potentialMergeCommit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.CommitResponseProjection.potentialMergeCommit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) + 1
            this.projectCards(ProjectCardConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0)))
        }
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1
            this.reactionGroups(ReactionGroupResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1
            this.reactions(ReactionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.revertResourcePath()
        this.revertUrl()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", 0) + 1
            this.reviewRequests(ReviewRequestConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.ReviewRequestConnectionResponseProjection.reviewRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", 0) + 1
            this.reviewThreads(PullRequestReviewThreadConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewThreadConnectionResponseProjection.reviewThreads", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", 0) + 1
            this.reviews(PullRequestReviewConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestReviewConnectionResponseProjection.reviews", 0)))
        }
        this.state()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", 0) + 1
            this.suggestedReviewers(SuggestedReviewerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.SuggestedReviewerResponseProjection.suggestedReviewers", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", 0) + 1
            this.timeline(PullRequestTimelineConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineConnectionResponseProjection.timeline", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", 0) + 1
            this.timelineItems(PullRequestTimelineItemsConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.PullRequestTimelineItemsConnectionResponseProjection.timelineItems", 0)))
        }
        this.title()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits"] = projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1
            this.userContentEdits(UserContentEditConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanApplySuggestion()
        this.viewerCanReact()
        this.viewerCanSubscribe()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.viewerSubscription()
        this.typename()
        return this
    }

    fun activeLockReason(): PullRequestResponseProjection = activeLockReason(null)

    fun activeLockReason(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("activeLockReason").alias(alias))
        return this
    }

    fun additions(): PullRequestResponseProjection = additions(null)

    fun additions(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("additions").alias(alias))
        return this
    }

    fun assignees(subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = assignees(null, subProjection)

    fun assignees(alias: String?, subProjection: UserConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("assignees").alias(alias).projection(subProjection))
        return this
    }

    fun assignees(input: PullRequestAssigneesParametrizedInput, subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = assignees(null, input, subProjection)

    fun assignees(alias: String?, input: PullRequestAssigneesParametrizedInput, subProjection: UserConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("assignees").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun author(subProjection: ActorResponseProjection): PullRequestResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: ActorResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun authorAssociation(): PullRequestResponseProjection = authorAssociation(null)

    fun authorAssociation(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("authorAssociation").alias(alias))
        return this
    }

    fun baseRef(subProjection: RefResponseProjection): PullRequestResponseProjection = baseRef(null, subProjection)

    fun baseRef(alias: String?, subProjection: RefResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("baseRef").alias(alias).projection(subProjection))
        return this
    }

    fun baseRefName(): PullRequestResponseProjection = baseRefName(null)

    fun baseRefName(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("baseRefName").alias(alias))
        return this
    }

    fun baseRefOid(): PullRequestResponseProjection = baseRefOid(null)

    fun baseRefOid(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("baseRefOid").alias(alias))
        return this
    }

    fun baseRepository(subProjection: RepositoryResponseProjection): PullRequestResponseProjection = baseRepository(null, subProjection)

    fun baseRepository(alias: String?, subProjection: RepositoryResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("baseRepository").alias(alias).projection(subProjection))
        return this
    }

    fun body(): PullRequestResponseProjection = body(null)

    fun body(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): PullRequestResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun bodyText(): PullRequestResponseProjection = bodyText(null)

    fun bodyText(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("bodyText").alias(alias))
        return this
    }

    fun changedFiles(): PullRequestResponseProjection = changedFiles(null)

    fun changedFiles(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("changedFiles").alias(alias))
        return this
    }

    fun closed(): PullRequestResponseProjection = closed(null)

    fun closed(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("closed").alias(alias))
        return this
    }

    fun closedAt(): PullRequestResponseProjection = closedAt(null)

    fun closedAt(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("closedAt").alias(alias))
        return this
    }

    fun comments(subProjection: IssueCommentConnectionResponseProjection): PullRequestResponseProjection = comments(null, subProjection)

    fun comments(alias: String?, subProjection: IssueCommentConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).projection(subProjection))
        return this
    }

    fun comments(input: PullRequestCommentsParametrizedInput, subProjection: IssueCommentConnectionResponseProjection): PullRequestResponseProjection = comments(null, input, subProjection)

    fun comments(alias: String?, input: PullRequestCommentsParametrizedInput, subProjection: IssueCommentConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun commits(subProjection: PullRequestCommitConnectionResponseProjection): PullRequestResponseProjection = commits(null, subProjection)

    fun commits(alias: String?, subProjection: PullRequestCommitConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("commits").alias(alias).projection(subProjection))
        return this
    }

    fun commits(input: PullRequestCommitsParametrizedInput, subProjection: PullRequestCommitConnectionResponseProjection): PullRequestResponseProjection = commits(null, input, subProjection)

    fun commits(alias: String?, input: PullRequestCommitsParametrizedInput, subProjection: PullRequestCommitConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("commits").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createdAt(): PullRequestResponseProjection = createdAt(null)

    fun createdAt(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun createdViaEmail(): PullRequestResponseProjection = createdViaEmail(null)

    fun createdViaEmail(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("createdViaEmail").alias(alias))
        return this
    }

    fun databaseId(): PullRequestResponseProjection = databaseId(null)

    fun databaseId(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun deletions(): PullRequestResponseProjection = deletions(null)

    fun deletions(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("deletions").alias(alias))
        return this
    }

    fun editor(subProjection: ActorResponseProjection): PullRequestResponseProjection = editor(null, subProjection)

    fun editor(alias: String?, subProjection: ActorResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("editor").alias(alias).projection(subProjection))
        return this
    }

    fun files(subProjection: PullRequestChangedFileConnectionResponseProjection): PullRequestResponseProjection = files(null, subProjection)

    fun files(alias: String?, subProjection: PullRequestChangedFileConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("files").alias(alias).projection(subProjection))
        return this
    }

    fun files(input: PullRequestFilesParametrizedInput, subProjection: PullRequestChangedFileConnectionResponseProjection): PullRequestResponseProjection = files(null, input, subProjection)

    fun files(alias: String?, input: PullRequestFilesParametrizedInput, subProjection: PullRequestChangedFileConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("files").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun headRef(subProjection: RefResponseProjection): PullRequestResponseProjection = headRef(null, subProjection)

    fun headRef(alias: String?, subProjection: RefResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("headRef").alias(alias).projection(subProjection))
        return this
    }

    fun headRefName(): PullRequestResponseProjection = headRefName(null)

    fun headRefName(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("headRefName").alias(alias))
        return this
    }

    fun headRefOid(): PullRequestResponseProjection = headRefOid(null)

    fun headRefOid(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("headRefOid").alias(alias))
        return this
    }

    fun headRepository(subProjection: RepositoryResponseProjection): PullRequestResponseProjection = headRepository(null, subProjection)

    fun headRepository(alias: String?, subProjection: RepositoryResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("headRepository").alias(alias).projection(subProjection))
        return this
    }

    fun headRepositoryOwner(subProjection: RepositoryOwnerResponseProjection): PullRequestResponseProjection = headRepositoryOwner(null, subProjection)

    fun headRepositoryOwner(alias: String?, subProjection: RepositoryOwnerResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("headRepositoryOwner").alias(alias).projection(subProjection))
        return this
    }

    fun id(): PullRequestResponseProjection = id(null)

    fun id(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun includesCreatedEdit(): PullRequestResponseProjection = includesCreatedEdit(null)

    fun includesCreatedEdit(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("includesCreatedEdit").alias(alias))
        return this
    }

    fun isCrossRepository(): PullRequestResponseProjection = isCrossRepository(null)

    fun isCrossRepository(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("isCrossRepository").alias(alias))
        return this
    }

    fun labels(subProjection: LabelConnectionResponseProjection): PullRequestResponseProjection = labels(null, subProjection)

    fun labels(alias: String?, subProjection: LabelConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("labels").alias(alias).projection(subProjection))
        return this
    }

    fun labels(input: PullRequestLabelsParametrizedInput, subProjection: LabelConnectionResponseProjection): PullRequestResponseProjection = labels(null, input, subProjection)

    fun labels(alias: String?, input: PullRequestLabelsParametrizedInput, subProjection: LabelConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun lastEditedAt(): PullRequestResponseProjection = lastEditedAt(null)

    fun lastEditedAt(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("lastEditedAt").alias(alias))
        return this
    }

    fun locked(): PullRequestResponseProjection = locked(null)

    fun locked(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("locked").alias(alias))
        return this
    }

    fun maintainerCanModify(): PullRequestResponseProjection = maintainerCanModify(null)

    fun maintainerCanModify(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("maintainerCanModify").alias(alias))
        return this
    }

    fun mergeCommit(subProjection: CommitResponseProjection): PullRequestResponseProjection = mergeCommit(null, subProjection)

    fun mergeCommit(alias: String?, subProjection: CommitResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("mergeCommit").alias(alias).projection(subProjection))
        return this
    }

    fun mergeable(): PullRequestResponseProjection = mergeable(null)

    fun mergeable(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("mergeable").alias(alias))
        return this
    }

    fun merged(): PullRequestResponseProjection = merged(null)

    fun merged(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("merged").alias(alias))
        return this
    }

    fun mergedAt(): PullRequestResponseProjection = mergedAt(null)

    fun mergedAt(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("mergedAt").alias(alias))
        return this
    }

    fun mergedBy(subProjection: ActorResponseProjection): PullRequestResponseProjection = mergedBy(null, subProjection)

    fun mergedBy(alias: String?, subProjection: ActorResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("mergedBy").alias(alias).projection(subProjection))
        return this
    }

    fun milestone(subProjection: MilestoneResponseProjection): PullRequestResponseProjection = milestone(null, subProjection)

    fun milestone(alias: String?, subProjection: MilestoneResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("milestone").alias(alias).projection(subProjection))
        return this
    }

    fun number(): PullRequestResponseProjection = number(null)

    fun number(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("number").alias(alias))
        return this
    }

    fun participants(subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = participants(null, subProjection)

    fun participants(alias: String?, subProjection: UserConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("participants").alias(alias).projection(subProjection))
        return this
    }

    fun participants(input: PullRequestParticipantsParametrizedInput, subProjection: UserConnectionResponseProjection): PullRequestResponseProjection = participants(null, input, subProjection)

    fun participants(alias: String?, input: PullRequestParticipantsParametrizedInput, subProjection: UserConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("participants").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun permalink(): PullRequestResponseProjection = permalink(null)

    fun permalink(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("permalink").alias(alias))
        return this
    }

    fun potentialMergeCommit(subProjection: CommitResponseProjection): PullRequestResponseProjection = potentialMergeCommit(null, subProjection)

    fun potentialMergeCommit(alias: String?, subProjection: CommitResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("potentialMergeCommit").alias(alias).projection(subProjection))
        return this
    }

    fun projectCards(subProjection: ProjectCardConnectionResponseProjection): PullRequestResponseProjection = projectCards(null, subProjection)

    fun projectCards(alias: String?, subProjection: ProjectCardConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("projectCards").alias(alias).projection(subProjection))
        return this
    }

    fun projectCards(input: PullRequestProjectCardsParametrizedInput, subProjection: ProjectCardConnectionResponseProjection): PullRequestResponseProjection = projectCards(null, input, subProjection)

    fun projectCards(alias: String?, input: PullRequestProjectCardsParametrizedInput, subProjection: ProjectCardConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("projectCards").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun publishedAt(): PullRequestResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun reactionGroups(subProjection: ReactionGroupResponseProjection): PullRequestResponseProjection = reactionGroups(null, subProjection)

    fun reactionGroups(alias: String?, subProjection: ReactionGroupResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(subProjection: ReactionConnectionResponseProjection): PullRequestResponseProjection = reactions(null, subProjection)

    fun reactions(alias: String?, subProjection: ReactionConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(input: PullRequestReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): PullRequestResponseProjection = reactions(null, input, subProjection)

    fun reactions(alias: String?, input: PullRequestReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): PullRequestResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): PullRequestResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun revertResourcePath(): PullRequestResponseProjection = revertResourcePath(null)

    fun revertResourcePath(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("revertResourcePath").alias(alias))
        return this
    }

    fun revertUrl(): PullRequestResponseProjection = revertUrl(null)

    fun revertUrl(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("revertUrl").alias(alias))
        return this
    }

    fun reviewRequests(subProjection: ReviewRequestConnectionResponseProjection): PullRequestResponseProjection = reviewRequests(null, subProjection)

    fun reviewRequests(alias: String?, subProjection: ReviewRequestConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("reviewRequests").alias(alias).projection(subProjection))
        return this
    }

    fun reviewRequests(input: PullRequestReviewRequestsParametrizedInput, subProjection: ReviewRequestConnectionResponseProjection): PullRequestResponseProjection = reviewRequests(null, input, subProjection)

    fun reviewRequests(alias: String?, input: PullRequestReviewRequestsParametrizedInput, subProjection: ReviewRequestConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("reviewRequests").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun reviewThreads(subProjection: PullRequestReviewThreadConnectionResponseProjection): PullRequestResponseProjection = reviewThreads(null, subProjection)

    fun reviewThreads(alias: String?, subProjection: PullRequestReviewThreadConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("reviewThreads").alias(alias).projection(subProjection))
        return this
    }

    fun reviewThreads(input: PullRequestReviewThreadsParametrizedInput, subProjection: PullRequestReviewThreadConnectionResponseProjection): PullRequestResponseProjection = reviewThreads(null, input, subProjection)

    fun reviewThreads(alias: String?, input: PullRequestReviewThreadsParametrizedInput, subProjection: PullRequestReviewThreadConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("reviewThreads").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun reviews(subProjection: PullRequestReviewConnectionResponseProjection): PullRequestResponseProjection = reviews(null, subProjection)

    fun reviews(alias: String?, subProjection: PullRequestReviewConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("reviews").alias(alias).projection(subProjection))
        return this
    }

    fun reviews(input: PullRequestReviewsParametrizedInput, subProjection: PullRequestReviewConnectionResponseProjection): PullRequestResponseProjection = reviews(null, input, subProjection)

    fun reviews(alias: String?, input: PullRequestReviewsParametrizedInput, subProjection: PullRequestReviewConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("reviews").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun state(): PullRequestResponseProjection = state(null)

    fun state(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun suggestedReviewers(subProjection: SuggestedReviewerResponseProjection): PullRequestResponseProjection = suggestedReviewers(null, subProjection)

    fun suggestedReviewers(alias: String?, subProjection: SuggestedReviewerResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("suggestedReviewers").alias(alias).projection(subProjection))
        return this
    }

    @Deprecated(message = "`timeline` will be removed Use PullRequest.timelineItems instead. Removal on 2019-10-01 UTC.")
    fun timeline(subProjection: PullRequestTimelineConnectionResponseProjection): PullRequestResponseProjection = timeline(null, subProjection)

    fun timeline(alias: String?, subProjection: PullRequestTimelineConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("timeline").alias(alias).projection(subProjection))
        return this
    }

    fun timeline(input: PullRequestTimelineParametrizedInput, subProjection: PullRequestTimelineConnectionResponseProjection): PullRequestResponseProjection = timeline(null, input, subProjection)

    fun timeline(alias: String?, input: PullRequestTimelineParametrizedInput, subProjection: PullRequestTimelineConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("timeline").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun timelineItems(subProjection: PullRequestTimelineItemsConnectionResponseProjection): PullRequestResponseProjection = timelineItems(null, subProjection)

    fun timelineItems(alias: String?, subProjection: PullRequestTimelineItemsConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("timelineItems").alias(alias).projection(subProjection))
        return this
    }

    fun timelineItems(input: PullRequestTimelineItemsParametrizedInput, subProjection: PullRequestTimelineItemsConnectionResponseProjection): PullRequestResponseProjection = timelineItems(null, input, subProjection)

    fun timelineItems(alias: String?, input: PullRequestTimelineItemsParametrizedInput, subProjection: PullRequestTimelineItemsConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("timelineItems").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun title(): PullRequestResponseProjection = title(null)

    fun title(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("title").alias(alias))
        return this
    }

    fun updatedAt(): PullRequestResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): PullRequestResponseProjection = url(null)

    fun url(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun userContentEdits(subProjection: UserContentEditConnectionResponseProjection): PullRequestResponseProjection = userContentEdits(null, subProjection)

    fun userContentEdits(alias: String?, subProjection: UserContentEditConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        return this
    }

    fun userContentEdits(input: PullRequestUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): PullRequestResponseProjection = userContentEdits(null, input, subProjection)

    fun userContentEdits(alias: String?, input: PullRequestUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerCanApplySuggestion(): PullRequestResponseProjection = viewerCanApplySuggestion(null)

    fun viewerCanApplySuggestion(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("viewerCanApplySuggestion").alias(alias))
        return this
    }

    fun viewerCanReact(): PullRequestResponseProjection = viewerCanReact(null)

    fun viewerCanReact(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("viewerCanReact").alias(alias))
        return this
    }

    fun viewerCanSubscribe(): PullRequestResponseProjection = viewerCanSubscribe(null)

    fun viewerCanSubscribe(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("viewerCanSubscribe").alias(alias))
        return this
    }

    fun viewerCanUpdate(): PullRequestResponseProjection = viewerCanUpdate(null)

    fun viewerCanUpdate(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdate").alias(alias))
        return this
    }

    fun viewerCannotUpdateReasons(): PullRequestResponseProjection = viewerCannotUpdateReasons(null)

    fun viewerCannotUpdateReasons(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        return this
    }

    fun viewerDidAuthor(): PullRequestResponseProjection = viewerDidAuthor(null)

    fun viewerDidAuthor(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("viewerDidAuthor").alias(alias))
        return this
    }

    fun viewerSubscription(): PullRequestResponseProjection = viewerSubscription(null)

    fun viewerSubscription(alias: String?): PullRequestResponseProjection {
        fields.add(GraphQLResponseField("viewerSubscription").alias(alias))
        return this
    }

    fun typename(): PullRequestResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestResponseProjection {
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
        val that = other as PullRequestResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
