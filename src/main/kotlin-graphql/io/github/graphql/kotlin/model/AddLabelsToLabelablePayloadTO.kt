package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AddLabelsToLabelablePayloadTO(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AddLabelsToLabelablePayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(labelable, that.labelable)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, labelable)
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

        fun build(): AddLabelsToLabelablePayloadTO {
            return AddLabelsToLabelablePayloadTO(clientMutationId, labelable)
        }
    }
}
