package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RemovedFromProjectEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RemovedFromProjectEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): RemovedFromProjectEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): RemovedFromProjectEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): RemovedFromProjectEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): RemovedFromProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): RemovedFromProjectEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): RemovedFromProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): RemovedFromProjectEventResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): RemovedFromProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): RemovedFromProjectEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RemovedFromProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): RemovedFromProjectEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RemovedFromProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
