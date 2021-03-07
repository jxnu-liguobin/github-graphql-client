package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReopenedEventTO(
    val actor: ActorTO?,
    val closable: ClosableTO,
    val createdAt: String,
    override
    val id: String
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("closable: " + GraphQLRequestSerializer.getEntry(closable))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ReopenedEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(closable, that.closable)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, closable, createdAt, id)
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var closable: ClosableTO
        private lateinit var createdAt: String
        private lateinit var id: String

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setClosable(closable: ClosableTO): Builder {
            this.closable = closable
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun build(): ReopenedEventTO {
            return ReopenedEventTO(actor, closable, createdAt, id)
        }
    }
}
