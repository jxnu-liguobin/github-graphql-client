package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnsubscribedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UnsubscribedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): UnsubscribedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): UnsubscribedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) + 1)
            this.subscribable(new SubscribableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): UnsubscribedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): UnsubscribedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): UnsubscribedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): UnsubscribedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): UnsubscribedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): UnsubscribedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def subscribable(subProjection: SubscribableResponseProjection): UnsubscribedEventResponseProjection = {
        subscribable(null.asInstanceOf[String], subProjection)
    }

    def subscribable(alias: String, subProjection: SubscribableResponseProjection): UnsubscribedEventResponseProjection = {
        fields.add(new GraphQLResponseField("subscribable").alias(alias).projection(subProjection))
        this
    }

    def typename(): UnsubscribedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UnsubscribedEventResponseProjection = {
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
        val that = obj.asInstanceOf[UnsubscribedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
