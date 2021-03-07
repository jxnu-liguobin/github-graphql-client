package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UnlabeledEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    override
    val id: String,
    val label: LabelTO,
    val labelable: LabelableTO
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
        joiner.add("label: " + GraphQLRequestSerializer.getEntry(label))
        joiner.add("labelable: " + GraphQLRequestSerializer.getEntry(labelable))
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private lateinit var id: String
        private lateinit var label: LabelTO
        private lateinit var labelable: LabelableTO

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

        fun setLabel(label: LabelTO): Builder {
            this.label = label
            return this
        }

        fun setLabelable(labelable: LabelableTO): Builder {
            this.labelable = labelable
            return this
        }

        fun build(): UnlabeledEventTO {
            return UnlabeledEventTO(actor, createdAt, id, label, labelable)
        }
    }
}
