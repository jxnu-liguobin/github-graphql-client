package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MilestoneTO(
    override
    val closed: Boolean,
    override
    val closedAt: String?,
    val createdAt: String,
    val creator: ActorTO?,
    val description: String?,
    val dueOn: String?,
    override
    val id: String,
    val issuePrioritiesDebug: String,
    val number: Int,
    val repository: RepositoryTO,
    override
    val resourcePath: String,
    val state: MilestoneStateTO,
    val title: String,
    val updatedAt: String,
    override
    val url: String
) : UniformResourceLocatableTO, ClosableTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("closed: " + GraphQLRequestSerializer.getEntry(closed))
        if (closedAt != null) {
            joiner.add("closedAt: " + GraphQLRequestSerializer.getEntry(closedAt))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (dueOn != null) {
            joiner.add("dueOn: " + GraphQLRequestSerializer.getEntry(dueOn))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("issuePrioritiesDebug: " + GraphQLRequestSerializer.getEntry(issuePrioritiesDebug))
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
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
        val that = other as MilestoneTO
        return Objects.equals(closed, that.closed)
                && Objects.equals(closedAt, that.closedAt)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(creator, that.creator)
                && Objects.equals(description, that.description)
                && Objects.equals(dueOn, that.dueOn)
                && Objects.equals(id, that.id)
                && Objects.equals(issuePrioritiesDebug, that.issuePrioritiesDebug)
                && Objects.equals(number, that.number)
                && Objects.equals(repository, that.repository)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(state, that.state)
                && Objects.equals(title, that.title)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(closed, closedAt, createdAt, creator, description, dueOn, id, issuePrioritiesDebug, number, repository, resourcePath, state, title, updatedAt, url)
    }

    class Builder {

        private var closed: Boolean = false
        private var closedAt: String? = null
        private lateinit var createdAt: String
        private var creator: ActorTO? = null
        private var description: String? = null
        private var dueOn: String? = null
        private lateinit var id: String
        private lateinit var issuePrioritiesDebug: String
        private var number: Int = 0
        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
        private lateinit var state: MilestoneStateTO
        private lateinit var title: String
        private lateinit var updatedAt: String
        private lateinit var url: String

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

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setDueOn(dueOn: String?): Builder {
            this.dueOn = dueOn
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIssuePrioritiesDebug(issuePrioritiesDebug: String): Builder {
            this.issuePrioritiesDebug = issuePrioritiesDebug
            return this
        }

        fun setNumber(number: Int): Builder {
            this.number = number
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

        fun setState(state: MilestoneStateTO): Builder {
            this.state = state
            return this
        }

        fun setTitle(title: String): Builder {
            this.title = title
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

        fun build(): MilestoneTO {
            return MilestoneTO(closed, closedAt, createdAt, creator, description, dueOn, id, issuePrioritiesDebug, number, repository, resourcePath, state, title, updatedAt, url)
        }
    }
}
