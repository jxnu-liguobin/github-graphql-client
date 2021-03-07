package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MovedColumnsInProjectEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MovedColumnsInProjectEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MovedColumnsInProjectEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MovedColumnsInProjectEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): MovedColumnsInProjectEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): MovedColumnsInProjectEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): MovedColumnsInProjectEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): MovedColumnsInProjectEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): MovedColumnsInProjectEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): MovedColumnsInProjectEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): MovedColumnsInProjectEventResponseProjection = id(null)

    fun id(alias: String?): MovedColumnsInProjectEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): MovedColumnsInProjectEventResponseProjection = typename(null)

    fun typename(alias: String?): MovedColumnsInProjectEventResponseProjection {
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
        val that = other as MovedColumnsInProjectEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
