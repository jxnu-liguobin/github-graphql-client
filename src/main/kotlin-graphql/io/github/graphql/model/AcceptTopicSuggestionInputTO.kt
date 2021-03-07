package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class AcceptTopicSuggestionInputTO(
    val clientMutationId: String?,
    val name: String,
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
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var name: String
        private lateinit var repositoryId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun build(): AcceptTopicSuggestionInputTO {
            return AcceptTopicSuggestionInputTO(clientMutationId, name, repositoryId)
        }
    }
}