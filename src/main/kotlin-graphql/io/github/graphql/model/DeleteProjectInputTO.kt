package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class DeleteProjectInputTO(
    val clientMutationId: String?,
    val projectId: String
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
        joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var projectId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setProjectId(projectId: String): Builder {
            this.projectId = projectId
            return this
        }

        fun build(): DeleteProjectInputTO {
            return DeleteProjectInputTO(clientMutationId, projectId)
        }
    }
}
