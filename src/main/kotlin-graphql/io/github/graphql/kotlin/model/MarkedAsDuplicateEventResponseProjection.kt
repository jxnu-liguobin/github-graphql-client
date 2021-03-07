package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MarkedAsDuplicateEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MarkedAsDuplicateEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MarkedAsDuplicateEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MarkedAsDuplicateEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): MarkedAsDuplicateEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): MarkedAsDuplicateEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): MarkedAsDuplicateEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): MarkedAsDuplicateEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): MarkedAsDuplicateEventResponseProjection = id(null)

    fun id(alias: String?): MarkedAsDuplicateEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): MarkedAsDuplicateEventResponseProjection = typename(null)

    fun typename(alias: String?): MarkedAsDuplicateEventResponseProjection {
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
        val that = other as MarkedAsDuplicateEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
