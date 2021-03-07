package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
