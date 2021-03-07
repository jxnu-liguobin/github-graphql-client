package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommentDeletedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class CommentDeletedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommentDeletedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommentDeletedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): CommentDeletedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): CommentDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): CommentDeletedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): CommentDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): CommentDeletedEventResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): CommentDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): CommentDeletedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): CommentDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): CommentDeletedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommentDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
