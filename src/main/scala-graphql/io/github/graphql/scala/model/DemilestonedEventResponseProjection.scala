package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DemilestonedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DemilestonedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): DemilestonedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): DemilestonedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("DemilestonedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.milestoneTitle()
        if (projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) + 1)
            this.subject(new MilestoneItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): DemilestonedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): DemilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): DemilestonedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): DemilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): DemilestonedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): DemilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def milestoneTitle(): DemilestonedEventResponseProjection = {
        milestoneTitle(null.asInstanceOf[String])
    }

    def milestoneTitle(alias: String): DemilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("milestoneTitle").alias(alias))
        this
    }

    def subject(subProjection: MilestoneItemResponseProjection): DemilestonedEventResponseProjection = {
        subject(null.asInstanceOf[String], subProjection)
    }

    def subject(alias: String, subProjection: MilestoneItemResponseProjection): DemilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection))
        this
    }

    def typename(): DemilestonedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DemilestonedEventResponseProjection = {
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
        val that = obj.asInstanceOf[DemilestonedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
