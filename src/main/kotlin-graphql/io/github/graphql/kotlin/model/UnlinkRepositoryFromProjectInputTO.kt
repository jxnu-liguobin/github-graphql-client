package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class UnlinkRepositoryFromProjectInputTO(
    val clientMutationId: String?,
    val projectId: String,
    val repositoryId: String
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
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UnlinkRepositoryFromProjectInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(projectId, that.projectId)
                && Objects.equals(repositoryId, that.repositoryId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, projectId, repositoryId)
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var projectId: String
        private lateinit var repositoryId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setProjectId(projectId: String): Builder {
            this.projectId = projectId
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun build(): UnlinkRepositoryFromProjectInputTO {
            return UnlinkRepositoryFromProjectInputTO(clientMutationId, projectId, repositoryId)
        }
    }
}
