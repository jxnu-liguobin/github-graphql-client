package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreateRefPayloadTO(
    val clientMutationId: String?,
    val ref: RefTO?
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
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var ref: RefTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setRef(ref: RefTO?): Builder {
            this.ref = ref
            return this
        }

        fun build(): CreateRefPayloadTO {
            return CreateRefPayloadTO(clientMutationId, ref)
        }
    }
}
