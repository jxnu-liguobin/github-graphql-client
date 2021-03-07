package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeleteProjectColumnPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(deletedColumnId, that.deletedColumnId)
                && Objects.equals(project, that.project)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, deletedColumnId, project)
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
