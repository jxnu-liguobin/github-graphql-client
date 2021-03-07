package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CloneTemplateRepositoryPayloadTO(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CloneTemplateRepositoryPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(repository, that.repository)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, repository)
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

        fun build(): CloneTemplateRepositoryPayloadTO {
            return CloneTemplateRepositoryPayloadTO(clientMutationId, repository)
        }
    }
}
