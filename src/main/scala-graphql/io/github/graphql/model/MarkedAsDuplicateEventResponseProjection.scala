package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MarkedAsDuplicateEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MarkedAsDuplicateEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): MarkedAsDuplicateEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): MarkedAsDuplicateEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): MarkedAsDuplicateEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): MarkedAsDuplicateEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): MarkedAsDuplicateEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): MarkedAsDuplicateEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): MarkedAsDuplicateEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): MarkedAsDuplicateEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): MarkedAsDuplicateEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MarkedAsDuplicateEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
