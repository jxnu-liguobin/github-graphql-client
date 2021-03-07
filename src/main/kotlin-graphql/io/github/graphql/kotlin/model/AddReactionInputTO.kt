package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AddReactionInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(content, that.content)
                && Objects.equals(subjectId, that.subjectId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, content, subjectId)
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
