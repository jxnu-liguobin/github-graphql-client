package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class StatusContextTO(
    val commit: CommitTO?,
    val context: String,
    val createdAt: String,
    val creator: ActorTO?,
    val description: String?,
    override
    val id: String,
    val state: StatusStateTO,
    val targetUrl: String?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        }
        joiner.add("context: " + GraphQLRequestSerializer.getEntry(context))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        if (targetUrl != null) {
            joiner.add("targetUrl: " + GraphQLRequestSerializer.getEntry(targetUrl))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as StatusContextTO
        return Objects.equals(commit, that.commit)
                && Objects.equals(context, that.context)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(creator, that.creator)
                && Objects.equals(description, that.description)
                && Objects.equals(id, that.id)
                && Objects.equals(state, that.state)
                && Objects.equals(targetUrl, that.targetUrl)

    }

    override fun hashCode(): Int = {
        return Objects.hash(commit, context, createdAt, creator, description, id, state, targetUrl)
    }

    class Builder {

        private var commit: CommitTO? = null
        private lateinit var context: String
        private lateinit var createdAt: String
        private var creator: ActorTO? = null
        private var description: String? = null
        private lateinit var id: String
        private lateinit var state: StatusStateTO
        private var targetUrl: String? = null

        fun setCommit(commit: CommitTO?): Builder {
            this.commit = commit
            return this
        }

        fun setContext(context: String): Builder {
            this.context = context
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

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setState(state: StatusStateTO): Builder {
            this.state = state
            return this
        }

        fun setTargetUrl(targetUrl: String?): Builder {
            this.targetUrl = targetUrl
            return this
        }

        fun build(): StatusContextTO {
            return StatusContextTO(commit, context, createdAt, creator, description, id, state, targetUrl)
        }
    }
}
