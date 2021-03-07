package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UpdateProjectColumnPayloadTO(
    val clientMutationId: String?,
    val projectColumn: ProjectColumnTO?
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
        if (projectColumn != null) {
            joiner.add("projectColumn: " + GraphQLRequestSerializer.getEntry(projectColumn))
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
        val that = other as UpdateProjectColumnPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(projectColumn, that.projectColumn)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, projectColumn)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var projectColumn: ProjectColumnTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setProjectColumn(projectColumn: ProjectColumnTO?): Builder {
            this.projectColumn = projectColumn
            return this
        }

        fun build(): UpdateProjectColumnPayloadTO {
            return UpdateProjectColumnPayloadTO(clientMutationId, projectColumn)
        }
    }
}
