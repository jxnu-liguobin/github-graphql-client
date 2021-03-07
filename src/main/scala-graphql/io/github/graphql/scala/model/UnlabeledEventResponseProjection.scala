package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnlabeledEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UnlabeledEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): UnlabeledEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): UnlabeledEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlabeledEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelResponseProjection.label", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlabeledEventResponseProjection.LabelResponseProjection.label", projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelResponseProjection.label", 0) + 1)
            this.label(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelResponseProjection.label", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) + 1)
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): UnlabeledEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): UnlabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): UnlabeledEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): UnlabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): UnlabeledEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): UnlabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def label(subProjection: LabelResponseProjection): UnlabeledEventResponseProjection = {
        label(null.asInstanceOf[String], subProjection)
    }

    def label(alias: String, subProjection: LabelResponseProjection): UnlabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("label").alias(alias).projection(subProjection))
        this
    }

    def labelable(subProjection: LabelableResponseProjection): UnlabeledEventResponseProjection = {
        labelable(null.asInstanceOf[String], subProjection)
    }

    def labelable(alias: String, subProjection: LabelableResponseProjection): UnlabeledEventResponseProjection = {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        this
    }

    def typename(): UnlabeledEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UnlabeledEventResponseProjection = {
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
        val that = obj.asInstanceOf[UnlabeledEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
