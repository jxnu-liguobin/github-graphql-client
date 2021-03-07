package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
