package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UserStatusTO(
    val createdAt: String,
    val emoji: String?,
    val emojiHTML: String?,
    val expiresAt: String?,
    override
    val id: String,
    val indicatesLimitedAvailability: Boolean,
    val message: String?,
    val organization: OrganizationTO?,
    val updatedAt: String,
    val user: UserTO
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (emoji != null) {
            joiner.add("emoji: " + GraphQLRequestSerializer.getEntry(emoji))
        }
        if (emojiHTML != null) {
            joiner.add("emojiHTML: " + GraphQLRequestSerializer.getEntry(emojiHTML))
        }
        if (expiresAt != null) {
            joiner.add("expiresAt: " + GraphQLRequestSerializer.getEntry(expiresAt))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("indicatesLimitedAvailability: " + GraphQLRequestSerializer.getEntry(indicatesLimitedAvailability))
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message))
        }
        if (organization != null) {
            joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UserStatusTO
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(emoji, that.emoji)
                && Objects.equals(emojiHTML, that.emojiHTML)
                && Objects.equals(expiresAt, that.expiresAt)
                && Objects.equals(id, that.id)
                && Objects.equals(indicatesLimitedAvailability, that.indicatesLimitedAvailability)
                && Objects.equals(message, that.message)
                && Objects.equals(organization, that.organization)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(user, that.user)

    }

    override fun hashCode(): Int = {
        return Objects.hash(createdAt, emoji, emojiHTML, expiresAt, id, indicatesLimitedAvailability, message, organization, updatedAt, user)
    }

    class Builder {

        private lateinit var createdAt: String
        private var emoji: String? = null
        private var emojiHTML: String? = null
        private var expiresAt: String? = null
        private lateinit var id: String
        private var indicatesLimitedAvailability: Boolean = false
        private var message: String? = null
        private var organization: OrganizationTO? = null
        private lateinit var updatedAt: String
        private lateinit var user: UserTO

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setEmoji(emoji: String?): Builder {
            this.emoji = emoji
            return this
        }

        fun setEmojiHTML(emojiHTML: String?): Builder {
            this.emojiHTML = emojiHTML
            return this
        }

        fun setExpiresAt(expiresAt: String?): Builder {
            this.expiresAt = expiresAt
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIndicatesLimitedAvailability(indicatesLimitedAvailability: Boolean): Builder {
            this.indicatesLimitedAvailability = indicatesLimitedAvailability
            return this
        }

        fun setMessage(message: String?): Builder {
            this.message = message
            return this
        }

        fun setOrganization(organization: OrganizationTO?): Builder {
            this.organization = organization
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun setUser(user: UserTO): Builder {
            this.user = user
            return this
        }

        fun build(): UserStatusTO {
            return UserStatusTO(createdAt, emoji, emojiHTML, expiresAt, id, indicatesLimitedAvailability, message, organization, updatedAt, user)
        }
    }
}
