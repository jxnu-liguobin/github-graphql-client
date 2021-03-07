package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RemoveStarPayloadTO(
    val clientMutationId: String?,
    val starrable: StarrableTO?
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
        if (starrable != null) {
            joiner.add("starrable: " + GraphQLRequestSerializer.getEntry(starrable))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var starrable: StarrableTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setStarrable(starrable: StarrableTO?): Builder {
            this.starrable = starrable
            return this
        }

        fun build(): RemoveStarPayloadTO {
            return RemoveStarPayloadTO(clientMutationId, starrable)
        }
    }
}
