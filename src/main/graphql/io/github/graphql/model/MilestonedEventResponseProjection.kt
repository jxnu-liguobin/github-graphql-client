package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MilestonedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MilestonedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MilestonedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MilestonedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["MilestonedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.milestoneTitle()
        if (projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields["MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject"] = projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) + 1
            this.subject(MilestoneItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): MilestonedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): MilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): MilestonedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): MilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): MilestonedEventResponseProjection = id(null)

    fun id(alias: String?): MilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun milestoneTitle(): MilestonedEventResponseProjection = milestoneTitle(null)

    fun milestoneTitle(alias: String?): MilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("milestoneTitle").alias(alias))
        return this
    }

    fun subject(subProjection: MilestoneItemResponseProjection): MilestonedEventResponseProjection = subject(null, subProjection)

    fun subject(alias: String?, subProjection: MilestoneItemResponseProjection): MilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("subject").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): MilestonedEventResponseProjection = typename(null)

    fun typename(alias: String?): MilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
