package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReopenedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReopenedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReopenedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReopenedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReopenedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ClosableResponseProjection.closable", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReopenedEventResponseProjection.ClosableResponseProjection.closable", projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ClosableResponseProjection.closable", 0) + 1)
            this.closable(new ClosableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ClosableResponseProjection.closable", 0)))
        }
        this.createdAt()
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): ReopenedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): ReopenedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def closable(subProjection: ClosableResponseProjection): ReopenedEventResponseProjection = {
        closable(null.asInstanceOf[String], subProjection)
    }

    def closable(alias: String, subProjection: ClosableResponseProjection): ReopenedEventResponseProjection = {
        fields.add(new GraphQLResponseField("closable").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): ReopenedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ReopenedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): ReopenedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReopenedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): ReopenedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReopenedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReopenedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
