package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SubscribedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SubscribedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SubscribedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SubscribedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["SubscribedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) <= maxDepth) {
            projectionDepthOnFields["SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable"] = projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) + 1
            this.subscribable(SubscribableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): SubscribedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): SubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): SubscribedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): SubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): SubscribedEventResponseProjection = id(null)

    fun id(alias: String?): SubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun subscribable(subProjection: SubscribableResponseProjection): SubscribedEventResponseProjection = subscribable(null, subProjection)

    fun subscribable(alias: String?, subProjection: SubscribableResponseProjection): SubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("subscribable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SubscribedEventResponseProjection = typename(null)

    fun typename(alias: String?): SubscribedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
