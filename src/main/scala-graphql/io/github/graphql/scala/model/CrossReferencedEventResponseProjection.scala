package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CrossReferencedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CrossReferencedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): CrossReferencedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): CrossReferencedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.isCrossRepository()
        this.referencedAt()
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", 0) <= maxDepth) {
            projectionDepthOnFields.put("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", 0) + 1)
            this.source(new ReferencedSubjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields.put("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", 0) + 1)
            this.target(new ReferencedSubjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", 0)))
        }
        this.url()
        this.willCloseTarget()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): CrossReferencedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): CrossReferencedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): CrossReferencedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isCrossRepository(): CrossReferencedEventResponseProjection = {
        isCrossRepository(null.asInstanceOf[String])
    }

    def isCrossRepository(alias: String): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("isCrossRepository").alias(alias))
        this
    }

    def referencedAt(): CrossReferencedEventResponseProjection = {
        referencedAt(null.asInstanceOf[String])
    }

    def referencedAt(alias: String): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("referencedAt").alias(alias))
        this
    }

    def resourcePath(): CrossReferencedEventResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def source(subProjection: ReferencedSubjectResponseProjection): CrossReferencedEventResponseProjection = {
        source(null.asInstanceOf[String], subProjection)
    }

    def source(alias: String, subProjection: ReferencedSubjectResponseProjection): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("source").alias(alias).projection(subProjection))
        this
    }

    def target(subProjection: ReferencedSubjectResponseProjection): CrossReferencedEventResponseProjection = {
        target(null.asInstanceOf[String], subProjection)
    }

    def target(alias: String, subProjection: ReferencedSubjectResponseProjection): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection))
        this
    }

    def url(): CrossReferencedEventResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def willCloseTarget(): CrossReferencedEventResponseProjection = {
        willCloseTarget(null.asInstanceOf[String])
    }

    def willCloseTarget(alias: String): CrossReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("willCloseTarget").alias(alias))
        this
    }

    def typename(): CrossReferencedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CrossReferencedEventResponseProjection = {
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
        val that = obj.asInstanceOf[CrossReferencedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
