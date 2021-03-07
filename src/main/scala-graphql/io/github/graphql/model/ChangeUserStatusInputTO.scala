package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
