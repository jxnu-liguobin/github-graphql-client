package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class AddProjectCardInputTO(
    val clientMutationId: String?,
    val contentId: String?,
    val note: String?,
    val projectColumnId: String
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
        if (contentId != null) {
            joiner.add("contentId: " + GraphQLRequestSerializer.getEntry(contentId))
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note))
        }
        joiner.add("projectColumnId: " + GraphQLRequestSerializer.getEntry(projectColumnId))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AddProjectCardInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(contentId, that.contentId)
                && Objects.equals(note, that.note)
                && Objects.equals(projectColumnId, that.projectColumnId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, contentId, note, projectColumnId)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var contentId: String? = null
        private var note: String? = null
        private lateinit var projectColumnId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setContentId(contentId: String?): Builder {
            this.contentId = contentId
            return this
        }

        fun setNote(note: String?): Builder {
            this.note = note
            return this
        }

        fun setProjectColumnId(projectColumnId: String): Builder {
            this.projectColumnId = projectColumnId
            return this
        }

        fun build(): AddProjectCardInputTO {
            return AddProjectCardInputTO(clientMutationId, contentId, note, projectColumnId)
        }
    }
}
