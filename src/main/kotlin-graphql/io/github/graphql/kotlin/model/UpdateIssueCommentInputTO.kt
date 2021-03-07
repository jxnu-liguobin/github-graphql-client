package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class UpdateIssueCommentInputTO(
    val body: String,
    val clientMutationId: String?,
    val id: String
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
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UpdateIssueCommentInputTO
        return Objects.equals(body, that.body)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(id, that.id)

    }

    override fun hashCode(): Int = {
        return Objects.hash(body, clientMutationId, id)
    }

    class Builder {

        private lateinit var body: String
        private var clientMutationId: String? = null
        private lateinit var id: String

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun build(): UpdateIssueCommentInputTO {
            return UpdateIssueCommentInputTO(body, clientMutationId, id)
        }
    }
}
