package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommentDeletedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CommentDeletedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommentDeletedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommentDeletedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["CommentDeletedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): CommentDeletedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): CommentDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): CommentDeletedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): CommentDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): CommentDeletedEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): CommentDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): CommentDeletedEventResponseProjection = id(null)

    fun id(alias: String?): CommentDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): CommentDeletedEventResponseProjection = typename(null)

    fun typename(alias: String?): CommentDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
