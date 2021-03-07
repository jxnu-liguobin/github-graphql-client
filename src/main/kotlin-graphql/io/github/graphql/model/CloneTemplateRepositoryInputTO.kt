package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CloneTemplateRepositoryInputTO(
    val clientMutationId: String?,
    val description: String?,
    val name: String,
    val ownerId: String,
    val repositoryId: String,
    val visibility: RepositoryVisibilityTO
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId))
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        joiner.add("visibility: " + GraphQLRequestSerializer.getEntry(visibility))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var description: String? = null
        private lateinit var name: String
        private lateinit var ownerId: String
        private lateinit var repositoryId: String
        private lateinit var visibility: RepositoryVisibilityTO

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setOwnerId(ownerId: String): Builder {
            this.ownerId = ownerId
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun setVisibility(visibility: RepositoryVisibilityTO): Builder {
            this.visibility = visibility
            return this
        }

        fun build(): CloneTemplateRepositoryInputTO {
            return CloneTemplateRepositoryInputTO(clientMutationId, description, name, ownerId, repositoryId, visibility)
        }
    }
}
