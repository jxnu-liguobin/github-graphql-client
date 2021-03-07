package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RemovedFromProjectEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RemovedFromProjectEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RemovedFromProjectEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RemovedFromProjectEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): RemovedFromProjectEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): RemovedFromProjectEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): RemovedFromProjectEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): RemovedFromProjectEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): RemovedFromProjectEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): RemovedFromProjectEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): RemovedFromProjectEventResponseProjection = id(null)

    fun id(alias: String?): RemovedFromProjectEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): RemovedFromProjectEventResponseProjection = typename(null)

    fun typename(alias: String?): RemovedFromProjectEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
