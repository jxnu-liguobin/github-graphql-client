package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UserBlockedEventTO(
    val actor: ActorTO?,
    val blockDuration: UserBlockDurationTO,
    val createdAt: String,
    override
    val id: String,
    val subject: UserTO?
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
        joiner.add("blockDuration: " + GraphQLRequestSerializer.getEntry(blockDuration))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        }
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var blockDuration: UserBlockDurationTO
        private lateinit var createdAt: String
        private lateinit var id: String
        private var subject: UserTO? = null

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setBlockDuration(blockDuration: UserBlockDurationTO): Builder {
            this.blockDuration = blockDuration
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

        fun setSubject(subject: UserTO?): Builder {
            this.subject = subject
            return this
        }

        fun build(): UserBlockedEventTO {
            return UserBlockedEventTO(actor, blockDuration, createdAt, id, subject)
        }
    }
}
