package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class AddReactionInputTO(
    val clientMutationId: String?,
    val content: ReactionContentTO,
    val subjectId: String
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
        joiner.add("content: " + GraphQLRequestSerializer.getEntry(content))
        joiner.add("subjectId: " + GraphQLRequestSerializer.getEntry(subjectId))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var content: ReactionContentTO
        private lateinit var subjectId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setContent(content: ReactionContentTO): Builder {
            this.content = content
            return this
        }

        fun setSubjectId(subjectId: String): Builder {
            this.subjectId = subjectId
            return this
        }

        fun build(): AddReactionInputTO {
            return AddReactionInputTO(clientMutationId, content, subjectId)
        }
    }
}
