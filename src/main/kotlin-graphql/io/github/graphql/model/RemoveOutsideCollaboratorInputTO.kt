package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
