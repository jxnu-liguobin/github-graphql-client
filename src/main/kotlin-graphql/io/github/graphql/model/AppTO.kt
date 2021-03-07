package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class AppTO(
    val createdAt: String,
    val databaseId: Int?,
    val description: String?,
    override
    val id: String,
    val logoBackgroundColor: String,
    val name: String,
    val slug: String,
    val updatedAt: String,
    val url: String
) : SearchResultItemTO, NodeTO {

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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("logoBackgroundColor: " + GraphQLRequestSerializer.getEntry(logoBackgroundColor))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }

    class Builder {

        private lateinit var createdAt: String
        private var databaseId: Int? = null
        private var description: String? = null
        private lateinit var id: String
        private lateinit var logoBackgroundColor: String
        private lateinit var name: String
        private lateinit var slug: String
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

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setLogoBackgroundColor(logoBackgroundColor: String): Builder {
            this.logoBackgroundColor = logoBackgroundColor
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setSlug(slug: String): Builder {
            this.slug = slug
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

        fun build(): AppTO {
            return AppTO(createdAt, databaseId, description, id, logoBackgroundColor, name, slug, updatedAt, url)
        }
    }
}
