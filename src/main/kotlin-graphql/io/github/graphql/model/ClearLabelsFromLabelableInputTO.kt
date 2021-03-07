package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ClearLabelsFromLabelableInputTO(
    val clientMutationId: String?,
    val labelableId: String
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
        joiner.add("labelableId: " + GraphQLRequestSerializer.getEntry(labelableId))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var labelableId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setLabelableId(labelableId: String): Builder {
            this.labelableId = labelableId
            return this
        }

        fun build(): ClearLabelsFromLabelableInputTO {
            return ClearLabelsFromLabelableInputTO(clientMutationId, labelableId)
        }
    }
}
