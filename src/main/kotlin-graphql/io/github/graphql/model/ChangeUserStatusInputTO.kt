package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ChangeUserStatusInputTO(
    val clientMutationId: String?,
    val emoji: String?,
    val expiresAt: String?,
    val limitedAvailability: Boolean? = false,
    val message: String?,
    val organizationId: String?
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
        if (emoji != null) {
            joiner.add("emoji: " + GraphQLRequestSerializer.getEntry(emoji))
        }
        if (expiresAt != null) {
            joiner.add("expiresAt: " + GraphQLRequestSerializer.getEntry(expiresAt))
        }
        if (limitedAvailability != null) {
            joiner.add("limitedAvailability: " + GraphQLRequestSerializer.getEntry(limitedAvailability))
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message))
        }
        if (organizationId != null) {
            joiner.add("organizationId: " + GraphQLRequestSerializer.getEntry(organizationId))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var emoji: String? = null
        private var expiresAt: String? = null
        private var limitedAvailability: Boolean? = false
        private var message: String? = null
        private var organizationId: String? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setEmoji(emoji: String?): Builder {
            this.emoji = emoji
            return this
        }

        fun setExpiresAt(expiresAt: String?): Builder {
            this.expiresAt = expiresAt
            return this
        }

        fun setLimitedAvailability(limitedAvailability: Boolean?): Builder {
            this.limitedAvailability = limitedAvailability
            return this
        }

        fun setMessage(message: String?): Builder {
            this.message = message
            return this
        }

        fun setOrganizationId(organizationId: String?): Builder {
            this.organizationId = organizationId
            return this
        }

        fun build(): ChangeUserStatusInputTO {
            return ChangeUserStatusInputTO(clientMutationId, emoji, expiresAt, limitedAvailability, message, organizationId)
        }
    }
}
