package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class DeleteProjectPayloadTO(
    val clientMutationId: String?,
    val owner: ProjectOwnerTO?
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
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner))
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
        val that = other as DeleteProjectPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(owner, that.owner)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, owner)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var owner: ProjectOwnerTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setOwner(owner: ProjectOwnerTO?): Builder {
            this.owner = owner
            return this
        }

        fun build(): DeleteProjectPayloadTO {
            return DeleteProjectPayloadTO(clientMutationId, owner)
        }
    }
}
