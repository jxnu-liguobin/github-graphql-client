package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class RemoveOutsideCollaboratorInputTO(
    val clientMutationId: String?,
    val organizationId: String,
    val userId: String
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
        joiner.add("organizationId: " + GraphQLRequestSerializer.getEntry(organizationId))
        joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RemoveOutsideCollaboratorInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(organizationId, that.organizationId)
                && Objects.equals(userId, that.userId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, organizationId, userId)
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var organizationId: String
        private lateinit var userId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setOrganizationId(organizationId: String): Builder {
            this.organizationId = organizationId
            return this
        }

        fun setUserId(userId: String): Builder {
            this.userId = userId
            return this
        }

        fun build(): RemoveOutsideCollaboratorInputTO {
            return RemoveOutsideCollaboratorInputTO(clientMutationId, organizationId, userId)
        }
    }
}
