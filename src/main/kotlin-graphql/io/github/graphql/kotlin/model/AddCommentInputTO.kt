package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class AddCommentInputTO(
    val body: String,
    val clientMutationId: String?,
    val subjectId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
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
        val that = other as AddCommentInputTO
        return Objects.equals(body, that.body)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(subjectId, that.subjectId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(body, clientMutationId, subjectId)
    }

    class Builder {

        private lateinit var body: String
        private var clientMutationId: String? = null
        private lateinit var subjectId: String

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setSubjectId(subjectId: String): Builder {
            this.subjectId = subjectId
            return this
        }

        fun build(): AddCommentInputTO {
            return AddCommentInputTO(body, clientMutationId, subjectId)
        }
    }
}
