package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
