package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LabeledEventTO(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as LabeledEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)
                && Objects.equals(label, that.label)
                && Objects.equals(labelable, that.labelable)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, createdAt, id, label, labelable)
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

        fun build(): LabeledEventTO {
            return LabeledEventTO(actor, createdAt, id, label, labelable)
        }
    }
}
