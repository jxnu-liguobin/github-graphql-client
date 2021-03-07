package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ClosedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ClosedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): ClosedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): ClosedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClosedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ClosableResponseProjection.closable", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClosedEventResponseProjection.ClosableResponseProjection.closable", projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ClosableResponseProjection.closable", 0) + 1)
            this.closable(new ClosableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ClosableResponseProjection.closable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.CloserResponseProjection.closer", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClosedEventResponseProjection.CloserResponseProjection.closer", projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.CloserResponseProjection.closer", 0) + 1)
            this.closer(new CloserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.CloserResponseProjection.closer", 0)))
        }
        this.createdAt()
        this.id()
        this.resourcePath()
        this.url()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): ClosedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): ClosedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def closable(subProjection: ClosableResponseProjection): ClosedEventResponseProjection = {
        closable(null.asInstanceOf[String], subProjection)
    }

    def closable(alias: String, subProjection: ClosableResponseProjection): ClosedEventResponseProjection = {
        fields.add(new GraphQLResponseField("closable").alias(alias).projection(subProjection))
        this
    }

    def closer(subProjection: CloserResponseProjection): ClosedEventResponseProjection = {
        closer(null.asInstanceOf[String], subProjection)
    }

    def closer(alias: String, subProjection: CloserResponseProjection): ClosedEventResponseProjection = {
        fields.add(new GraphQLResponseField("closer").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): ClosedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ClosedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): ClosedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ClosedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def resourcePath(): ClosedEventResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): ClosedEventResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): ClosedEventResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): ClosedEventResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): ClosedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ClosedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
