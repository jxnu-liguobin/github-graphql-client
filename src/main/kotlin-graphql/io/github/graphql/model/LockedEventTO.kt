package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class LockedEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    override
    val id: String,
    val lockReason: LockReasonTO?,
    val lockable: LockableTO
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
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (lockReason != null) {
            joiner.add("lockReason: " + GraphQLRequestSerializer.getEntry(lockReason))
        }
        joiner.add("lockable: " + GraphQLRequestSerializer.getEntry(lockable))
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private lateinit var id: String
        private var lockReason: LockReasonTO? = null
        private lateinit var lockable: LockableTO

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
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

        fun setLockReason(lockReason: LockReasonTO?): Builder {
            this.lockReason = lockReason
            return this
        }

        fun setLockable(lockable: LockableTO): Builder {
            this.lockable = lockable
            return this
        }

        fun build(): LockedEventTO {
            return LockedEventTO(actor, createdAt, id, lockReason, lockable)
        }
    }
}
