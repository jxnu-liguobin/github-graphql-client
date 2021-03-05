package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnsubscribedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UnsubscribedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnsubscribedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnsubscribedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["UnsubscribedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) <= maxDepth) {
            projectionDepthOnFields["UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable"] = projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) + 1
            this.subscribable(SubscribableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): UnsubscribedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): UnsubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): UnsubscribedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): UnsubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): UnsubscribedEventResponseProjection = id(null)

    fun id(alias: String?): UnsubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun subscribable(subProjection: SubscribableResponseProjection): UnsubscribedEventResponseProjection = subscribable(null, subProjection)

    fun subscribable(alias: String?, subProjection: SubscribableResponseProjection): UnsubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("subscribable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UnsubscribedEventResponseProjection = typename(null)

    fun typename(alias: String?): UnsubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
