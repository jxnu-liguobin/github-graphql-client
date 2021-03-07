package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ProjectCardTO(
    val column: ProjectColumnTO?,
    val content: ProjectCardItemTO?,
    val createdAt: String,
    val creator: ActorTO?,
    val databaseId: Int?,
    override
    val id: String,
    val isArchived: Boolean,
    val note: String?,
    val project: ProjectTO,
    val resourcePath: String,
    val state: ProjectCardStateTO?,
    val updatedAt: String,
    val url: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (column != null) {
            joiner.add("column: " + GraphQLRequestSerializer.getEntry(column))
        }
        if (content != null) {
            joiner.add("content: " + GraphQLRequestSerializer.getEntry(content))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived))
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note))
        }
        joiner.add("project: " + GraphQLRequestSerializer.getEntry(project))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ProjectCardTO
        return Objects.equals(column, that.column)
                && Objects.equals(content, that.content)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(creator, that.creator)
                && Objects.equals(databaseId, that.databaseId)
                && Objects.equals(id, that.id)
                && Objects.equals(isArchived, that.isArchived)
                && Objects.equals(note, that.note)
                && Objects.equals(project, that.project)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(state, that.state)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(column, content, createdAt, creator, databaseId, id, isArchived, note, project, resourcePath, state, updatedAt, url)
    }

    class Builder {

        private var column: ProjectColumnTO? = null
        private var content: ProjectCardItemTO? = null
        private lateinit var createdAt: String
        private var creator: ActorTO? = null
        private var databaseId: Int? = null
        private lateinit var id: String
        private var isArchived: Boolean = false
        private var note: String? = null
        private lateinit var project: ProjectTO
        private lateinit var resourcePath: String
        private var state: ProjectCardStateTO? = null
        private lateinit var updatedAt: String
        private lateinit var url: String

        fun setColumn(column: ProjectColumnTO?): Builder {
            this.column = column
            return this
        }

        fun setContent(content: ProjectCardItemTO?): Builder {
            this.content = content
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setCreator(creator: ActorTO?): Builder {
            this.creator = creator
            return this
        }

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsArchived(isArchived: Boolean): Builder {
            this.isArchived = isArchived
            return this
        }

        fun setNote(note: String?): Builder {
            this.note = note
            return this
        }

        fun setProject(project: ProjectTO): Builder {
            this.project = project
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setState(state: ProjectCardStateTO?): Builder {
            this.state = state
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): ProjectCardTO {
            return ProjectCardTO(column, content, createdAt, creator, databaseId, id, isArchived, note, project, resourcePath, state, updatedAt, url)
        }
    }
}
