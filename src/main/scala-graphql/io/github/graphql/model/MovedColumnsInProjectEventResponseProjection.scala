package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MovedColumnsInProjectEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class MovedColumnsInProjectEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): MovedColumnsInProjectEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): MovedColumnsInProjectEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): MovedColumnsInProjectEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): MovedColumnsInProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): MovedColumnsInProjectEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): MovedColumnsInProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): MovedColumnsInProjectEventResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): MovedColumnsInProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): MovedColumnsInProjectEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): MovedColumnsInProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): MovedColumnsInProjectEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MovedColumnsInProjectEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
