package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
