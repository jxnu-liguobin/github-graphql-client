package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BaseRefChangedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class BaseRefChangedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BaseRefChangedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BaseRefChangedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["BaseRefChangedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): BaseRefChangedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): BaseRefChangedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): BaseRefChangedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): BaseRefChangedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): BaseRefChangedEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): BaseRefChangedEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): BaseRefChangedEventResponseProjection = id(null)

    fun id(alias: String?): BaseRefChangedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): BaseRefChangedEventResponseProjection = typename(null)

    fun typename(alias: String?): BaseRefChangedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
