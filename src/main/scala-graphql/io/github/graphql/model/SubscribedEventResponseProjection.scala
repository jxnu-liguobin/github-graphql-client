package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SubscribedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SubscribedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): SubscribedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): SubscribedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubscribedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) + 1)
            this.subscribable(new SubscribableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): SubscribedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): SubscribedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): SubscribedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): SubscribedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): SubscribedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): SubscribedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def subscribable(subProjection: SubscribableResponseProjection): SubscribedEventResponseProjection = {
        subscribable(null.asInstanceOf[String], subProjection)
    }

    def subscribable(alias: String, subProjection: SubscribableResponseProjection): SubscribedEventResponseProjection = {
        fields.add(new GraphQLResponseField("subscribable").alias(alias).projection(subProjection))
        this
    }

    def typename(): SubscribedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SubscribedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
