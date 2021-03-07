package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Reaction
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReactionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReactionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReactionResponseProjection {
        this.content()
        this.createdAt()
        this.databaseId()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ReactionResponseProjection.ReactableResponseProjection.reactable", 0) <= maxDepth) {
            projectionDepthOnFields["ReactionResponseProjection.ReactableResponseProjection.reactable"] = projectionDepthOnFields.getOrDefault("ReactionResponseProjection.ReactableResponseProjection.reactable", 0) + 1
            this.reactable(ReactableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactionResponseProjection.ReactableResponseProjection.reactable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["ReactionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("ReactionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun content(): ReactionResponseProjection = content(null)

    fun content(alias: String?): ReactionResponseProjection {
        fields.add(GraphQLResponseField("content").alias(alias))
        return this
    }

    fun createdAt(): ReactionResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ReactionResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): ReactionResponseProjection = databaseId(null)

    fun databaseId(alias: String?): ReactionResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): ReactionResponseProjection = id(null)

    fun id(alias: String?): ReactionResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun reactable(subProjection: ReactableResponseProjection): ReactionResponseProjection = reactable(null, subProjection)

    fun reactable(alias: String?, subProjection: ReactableResponseProjection): ReactionResponseProjection {
        fields.add(GraphQLResponseField("reactable").alias(alias).projection(subProjection))
        return this
    }

    fun user(subProjection: UserResponseProjection): ReactionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): ReactionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReactionResponseProjection = typename(null)

    fun typename(alias: String?): ReactionResponseProjection {
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
        val that = other as ReactionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
