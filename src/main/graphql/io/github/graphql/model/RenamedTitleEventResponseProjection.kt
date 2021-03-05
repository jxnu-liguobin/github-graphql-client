package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RenamedTitleEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RenamedTitleEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RenamedTitleEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RenamedTitleEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["RenamedTitleEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.currentTitle()
        this.id()
        this.previousTitle()
        if (projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields["RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject"] = projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", 0) + 1
            this.subject(RenamedTitleSubjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): RenamedTitleEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): RenamedTitleEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): RenamedTitleEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): RenamedTitleEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun currentTitle(): RenamedTitleEventResponseProjection = currentTitle(null)

    fun currentTitle(alias: String?): RenamedTitleEventResponseProjection {
        fields.add(GraphQLResponseField("currentTitle").alias(alias))
        return this
    }

    fun id(): RenamedTitleEventResponseProjection = id(null)

    fun id(alias: String?): RenamedTitleEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun previousTitle(): RenamedTitleEventResponseProjection = previousTitle(null)

    fun previousTitle(alias: String?): RenamedTitleEventResponseProjection {
        fields.add(GraphQLResponseField("previousTitle").alias(alias))
        return this
    }

    fun subject(subProjection: RenamedTitleSubjectResponseProjection): RenamedTitleEventResponseProjection = subject(null, subProjection)

    fun subject(alias: String?, subProjection: RenamedTitleSubjectResponseProjection): RenamedTitleEventResponseProjection {
        fields.add(GraphQLResponseField("subject").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RenamedTitleEventResponseProjection = typename(null)

    fun typename(alias: String?): RenamedTitleEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
