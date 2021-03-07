package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Issue
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface IssueResolver {

    @Throws(Exception::class)
    fun assignees(issueTO: IssueTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

    @Throws(Exception::class)
    fun comments(issueTO: IssueTO, after: String?, before: String?, first: Int?, last: Int?): IssueCommentConnectionTO

    @Throws(Exception::class)
    fun labels(issueTO: IssueTO, after: String?, before: String?, first: Int?, last: Int?): LabelConnectionTO?

    @Throws(Exception::class)
    fun participants(issueTO: IssueTO, after: String?, before: String?, first: Int?, last: Int?): UserConnectionTO

    @Throws(Exception::class)
    fun projectCards(issueTO: IssueTO, after: String?, archivedStates: List<ProjectCardArchivedStateTO?>?, before: String?, first: Int?, last: Int?): ProjectCardConnectionTO

    @Throws(Exception::class)
    fun reactions(issueTO: IssueTO, after: String?, before: String?, content: ReactionContentTO?, first: Int?, last: Int?, orderBy: ReactionOrderTO?): ReactionConnectionTO

    @Deprecated(message = "`timeline` will be removed Use Issue.timelineItems instead. Removal on 2019-10-01 UTC.")
    @Throws(Exception::class)
    fun timeline(issueTO: IssueTO, after: String?, before: String?, first: Int?, last: Int?, since: String?): IssueTimelineConnectionTO

    @Throws(Exception::class)
    fun timelineItems(issueTO: IssueTO, after: String?, before: String?, first: Int?, itemTypes: List<IssueTimelineItemsItemTypeTO>?, last: Int?, since: String?, skip: Int?): IssueTimelineItemsConnectionTO

    @Throws(Exception::class)
    fun userContentEdits(issueTO: IssueTO, after: String?, before: String?, first: Int?, last: Int?): UserContentEditConnectionTO?

}
