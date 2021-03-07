package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MilestonedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class MilestonedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): MilestonedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): MilestonedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestonedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.milestoneTitle()
        if (projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) + 1)
            this.subject(new MilestoneItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): MilestonedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): MilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): MilestonedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): MilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): MilestonedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): MilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def milestoneTitle(): MilestonedEventResponseProjection = {
        milestoneTitle(null.asInstanceOf[String])
    }

    def milestoneTitle(alias: String): MilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("milestoneTitle").alias(alias))
        this
    }

    def subject(subProjection: MilestoneItemResponseProjection): MilestonedEventResponseProjection = {
        subject(null.asInstanceOf[String], subProjection)
    }

    def subject(alias: String, subProjection: MilestoneItemResponseProjection): MilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection))
        this
    }

    def typename(): MilestonedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MilestonedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
