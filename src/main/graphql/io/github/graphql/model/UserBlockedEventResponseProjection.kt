package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserBlockedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UserBlockedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserBlockedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserBlockedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["UserBlockedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.blockDuration()
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.UserResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields["UserBlockedEventResponseProjection.UserResponseProjection.subject"] = projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.UserResponseProjection.subject", 0) + 1
            this.subject(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.UserResponseProjection.subject", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): UserBlockedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): UserBlockedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun blockDuration(): UserBlockedEventResponseProjection = blockDuration(null)

    fun blockDuration(alias: String?): UserBlockedEventResponseProjection {
        fields.add(GraphQLResponseField("blockDuration").alias(alias))
        return this
    }

    fun createdAt(): UserBlockedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): UserBlockedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): UserBlockedEventResponseProjection = id(null)

    fun id(alias: String?): UserBlockedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun subject(subProjection: UserResponseProjection): UserBlockedEventResponseProjection = subject(null, subProjection)

    fun subject(alias: String?, subProjection: UserResponseProjection): UserBlockedEventResponseProjection {
        fields.add(GraphQLResponseField("subject").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UserBlockedEventResponseProjection = typename(null)

    fun typename(alias: String?): UserBlockedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
