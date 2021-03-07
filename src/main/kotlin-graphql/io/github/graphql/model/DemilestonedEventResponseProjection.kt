package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DemilestonedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class DemilestonedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DemilestonedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DemilestonedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["DemilestonedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.milestoneTitle()
        if (projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields["DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject"] = projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) + 1
            this.subject(MilestoneItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): DemilestonedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): DemilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): DemilestonedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): DemilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): DemilestonedEventResponseProjection = id(null)

    fun id(alias: String?): DemilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun milestoneTitle(): DemilestonedEventResponseProjection = milestoneTitle(null)

    fun milestoneTitle(alias: String?): DemilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("milestoneTitle").alias(alias))
        return this
    }

    fun subject(subProjection: MilestoneItemResponseProjection): DemilestonedEventResponseProjection = subject(null, subProjection)

    fun subject(alias: String?, subProjection: MilestoneItemResponseProjection): DemilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("subject").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DemilestonedEventResponseProjection = typename(null)

    fun typename(alias: String?): DemilestonedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
