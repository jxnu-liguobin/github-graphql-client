package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RenamedTitleEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    val currentTitle: String,
    override
    val id: String,
    val previousTitle: String,
    val subject: RenamedTitleSubjectTO
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
        joiner.add("currentTitle: " + GraphQLRequestSerializer.getEntry(currentTitle))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("previousTitle: " + GraphQLRequestSerializer.getEntry(previousTitle))
        joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private lateinit var currentTitle: String
        private lateinit var id: String
        private lateinit var previousTitle: String
        private lateinit var subject: RenamedTitleSubjectTO

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setCurrentTitle(currentTitle: String): Builder {
            this.currentTitle = currentTitle
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setPreviousTitle(previousTitle: String): Builder {
            this.previousTitle = previousTitle
            return this
        }

        fun setSubject(subject: RenamedTitleSubjectTO): Builder {
            this.subject = subject
            return this
        }

        fun build(): RenamedTitleEventTO {
            return RenamedTitleEventTO(actor, createdAt, currentTitle, id, previousTitle, subject)
        }
    }
}
