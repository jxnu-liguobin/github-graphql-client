package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReleaseTO(
    val author: UserTO?,
    val createdAt: String,
    val description: String?,
    override
    val id: String,
    val isDraft: Boolean,
    val isPrerelease: Boolean,
    val name: String?,
    val publishedAt: String?,
    override
    val resourcePath: String,
    val tag: RefTO?,
    val tagName: String,
    val updatedAt: String,
    override
    val url: String
) : UniformResourceLocatableTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isDraft: " + GraphQLRequestSerializer.getEntry(isDraft))
        joiner.add("isPrerelease: " + GraphQLRequestSerializer.getEntry(isPrerelease))
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (tag != null) {
            joiner.add("tag: " + GraphQLRequestSerializer.getEntry(tag))
        }
        joiner.add("tagName: " + GraphQLRequestSerializer.getEntry(tagName))
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
        val that = other as ReleaseTO
        return Objects.equals(author, that.author)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(description, that.description)
                && Objects.equals(id, that.id)
                && Objects.equals(isDraft, that.isDraft)
                && Objects.equals(isPrerelease, that.isPrerelease)
                && Objects.equals(name, that.name)
                && Objects.equals(publishedAt, that.publishedAt)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(tag, that.tag)
                && Objects.equals(tagName, that.tagName)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(author, createdAt, description, id, isDraft, isPrerelease, name, publishedAt, resourcePath, tag, tagName, updatedAt, url)
    }

    class Builder {

        private var author: UserTO? = null
        private lateinit var createdAt: String
        private var description: String? = null
        private lateinit var id: String
        private var isDraft: Boolean = false
        private var isPrerelease: Boolean = false
        private var name: String? = null
        private var publishedAt: String? = null
        private lateinit var resourcePath: String
        private var tag: RefTO? = null
        private lateinit var tagName: String
        private lateinit var updatedAt: String
        private lateinit var url: String

        fun setAuthor(author: UserTO?): Builder {
            this.author = author
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
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

        fun setIsDraft(isDraft: Boolean): Builder {
            this.isDraft = isDraft
            return this
        }

        fun setIsPrerelease(isPrerelease: Boolean): Builder {
            this.isPrerelease = isPrerelease
            return this
        }

        fun setName(name: String?): Builder {
            this.name = name
            return this
        }

        fun setPublishedAt(publishedAt: String?): Builder {
            this.publishedAt = publishedAt
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setTag(tag: RefTO?): Builder {
            this.tag = tag
            return this
        }

        fun setTagName(tagName: String): Builder {
            this.tagName = tagName
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

        fun build(): ReleaseTO {
            return ReleaseTO(author, createdAt, description, id, isDraft, isPrerelease, name, publishedAt, resourcePath, tag, tagName, updatedAt, url)
        }
    }
}
