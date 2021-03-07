package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddedToProjectEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AddedToProjectEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
