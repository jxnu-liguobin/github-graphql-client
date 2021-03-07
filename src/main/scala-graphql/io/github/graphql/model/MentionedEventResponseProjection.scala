package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MentionedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MentionedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): MentionedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): MentionedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MentionedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MentionedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MentionedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MentionedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): MentionedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): MentionedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): MentionedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): MentionedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): MentionedEventResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): MentionedEventResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): MentionedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): MentionedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): MentionedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MentionedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
