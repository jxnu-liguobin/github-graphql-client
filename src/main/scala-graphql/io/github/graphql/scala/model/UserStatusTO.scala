package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UserStatusTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    emoji: String,
    emojiHTML: String,
    expiresAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    indicatesLimitedAvailability: Boolean,
    message: String,
    organization: OrganizationTO,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    user: UserTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (emoji != null) "emoji: " + GraphQLRequestSerializer.getEntry(emoji) else "",
            if (emojiHTML != null) "emojiHTML: " + GraphQLRequestSerializer.getEntry(emojiHTML) else "",
            if (expiresAt != null) "expiresAt: " + GraphQLRequestSerializer.getEntry(expiresAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "indicatesLimitedAvailability: " + GraphQLRequestSerializer.getEntry(indicatesLimitedAvailability),
            if (message != null) "message: " + GraphQLRequestSerializer.getEntry(message) else "",
            if (organization != null) "organization: " + GraphQLRequestSerializer.getEntry(organization) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UserStatusTO]
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(emoji, that.emoji) &&
        Objects.equals(emojiHTML, that.emojiHTML) &&
        Objects.equals(expiresAt, that.expiresAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(indicatesLimitedAvailability, that.indicatesLimitedAvailability) &&
        Objects.equals(message, that.message) &&
        Objects.equals(organization, that.organization) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(user, that.user)
    }

    override def hashCode(): Int = {
        Objects.hash(createdAt, emoji, emojiHTML, expiresAt, id, indicatesLimitedAvailability, message, organization, updatedAt, user)
    }
}

object UserStatusTO {

    def builder(): UserStatusTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var emoji: String = _
        private var emojiHTML: String = _
        private var expiresAt: String = _
        private var id: String = _
        private var indicatesLimitedAvailability: Boolean = _
        private var message: String = _
        private var organization: OrganizationTO = _
        private var updatedAt: String = _
        private var user: UserTO = _

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setEmoji(emoji: String): Builder = {
            this.emoji = emoji
            this
        }

        def setEmojiHTML(emojiHTML: String): Builder = {
            this.emojiHTML = emojiHTML
            this
        }

        def setExpiresAt(expiresAt: String): Builder = {
            this.expiresAt = expiresAt
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIndicatesLimitedAvailability(indicatesLimitedAvailability: Boolean): Builder = {
            this.indicatesLimitedAvailability = indicatesLimitedAvailability
            this
        }

        def setMessage(message: String): Builder = {
            this.message = message
            this
        }

        def setOrganization(organization: OrganizationTO): Builder = {
            this.organization = organization
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setUser(user: UserTO): Builder = {
            this.user = user
            this
        }

        def build(): UserStatusTO = new UserStatusTO(createdAt, emoji, emojiHTML, expiresAt, id, indicatesLimitedAvailability, message, organization, updatedAt, user)

    }
}
