package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class IssueTO(
    override
    val activeLockReason: LockReasonTO?,
    override
    val author: ActorTO?,
    override
    val authorAssociation: CommentAuthorAssociationTO,
    override
    val body: String,
    override
    val bodyHTML: String,
    override
    val bodyText: String,
    override
    val closed: Boolean,
    override
    val closedAt: String?,
    override
    val createdAt: String,
    override
    val createdViaEmail: Boolean,
    override
    val databaseId: Int?,
    override
    val editor: ActorTO?,
    override
    val id: String,
    override
    val includesCreatedEdit: Boolean,
    override
    val lastEditedAt: String?,
    override
    val locked: Boolean,
    val milestone: MilestoneTO?,
    val number: Int,
    override
    val publishedAt: String?,
    override
    val reactionGroups: List<ReactionGroupTO>?,
    override
    val repository: RepositoryTO,
    override
    val resourcePath: String,
    val state: IssueStateTO,
    val title: String,
    override
    val updatedAt: String,
    override
    val url: String,
    override
    val viewerCanReact: Boolean,
    override
    val viewerCanSubscribe: Boolean,
    override
    val viewerCanUpdate: Boolean,
    override
    val viewerCannotUpdateReasons: List<CommentCannotUpdateReasonTO>,
    override
    val viewerDidAuthor: Boolean,
    override
    val viewerSubscription: SubscriptionStateTO?
) : IssueOrPullRequestTO, ReferencedSubjectTO, SearchResultItemTO, RenamedTitleSubjectTO, ProjectCardItemTO, MilestoneItemTO, SubscribableTO, UniformResourceLocatableTO, UpdatableCommentTO, ClosableTO, LockableTO, NodeTO, LabelableTO, ReactableTO, RepositoryNodeTO, AssignableTO, CommentTO, UpdatableTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (activeLockReason != null) {
            joiner.add("activeLockReason: " + GraphQLRequestSerializer.getEntry(activeLockReason))
        }
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author))
        }
        joiner.add("authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation))
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML))
        joiner.add("bodyText: " + GraphQLRequestSerializer.getEntry(bodyText))
        joiner.add("closed: " + GraphQLRequestSerializer.getEntry(closed))
        if (closedAt != null) {
            joiner.add("closedAt: " + GraphQLRequestSerializer.getEntry(closedAt))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit))
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt))
        }
        joiner.add("locked: " + GraphQLRequestSerializer.getEntry(locked))
        if (milestone != null) {
            joiner.add("milestone: " + GraphQLRequestSerializer.getEntry(milestone))
        }
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number))
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        if (reactionGroups != null) {
            joiner.add("reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups))
        }
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanReact: " + GraphQLRequestSerializer.getEntry(viewerCanReact))
        joiner.add("viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe))
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate))
        joiner.add("viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons))
        joiner.add("viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor))
        if (viewerSubscription != null) {
            joiner.add("viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription))
        }
        return joiner.toString()
    }
}
