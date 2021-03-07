package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class AddReactionPayloadTO(
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

        fun build(): AddReactionPayloadTO {
            return AddReactionPayloadTO(clientMutationId, reaction, subject)
        }
    }
}
