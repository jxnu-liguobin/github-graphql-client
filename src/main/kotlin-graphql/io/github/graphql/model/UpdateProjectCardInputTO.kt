package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateProjectCardInputTO(
    val clientMutationId: String?,
    val isArchived: Boolean?,
    val note: String?,
    val projectCardId: String
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
        if (isArchived != null) {
            joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived))
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note))
        }
        joiner.add("projectCardId: " + GraphQLRequestSerializer.getEntry(projectCardId))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var isArchived: Boolean? = null
        private var note: String? = null
        private lateinit var projectCardId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setIsArchived(isArchived: Boolean?): Builder {
            this.isArchived = isArchived
            return this
        }

        fun setNote(note: String?): Builder {
            this.note = note
            return this
        }

        fun setProjectCardId(projectCardId: String): Builder {
            this.projectCardId = projectCardId
            return this
        }

        fun build(): UpdateProjectCardInputTO {
            return UpdateProjectCardInputTO(clientMutationId, isArchived, note, projectCardId)
        }
    }
}
