package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class MilestonedEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    override
    val id: String,
    val milestoneTitle: String,
    val subject: MilestoneItemTO
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
        joiner.add("milestoneTitle: " + GraphQLRequestSerializer.getEntry(milestoneTitle))
        joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private lateinit var id: String
        private lateinit var milestoneTitle: String
        private lateinit var subject: MilestoneItemTO

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

        fun setMilestoneTitle(milestoneTitle: String): Builder {
            this.milestoneTitle = milestoneTitle
            return this
        }

        fun setSubject(subject: MilestoneItemTO): Builder {
            this.subject = subject
            return this
        }

        fun build(): MilestonedEventTO {
            return MilestonedEventTO(actor, createdAt, id, milestoneTitle, subject)
        }
    }
}
