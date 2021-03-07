package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReopenedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReopenedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReopenedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReopenedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["ReopenedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ClosableResponseProjection.closable", 0) <= maxDepth) {
            projectionDepthOnFields["ReopenedEventResponseProjection.ClosableResponseProjection.closable"] = projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ClosableResponseProjection.closable", 0) + 1
            this.closable(ClosableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ClosableResponseProjection.closable", 0)))
        }
        this.createdAt()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): ReopenedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): ReopenedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun closable(subProjection: ClosableResponseProjection): ReopenedEventResponseProjection = closable(null, subProjection)

    fun closable(alias: String?, subProjection: ClosableResponseProjection): ReopenedEventResponseProjection {
        fields.add(GraphQLResponseField("closable").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): ReopenedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ReopenedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): ReopenedEventResponseProjection = id(null)

    fun id(alias: String?): ReopenedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): ReopenedEventResponseProjection = typename(null)

    fun typename(alias: String?): ReopenedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
