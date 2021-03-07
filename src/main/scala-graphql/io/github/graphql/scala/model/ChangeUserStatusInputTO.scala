package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class ChangeUserStatusInputTO(
    clientMutationId: String,
    emoji: String,
    expiresAt: String,
    limitedAvailability: Option[Boolean] = Some(false),
    message: String,
    organizationId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (emoji != null) "emoji: " + GraphQLRequestSerializer.getEntry(emoji) else "",
            if (expiresAt != null) "expiresAt: " + GraphQLRequestSerializer.getEntry(expiresAt) else "",
            if (limitedAvailability.isDefined) "limitedAvailability: " + GraphQLRequestSerializer.getEntry(limitedAvailability.get) else "",
            if (message != null) "message: " + GraphQLRequestSerializer.getEntry(message) else "",
            if (organizationId != null) "organizationId: " + GraphQLRequestSerializer.getEntry(organizationId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ChangeUserStatusInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(emoji, that.emoji) &&
        Objects.equals(expiresAt, that.expiresAt) &&
        Objects.equals(limitedAvailability, that.limitedAvailability) &&
        Objects.equals(message, that.message) &&
        Objects.equals(organizationId, that.organizationId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, emoji, expiresAt, limitedAvailability, message, organizationId)
    }
}

object ChangeUserStatusInputTO {

    def builder(): ChangeUserStatusInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var emoji: String = _
        private var expiresAt: String = _
        private var limitedAvailability: Option[Boolean] = Some(false)
        private var message: String = _
        private var organizationId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setEmoji(emoji: String): Builder = {
            this.emoji = emoji
            this
        }

        def setExpiresAt(expiresAt: String): Builder = {
            this.expiresAt = expiresAt
            this
        }

        def setLimitedAvailability(limitedAvailability: Option[Boolean]): Builder = {
            this.limitedAvailability = limitedAvailability
            this
        }

        def setMessage(message: String): Builder = {
            this.message = message
            this
        }

        def setOrganizationId(organizationId: String): Builder = {
            this.organizationId = organizationId
            this
        }

        def build(): ChangeUserStatusInputTO = new ChangeUserStatusInputTO(clientMutationId, emoji, expiresAt, limitedAvailability, message, organizationId)

    }
}
