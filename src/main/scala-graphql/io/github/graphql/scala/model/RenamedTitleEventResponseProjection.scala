package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RenamedTitleEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RenamedTitleEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): RenamedTitleEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): RenamedTitleEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.currentTitle()
        this.id()
        this.previousTitle()
        if (projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", 0) + 1)
            this.subject(new RenamedTitleSubjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): RenamedTitleEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): RenamedTitleEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): RenamedTitleEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): RenamedTitleEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def currentTitle(): RenamedTitleEventResponseProjection = {
        currentTitle(null.asInstanceOf[String])
    }

    def currentTitle(alias: String): RenamedTitleEventResponseProjection = {
        fields.add(new GraphQLResponseField("currentTitle").alias(alias))
        this
    }

    def id(): RenamedTitleEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RenamedTitleEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def previousTitle(): RenamedTitleEventResponseProjection = {
        previousTitle(null.asInstanceOf[String])
    }

    def previousTitle(alias: String): RenamedTitleEventResponseProjection = {
        fields.add(new GraphQLResponseField("previousTitle").alias(alias))
        this
    }

    def subject(subProjection: RenamedTitleSubjectResponseProjection): RenamedTitleEventResponseProjection = {
        subject(null.asInstanceOf[String], subProjection)
    }

    def subject(alias: String, subProjection: RenamedTitleSubjectResponseProjection): RenamedTitleEventResponseProjection = {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection))
        this
    }

    def typename(): RenamedTitleEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RenamedTitleEventResponseProjection = {
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
        val that = obj.asInstanceOf[RenamedTitleEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
