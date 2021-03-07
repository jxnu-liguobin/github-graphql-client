package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UnassignedEventTO(
    val actor: ActorTO?,
    val assignable: AssignableTO,
    val assignee: AssigneeTO?,
    val createdAt: String,
    override
    val id: String,
    @Deprecated(message = "Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.")
    val user: UserTO?
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
        joiner.add("assignable: " + GraphQLRequestSerializer.getEntry(assignable))
        if (assignee != null) {
            joiner.add("assignee: " + GraphQLRequestSerializer.getEntry(assignee))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        }
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var assignable: AssignableTO
        private var assignee: AssigneeTO? = null
        private lateinit var createdAt: String
        private lateinit var id: String
        private var user: UserTO? = null

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setAssignable(assignable: AssignableTO): Builder {
            this.assignable = assignable
            return this
        }

        fun setAssignee(assignee: AssigneeTO?): Builder {
            this.assignee = assignee
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

        @Deprecated(message = "Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.")
        fun setUser(user: UserTO?): Builder {
            this.user = user
            return this
        }

        fun build(): UnassignedEventTO {
            return UnassignedEventTO(actor, assignable, assignee, createdAt, id, user)
        }
    }
}
