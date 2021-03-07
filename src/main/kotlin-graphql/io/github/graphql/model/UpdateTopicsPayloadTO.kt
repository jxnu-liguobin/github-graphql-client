package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateTopicsPayloadTO(
    val clientMutationId: String?,
    val invalidTopicNames: List<String>?,
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
        if (invalidTopicNames != null) {
            joiner.add("invalidTopicNames: " + GraphQLRequestSerializer.getEntry(invalidTopicNames))
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var invalidTopicNames: List<String>? = null
        private var repository: RepositoryTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setInvalidTopicNames(invalidTopicNames: List<String>?): Builder {
            this.invalidTopicNames = invalidTopicNames
            return this
        }

        fun setRepository(repository: RepositoryTO?): Builder {
            this.repository = repository
            return this
        }

        fun build(): UpdateTopicsPayloadTO {
            return UpdateTopicsPayloadTO(clientMutationId, invalidTopicNames, repository)
        }
    }
}
