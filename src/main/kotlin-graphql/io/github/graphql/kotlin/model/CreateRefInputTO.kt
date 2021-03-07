package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class CreateRefInputTO(
    val clientMutationId: String?,
    val name: String,
    val oid: String,
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
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
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
        val that = other as CreateRefInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(name, that.name)
                && Objects.equals(oid, that.oid)
                && Objects.equals(repositoryId, that.repositoryId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, name, oid, repositoryId)
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var name: String
        private lateinit var oid: String
        private lateinit var repositoryId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setOid(oid: String): Builder {
            this.oid = oid
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun build(): CreateRefInputTO {
            return CreateRefInputTO(clientMutationId, name, oid, repositoryId)
        }
    }
}
