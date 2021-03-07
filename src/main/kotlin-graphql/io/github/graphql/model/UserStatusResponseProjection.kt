package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserStatus
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UserStatusResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserStatusResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserStatusResponseProjection {
        this.createdAt()
        this.emoji()
        this.emojiHTML()
        this.expiresAt()
        this.id()
        this.indicatesLimitedAvailability()
        this.message()
        if (projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields["UserStatusResponseProjection.OrganizationResponseProjection.organization"] = projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.OrganizationResponseProjection.organization", 0) + 1
            this.organization(OrganizationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["UserStatusResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun createdAt(): UserStatusResponseProjection = createdAt(null)

    fun createdAt(alias: String?): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun emoji(): UserStatusResponseProjection = emoji(null)

    fun emoji(alias: String?): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("emoji").alias(alias))
        return this
    }

    fun emojiHTML(): UserStatusResponseProjection = emojiHTML(null)

    fun emojiHTML(alias: String?): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("emojiHTML").alias(alias))
        return this
    }

    fun expiresAt(): UserStatusResponseProjection = expiresAt(null)

    fun expiresAt(alias: String?): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("expiresAt").alias(alias))
        return this
    }

    fun id(): UserStatusResponseProjection = id(null)

    fun id(alias: String?): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun indicatesLimitedAvailability(): UserStatusResponseProjection = indicatesLimitedAvailability(null)

    fun indicatesLimitedAvailability(alias: String?): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("indicatesLimitedAvailability").alias(alias))
        return this
    }

    fun message(): UserStatusResponseProjection = message(null)

    fun message(alias: String?): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("message").alias(alias))
        return this
    }

    fun organization(subProjection: OrganizationResponseProjection): UserStatusResponseProjection = organization(null, subProjection)

    fun organization(alias: String?, subProjection: OrganizationResponseProjection): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("organization").alias(alias).projection(subProjection))
        return this
    }

    fun updatedAt(): UserStatusResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): UserStatusResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UserStatusResponseProjection = typename(null)

    fun typename(alias: String?): UserStatusResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
