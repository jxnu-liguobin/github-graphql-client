package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MarkedAsDuplicateEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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


}
