package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UpdateRepositoryPayloadTO(
    val clientMutationId: String?,
    val repository: RepositoryTO?
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
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var repository: RepositoryTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setRepository(repository: RepositoryTO?): Builder {
            this.repository = repository
            return this
        }

        fun build(): UpdateRepositoryPayloadTO {
            return UpdateRepositoryPayloadTO(clientMutationId, repository)
        }
    }
}
