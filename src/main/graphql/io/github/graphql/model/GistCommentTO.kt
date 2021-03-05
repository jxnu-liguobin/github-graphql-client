package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class GistCommentTO(
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
    val createdAt: String,
    override
    val createdViaEmail: Boolean,
    val databaseId: Int?,
    override
    val editor: ActorTO?,
    val gist: GistTO,
    override
    val id: String,
    override
    val includesCreatedEdit: Boolean,
    val isMinimized: Boolean,
    override
    val lastEditedAt: String?,
    val minimizedReason: String?,
    override
    val publishedAt: String?,
    override
    val updatedAt: String,
    override
    val viewerCanDelete: Boolean,
    val viewerCanMinimize: Boolean,
    override
    val viewerCanUpdate: Boolean,
    override
    val viewerCannotUpdateReasons: List<CommentCannotUpdateReasonTO>,
    override
    val viewerDidAuthor: Boolean
) : DeletableTO, UpdatableCommentTO, NodeTO, CommentTO, UpdatableTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author))
        }
        joiner.add("authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation))
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML))
        joiner.add("bodyText: " + GraphQLRequestSerializer.getEntry(bodyText))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor))
        }
        joiner.add("gist: " + GraphQLRequestSerializer.getEntry(gist))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit))
        joiner.add("isMinimized: " + GraphQLRequestSerializer.getEntry(isMinimized))
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt))
        }
        if (minimizedReason != null) {
            joiner.add("minimizedReason: " + GraphQLRequestSerializer.getEntry(minimizedReason))
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("viewerCanDelete: " + GraphQLRequestSerializer.getEntry(viewerCanDelete))
        joiner.add("viewerCanMinimize: " + GraphQLRequestSerializer.getEntry(viewerCanMinimize))
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate))
        joiner.add("viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons))
        joiner.add("viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor))
        return joiner.toString()
    }
}
