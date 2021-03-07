package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UserContentEditTO(
    val createdAt: String,
    val deletedAt: String?,
    val deletedBy: ActorTO?,
    val diff: String?,
    val editedAt: String,
    val editor: ActorTO?,
    override
    val id: String,
    val updatedAt: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (deletedAt != null) {
            joiner.add("deletedAt: " + GraphQLRequestSerializer.getEntry(deletedAt))
        }
        if (deletedBy != null) {
            joiner.add("deletedBy: " + GraphQLRequestSerializer.getEntry(deletedBy))
        }
        if (diff != null) {
            joiner.add("diff: " + GraphQLRequestSerializer.getEntry(diff))
        }
        joiner.add("editedAt: " + GraphQLRequestSerializer.getEntry(editedAt))
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        return joiner.toString()
    }

    class Builder {

        private lateinit var createdAt: String
        private var deletedAt: String? = null
        private var deletedBy: ActorTO? = null
        private var diff: String? = null
        private lateinit var editedAt: String
        private var editor: ActorTO? = null
        private lateinit var id: String
        private lateinit var updatedAt: String

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setDeletedAt(deletedAt: String?): Builder {
            this.deletedAt = deletedAt
            return this
        }

        fun setDeletedBy(deletedBy: ActorTO?): Builder {
            this.deletedBy = deletedBy
            return this
        }

        fun setDiff(diff: String?): Builder {
            this.diff = diff
            return this
        }

        fun setEditedAt(editedAt: String): Builder {
            this.editedAt = editedAt
            return this
        }

        fun setEditor(editor: ActorTO?): Builder {
            this.editor = editor
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun build(): UserContentEditTO {
            return UserContentEditTO(createdAt, deletedAt, deletedBy, diff, editedAt, editor, id, updatedAt)
        }
    }
}
