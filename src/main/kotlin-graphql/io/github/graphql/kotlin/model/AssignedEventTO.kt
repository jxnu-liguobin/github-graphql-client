package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AssignedEventTO(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AssignedEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(assignable, that.assignable)
                && Objects.equals(assignee, that.assignee)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)
                && Objects.equals(user, that.user)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, assignable, assignee, createdAt, id, user)
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

        fun build(): AssignedEventTO {
            return AssignedEventTO(actor, assignable, assignee, createdAt, id, user)
        }
    }
}
