package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class MoveProjectCardPayloadTO(
    val cardEdge: ProjectCardEdgeTO?,
    val clientMutationId: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (cardEdge != null) {
            joiner.add("cardEdge: " + GraphQLRequestSerializer.getEntry(cardEdge))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        return joiner.toString()
    }

    class Builder {

        private var cardEdge: ProjectCardEdgeTO? = null
        private var clientMutationId: String? = null

        fun setCardEdge(cardEdge: ProjectCardEdgeTO?): Builder {
            this.cardEdge = cardEdge
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun build(): MoveProjectCardPayloadTO {
            return MoveProjectCardPayloadTO(cardEdge, clientMutationId)
        }
    }
}
