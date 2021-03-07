package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateTopicsInputTO(
    val clientMutationId: String?,
    val repositoryId: String,
    val topicNames: List<String>
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
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        joiner.add("topicNames: " + GraphQLRequestSerializer.getEntry(topicNames))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var repositoryId: String
        private lateinit var topicNames: List<String>

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun setTopicNames(topicNames: List<String>): Builder {
            this.topicNames = topicNames
            return this
        }

        fun build(): UpdateTopicsInputTO {
            return UpdateTopicsInputTO(clientMutationId, repositoryId, topicNames)
        }
    }
}
