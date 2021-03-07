package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UpdateTopicsInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(repositoryId, that.repositoryId)
                && Objects.equals(topicNames, that.topicNames)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, repositoryId, topicNames)
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
