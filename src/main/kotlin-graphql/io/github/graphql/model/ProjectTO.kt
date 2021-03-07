package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ProjectTO(
    val body: String?,
    val bodyHTML: String,
    override
    val closed: Boolean,
    override
    val closedAt: String?,
    val createdAt: String,
    val creator: ActorTO?,
    val databaseId: Int?,
    override
    val id: String,
    val name: String,
    val number: Int,
    val owner: ProjectOwnerTO,
    val resourcePath: String,
    val state: ProjectStateTO,
    val updatedAt: String,
    val url: String,
    override
    val viewerCanUpdate: Boolean
) : ClosableTO, NodeTO, UpdatableTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML))
        joiner.add("closed: " + GraphQLRequestSerializer.getEntry(closed))
        if (closedAt != null) {
            joiner.add("closedAt: " + GraphQLRequestSerializer.getEntry(closedAt))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number))
        joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate))
        return joiner.toString()
    }

    class Builder {

        private var body: String? = null
        private lateinit var bodyHTML: String
        private var closed: Boolean = false
        private var closedAt: String? = null
        private lateinit var createdAt: String
        private var creator: ActorTO? = null
        private var databaseId: Int? = null
        private lateinit var id: String
        private lateinit var name: String
        private var number: Int = 0
        private lateinit var owner: ProjectOwnerTO
        private lateinit var resourcePath: String
        private lateinit var state: ProjectStateTO
        private lateinit var updatedAt: String
        private lateinit var url: String
        private var viewerCanUpdate: Boolean = false

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setBodyHTML(bodyHTML: String): Builder {
            this.bodyHTML = bodyHTML
            return this
        }

        fun setClosed(closed: Boolean): Builder {
            this.closed = closed
            return this
        }

        fun setClosedAt(closedAt: String?): Builder {
            this.closedAt = closedAt
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

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setNumber(number: Int): Builder {
            this.number = number
            return this
        }

        fun setOwner(owner: ProjectOwnerTO): Builder {
            this.owner = owner
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setState(state: ProjectStateTO): Builder {
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

        fun setViewerCanUpdate(viewerCanUpdate: Boolean): Builder {
            this.viewerCanUpdate = viewerCanUpdate
            return this
        }

        fun build(): ProjectTO {
            return ProjectTO(body, bodyHTML, closed, closedAt, createdAt, creator, databaseId, id, name, number, owner, resourcePath, state, updatedAt, url, viewerCanUpdate)
        }
    }
}
