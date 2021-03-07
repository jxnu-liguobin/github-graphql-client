package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LabelTO(
    val color: String,
    val createdAt: String?,
    val description: String?,
    override
    val id: String,
    val isDefault: Boolean,
    val name: String,
    val repository: RepositoryTO,
    val resourcePath: String,
    val updatedAt: String?,
    val url: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("color: " + GraphQLRequestSerializer.getEntry(color))
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isDefault: " + GraphQLRequestSerializer.getEntry(isDefault))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        }
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
        val that = other as LabelTO
        return Objects.equals(color, that.color)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(description, that.description)
                && Objects.equals(id, that.id)
                && Objects.equals(isDefault, that.isDefault)
                && Objects.equals(name, that.name)
                && Objects.equals(repository, that.repository)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(color, createdAt, description, id, isDefault, name, repository, resourcePath, updatedAt, url)
    }

    class Builder {

        private lateinit var color: String
        private var createdAt: String? = null
        private var description: String? = null
        private lateinit var id: String
        private var isDefault: Boolean = false
        private lateinit var name: String
        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
        private var updatedAt: String? = null
        private lateinit var url: String

        fun setColor(color: String): Builder {
            this.color = color
            return this
        }

        fun setCreatedAt(createdAt: String?): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsDefault(isDefault: Boolean): Builder {
            this.isDefault = isDefault
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setUpdatedAt(updatedAt: String?): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): LabelTO {
            return LabelTO(color, createdAt, description, id, isDefault, name, repository, resourcePath, updatedAt, url)
        }
    }
}
