package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CommentDeletedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CommentDeletedEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
