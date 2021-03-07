package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LabeledEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LabeledEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): LabeledEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): LabeledEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabeledEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelResponseProjection.label", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabeledEventResponseProjection.LabelResponseProjection.label", projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelResponseProjection.label", 0) + 1)
            this.label(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelResponseProjection.label", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabeledEventResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) + 1)
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): LabeledEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): LabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): LabeledEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): LabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): LabeledEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): LabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def label(subProjection: LabelResponseProjection): LabeledEventResponseProjection = {
        label(null.asInstanceOf[String], subProjection)
    }

    def label(alias: String, subProjection: LabelResponseProjection): LabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("label").alias(alias).projection(subProjection))
        this
    }

    def labelable(subProjection: LabelableResponseProjection): LabeledEventResponseProjection = {
        labelable(null.asInstanceOf[String], subProjection)
    }

    def labelable(alias: String, subProjection: LabelableResponseProjection): LabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        this
    }

    def typename(): LabeledEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LabeledEventResponseProjection = {
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
        val that = obj.asInstanceOf[LabeledEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
