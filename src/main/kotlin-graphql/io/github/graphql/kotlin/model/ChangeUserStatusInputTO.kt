package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ChangeUserStatusInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(emoji, that.emoji)
                && Objects.equals(expiresAt, that.expiresAt)
                && Objects.equals(limitedAvailability, that.limitedAvailability)
                && Objects.equals(message, that.message)
                && Objects.equals(organizationId, that.organizationId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, emoji, expiresAt, limitedAvailability, message, organizationId)
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
