package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RemoveReactionPayloadTO(
    val clientMutationId: String?,
    val reaction: ReactionTO?,
    val subject: ReactableTO?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (reaction != null) {
            joiner.add("reaction: " + GraphQLRequestSerializer.getEntry(reaction))
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
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
        val that = other as RemoveReactionPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(reaction, that.reaction)
                && Objects.equals(subject, that.subject)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, reaction, subject)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var reaction: ReactionTO? = null
        private var subject: ReactableTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setReaction(reaction: ReactionTO?): Builder {
            this.reaction = reaction
            return this
        }

        fun setSubject(subject: ReactableTO?): Builder {
            this.subject = subject
            return this
        }

        fun build(): RemoveReactionPayloadTO {
            return RemoveReactionPayloadTO(clientMutationId, reaction, subject)
        }
    }
}
