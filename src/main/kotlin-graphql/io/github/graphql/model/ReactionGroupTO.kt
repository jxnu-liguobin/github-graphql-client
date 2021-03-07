package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ReactionGroupTO(
    val content: ReactionContentTO,
    val createdAt: String?,
    val subject: ReactableTO,
    val viewerHasReacted: Boolean
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("content: " + GraphQLRequestSerializer.getEntry(content))
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        }
        joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        joiner.add("viewerHasReacted: " + GraphQLRequestSerializer.getEntry(viewerHasReacted))
        return joiner.toString()
    }

    class Builder {

        private lateinit var content: ReactionContentTO
        private var createdAt: String? = null
        private lateinit var subject: ReactableTO
        private var viewerHasReacted: Boolean = false

        fun setContent(content: ReactionContentTO): Builder {
            this.content = content
            return this
        }

        fun setCreatedAt(createdAt: String?): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setSubject(subject: ReactableTO): Builder {
            this.subject = subject
            return this
        }

        fun setViewerHasReacted(viewerHasReacted: Boolean): Builder {
            this.viewerHasReacted = viewerHasReacted
            return this
        }

        fun build(): ReactionGroupTO {
            return ReactionGroupTO(content, createdAt, subject, viewerHasReacted)
        }
    }
}
