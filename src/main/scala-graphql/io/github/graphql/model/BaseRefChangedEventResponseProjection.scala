package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BaseRefChangedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class BaseRefChangedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): BaseRefChangedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): BaseRefChangedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): BaseRefChangedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): BaseRefChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): BaseRefChangedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): BaseRefChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): BaseRefChangedEventResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): BaseRefChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): BaseRefChangedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): BaseRefChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): BaseRefChangedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BaseRefChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
