package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for PullRequest
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface PullRequestResolver {

    @Throws(Exception::class)
    fun assignees(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

    @Throws(Exception::class)
    fun comments(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?): IssueCommentConnectionTO

    @Throws(Exception::class)
    fun commits(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?): PullRequestCommitConnectionTO

    @Throws(Exception::class)
    fun files(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?): PullRequestChangedFileConnectionTO?

    @Throws(Exception::class)
    fun labels(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?): LabelConnectionTO?

    @Throws(Exception::class)
    fun participants(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

    @Throws(Exception::class)
    fun projectCards(pullRequestTO: PullRequestTO, after: String?, archivedStates: List<ProjectCardArchivedStateTO?>?, before: String?, first: Int?, last: Int?): ProjectCardConnectionTO

    @Throws(Exception::class)
    fun reactions(pullRequestTO: PullRequestTO, after: String?, before: String?, content: ReactionContentTO?, first: Int?, last: Int?, orderBy: ReactionOrderTO?): ReactionConnectionTO

    @Throws(Exception::class)
    fun reviewRequests(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?): ReviewRequestConnectionTO?

    @Throws(Exception::class)
    fun reviewThreads(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?): PullRequestReviewThreadConnectionTO

    @Throws(Exception::class)
    fun reviews(pullRequestTO: PullRequestTO, after: String?, author: String?, before: String?, first: Int?, last: Int?, states: List<PullRequestReviewStateTO>?): PullRequestReviewConnectionTO?

    @Deprecated(message = "`timeline` will be removed Use PullRequest.timelineItems instead. Removal on 2019-10-01 UTC.")
    @Throws(Exception::class)
    fun timeline(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?, since: String?): PullRequestTimelineConnectionTO

    @Throws(Exception::class)
    fun timelineItems(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, itemTypes: List<PullRequestTimelineItemsItemTypeTO>?, last: Int?, since: String?, skip: Int?): PullRequestTimelineItemsConnectionTO

    @Throws(Exception::class)
    fun userContentEdits(pullRequestTO: PullRequestTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
