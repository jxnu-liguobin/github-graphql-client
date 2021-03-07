package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class DeleteProjectColumnPayloadTO(
    val clientMutationId: String?,
    val deletedColumnId: String?,
    val project: ProjectTO?
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
        if (deletedColumnId != null) {
            joiner.add("deletedColumnId: " + GraphQLRequestSerializer.getEntry(deletedColumnId))
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var deletedColumnId: String? = null
        private var project: ProjectTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setDeletedColumnId(deletedColumnId: String?): Builder {
            this.deletedColumnId = deletedColumnId
            return this
        }

        fun setProject(project: ProjectTO?): Builder {
            this.project = project
            return this
        }

        fun build(): DeleteProjectColumnPayloadTO {
            return DeleteProjectColumnPayloadTO(clientMutationId, deletedColumnId, project)
        }
    }
}
