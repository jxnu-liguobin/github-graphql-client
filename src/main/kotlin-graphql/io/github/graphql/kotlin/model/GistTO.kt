package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class GistTO(
    val createdAt: String,
    val description: String?,
    override
    val id: String,
    val isFork: Boolean,
    val isPublic: Boolean,
    val name: String,
    val owner: RepositoryOwnerTO?,
    val pushedAt: String?,
    override
    val resourcePath: String,
    val updatedAt: String,
    override
    val url: String,
    override
    val viewerHasStarred: Boolean
) : PinnableItemTO, StarrableTO, UniformResourceLocatableTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isFork: " + GraphQLRequestSerializer.getEntry(isFork))
        joiner.add("isPublic: " + GraphQLRequestSerializer.getEntry(isPublic))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner))
        }
        if (pushedAt != null) {
            joiner.add("pushedAt: " + GraphQLRequestSerializer.getEntry(pushedAt))
        }
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as GistTO
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(description, that.description)
                && Objects.equals(id, that.id)
                && Objects.equals(isFork, that.isFork)
                && Objects.equals(isPublic, that.isPublic)
                && Objects.equals(name, that.name)
                && Objects.equals(owner, that.owner)
                && Objects.equals(pushedAt, that.pushedAt)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)
                && Objects.equals(viewerHasStarred, that.viewerHasStarred)

    }

    override fun hashCode(): Int = {
        return Objects.hash(createdAt, description, id, isFork, isPublic, name, owner, pushedAt, resourcePath, updatedAt, url, viewerHasStarred)
    }

    class Builder {

        private lateinit var createdAt: String
        private var description: String? = null
        private lateinit var id: String
        private var isFork: Boolean = false
        private var isPublic: Boolean = false
        private lateinit var name: String
        private var owner: RepositoryOwnerTO? = null
        private var pushedAt: String? = null
        private lateinit var resourcePath: String
        private lateinit var updatedAt: String
        private lateinit var url: String
        private var viewerHasStarred: Boolean = false

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

        fun setIsFork(isFork: Boolean): Builder {
            this.isFork = isFork
            return this
        }

        fun setIsPublic(isPublic: Boolean): Builder {
            this.isPublic = isPublic
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setOwner(owner: RepositoryOwnerTO?): Builder {
            this.owner = owner
            return this
        }

        fun setPushedAt(pushedAt: String?): Builder {
            this.pushedAt = pushedAt
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

        fun setViewerHasStarred(viewerHasStarred: Boolean): Builder {
            this.viewerHasStarred = viewerHasStarred
            return this
        }

        fun build(): GistTO {
            return GistTO(createdAt, description, id, isFork, isPublic, name, owner, pushedAt, resourcePath, updatedAt, url, viewerHasStarred)
        }
    }
}
