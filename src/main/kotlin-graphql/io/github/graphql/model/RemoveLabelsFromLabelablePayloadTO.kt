package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RemoveLabelsFromLabelablePayloadTO(
    val clientMutationId: String?,
    val labelable: LabelableTO?
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
        if (labelable != null) {
            joiner.add("labelable: " + GraphQLRequestSerializer.getEntry(labelable))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var labelable: LabelableTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setLabelable(labelable: LabelableTO?): Builder {
            this.labelable = labelable
            return this
        }

        fun build(): RemoveLabelsFromLabelablePayloadTO {
            return RemoveLabelsFromLabelablePayloadTO(clientMutationId, labelable)
        }
    }
}
