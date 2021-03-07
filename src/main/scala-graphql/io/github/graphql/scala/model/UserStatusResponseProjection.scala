package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UserStatus
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UserStatusResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserStatusResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserStatusResponseProjection = {
        this.createdAt()
        this.emoji()
        this.emojiHTML()
        this.expiresAt()
        this.id()
        this.indicatesLimitedAvailability()
        this.message()
        if (projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.OrganizationResponseProjection.organization", 0) + 1)
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def createdAt(): UserStatusResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def emoji(): UserStatusResponseProjection = {
        emoji(null.asInstanceOf[String])
    }

    def emoji(alias: String): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("emoji").alias(alias))
        this
    }

    def emojiHTML(): UserStatusResponseProjection = {
        emojiHTML(null.asInstanceOf[String])
    }

    def emojiHTML(alias: String): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("emojiHTML").alias(alias))
        this
    }

    def expiresAt(): UserStatusResponseProjection = {
        expiresAt(null.asInstanceOf[String])
    }

    def expiresAt(alias: String): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("expiresAt").alias(alias))
        this
    }

    def id(): UserStatusResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def indicatesLimitedAvailability(): UserStatusResponseProjection = {
        indicatesLimitedAvailability(null.asInstanceOf[String])
    }

    def indicatesLimitedAvailability(alias: String): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("indicatesLimitedAvailability").alias(alias))
        this
    }

    def message(): UserStatusResponseProjection = {
        message(null.asInstanceOf[String])
    }

    def message(alias: String): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("message").alias(alias))
        this
    }

    def organization(subProjection: OrganizationResponseProjection): UserStatusResponseProjection = {
        organization(null.asInstanceOf[String], subProjection)
    }

    def organization(alias: String, subProjection: OrganizationResponseProjection): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection))
        this
    }

    def updatedAt(): UserStatusResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def user(subProjection: UserResponseProjection): UserStatusResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): UserStatusResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserStatusResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UserStatusResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
