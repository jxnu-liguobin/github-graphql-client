package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Reaction
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
