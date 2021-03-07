package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeleteProjectInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(projectId, that.projectId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, projectId)
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
