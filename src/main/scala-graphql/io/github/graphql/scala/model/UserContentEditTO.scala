package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UserContentEditTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    deletedAt: String,
    deletedBy: ActorTO,
    diff: String,
    @javax.validation.constraints.NotNull
    editedAt: String,
    editor: ActorTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    updatedAt: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (deletedAt != null) "deletedAt: " + GraphQLRequestSerializer.getEntry(deletedAt) else "",
            if (deletedBy != null) "deletedBy: " + GraphQLRequestSerializer.getEntry(deletedBy) else "",
            if (diff != null) "diff: " + GraphQLRequestSerializer.getEntry(diff) else "",
            if (editedAt != null) "editedAt: " + GraphQLRequestSerializer.getEntry(editedAt) else "",
            if (editor != null) "editor: " + GraphQLRequestSerializer.getEntry(editor) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UserContentEditTO]
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(deletedAt, that.deletedAt) &&
        Objects.equals(deletedBy, that.deletedBy) &&
        Objects.equals(diff, that.diff) &&
        Objects.equals(editedAt, that.editedAt) &&
        Objects.equals(editor, that.editor) &&
        Objects.equals(id, that.id) &&
        Objects.equals(updatedAt, that.updatedAt)
    }

    override def hashCode(): Int = {
        Objects.hash(createdAt, deletedAt, deletedBy, diff, editedAt, editor, id, updatedAt)
    }
}

object UserContentEditTO {

    def builder(): UserContentEditTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var deletedAt: String = _
        private var deletedBy: ActorTO = _
        private var diff: String = _
        private var editedAt: String = _
        private var editor: ActorTO = _
        private var id: String = _
        private var updatedAt: String = _

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDeletedAt(deletedAt: String): Builder = {
            this.deletedAt = deletedAt
            this
        }

        def setDeletedBy(deletedBy: ActorTO): Builder = {
            this.deletedBy = deletedBy
            this
        }

        def setDiff(diff: String): Builder = {
            this.diff = diff
            this
        }

        def setEditedAt(editedAt: String): Builder = {
            this.editedAt = editedAt
            this
        }

        def setEditor(editor: ActorTO): Builder = {
            this.editor = editor
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def build(): UserContentEditTO = new UserContentEditTO(createdAt, deletedAt, deletedBy, diff, editedAt, editor, id, updatedAt)

    }
}
