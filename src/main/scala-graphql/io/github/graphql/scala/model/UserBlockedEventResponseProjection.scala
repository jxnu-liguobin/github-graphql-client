package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UserBlockedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UserBlockedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserBlockedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserBlockedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserBlockedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.blockDuration()
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.UserResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserBlockedEventResponseProjection.UserResponseProjection.subject", projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.UserResponseProjection.subject", 0) + 1)
            this.subject(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.UserResponseProjection.subject", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): UserBlockedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): UserBlockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def blockDuration(): UserBlockedEventResponseProjection = {
        blockDuration(null.asInstanceOf[String])
    }

    def blockDuration(alias: String): UserBlockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("blockDuration").alias(alias))
        this
    }

    def createdAt(): UserBlockedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): UserBlockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): UserBlockedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): UserBlockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def subject(subProjection: UserResponseProjection): UserBlockedEventResponseProjection = {
        subject(null.asInstanceOf[String], subProjection)
    }

    def subject(alias: String, subProjection: UserResponseProjection): UserBlockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection))
        this
    }

    def typename(): UserBlockedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserBlockedEventResponseProjection = {
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
        val that = obj.asInstanceOf[UserBlockedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
