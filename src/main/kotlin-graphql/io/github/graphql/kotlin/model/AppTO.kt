package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AppTO
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(databaseId, that.databaseId)
                && Objects.equals(description, that.description)
                && Objects.equals(id, that.id)
                && Objects.equals(logoBackgroundColor, that.logoBackgroundColor)
                && Objects.equals(name, that.name)
                && Objects.equals(slug, that.slug)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(createdAt, databaseId, description, id, logoBackgroundColor, name, slug, updatedAt, url)
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
