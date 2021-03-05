package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MentionedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MentionedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MentionedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MentionedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MentionedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["MentionedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("MentionedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MentionedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): MentionedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): MentionedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): MentionedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): MentionedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): MentionedEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): MentionedEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): MentionedEventResponseProjection = id(null)

    fun id(alias: String?): MentionedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): MentionedEventResponseProjection = typename(null)

    fun typename(alias: String?): MentionedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
