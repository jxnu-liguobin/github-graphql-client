package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for BaseRefChangedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class BaseRefChangedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BaseRefChangedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BaseRefChangedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["BaseRefChangedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): BaseRefChangedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): BaseRefChangedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): BaseRefChangedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): BaseRefChangedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): BaseRefChangedEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): BaseRefChangedEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): BaseRefChangedEventResponseProjection = id(null)

    fun id(alias: String?): BaseRefChangedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): BaseRefChangedEventResponseProjection = typename(null)

    fun typename(alias: String?): BaseRefChangedEventResponseProjection {
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
        val that = other as BaseRefChangedEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
