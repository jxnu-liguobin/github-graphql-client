package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ProjectColumnTO(
    val createdAt: String,
    val databaseId: Int?,
    override
    val id: String,
    val name: String,
    val project: ProjectTO,
    val purpose: ProjectColumnPurposeTO?,
    val resourcePath: String,
    val updatedAt: String,
    val url: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("project: " + GraphQLRequestSerializer.getEntry(project))
        if (purpose != null) {
            joiner.add("purpose: " + GraphQLRequestSerializer.getEntry(purpose))
        }
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
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
        val that = other as ProjectColumnTO
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(databaseId, that.databaseId)
                && Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(project, that.project)
                && Objects.equals(purpose, that.purpose)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(createdAt, databaseId, id, name, project, purpose, resourcePath, updatedAt, url)
    }

    class Builder {

        private lateinit var createdAt: String
        private var databaseId: Int? = null
        private lateinit var id: String
        private lateinit var name: String
        private lateinit var project: ProjectTO
        private var purpose: ProjectColumnPurposeTO? = null
        private lateinit var resourcePath: String
        private lateinit var updatedAt: String
        private lateinit var url: String

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
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

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setProject(project: ProjectTO): Builder {
            this.project = project
            return this
        }

        fun setPurpose(purpose: ProjectColumnPurposeTO?): Builder {
            this.purpose = purpose
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
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

        fun build(): ProjectColumnTO {
            return ProjectColumnTO(createdAt, databaseId, id, name, project, purpose, resourcePath, updatedAt, url)
        }
    }
}
