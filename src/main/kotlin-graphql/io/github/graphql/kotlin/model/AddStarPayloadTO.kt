package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AddStarPayloadTO(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AddStarPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(starrable, that.starrable)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, starrable)
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

        fun build(): AddStarPayloadTO {
            return AddStarPayloadTO(clientMutationId, starrable)
        }
    }
}
