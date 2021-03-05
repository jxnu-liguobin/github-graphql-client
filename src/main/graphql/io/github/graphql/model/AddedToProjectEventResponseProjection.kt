package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddedToProjectEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddedToProjectEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddedToProjectEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddedToProjectEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("AddedToProjectEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["AddedToProjectEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("AddedToProjectEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddedToProjectEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): AddedToProjectEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): AddedToProjectEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): AddedToProjectEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): AddedToProjectEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): AddedToProjectEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): AddedToProjectEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): AddedToProjectEventResponseProjection = id(null)

    fun id(alias: String?): AddedToProjectEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): AddedToProjectEventResponseProjection = typename(null)

    fun typename(alias: String?): AddedToProjectEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
