package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReactionGroup
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReactionGroupResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReactionGroupResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReactionGroupResponseProjection {
        this.content()
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactableResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields["ReactionGroupResponseProjection.ReactableResponseProjection.subject"] = projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactableResponseProjection.subject", 0) + 1
            this.subject(ReactableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactableResponseProjection.subject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", 0) <= maxDepth) {
            projectionDepthOnFields["ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users"] = projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", 0) + 1
            this.users(ReactingUserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", 0)))
        }
        this.viewerHasReacted()
        this.typename()
        return this
    }

    fun content(): ReactionGroupResponseProjection = content(null)

    fun content(alias: String?): ReactionGroupResponseProjection {
        fields.add(GraphQLResponseField("content").alias(alias))
        return this
    }

    fun createdAt(): ReactionGroupResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ReactionGroupResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun subject(subProjection: ReactableResponseProjection): ReactionGroupResponseProjection = subject(null, subProjection)

    fun subject(alias: String?, subProjection: ReactableResponseProjection): ReactionGroupResponseProjection {
        fields.add(GraphQLResponseField("subject").alias(alias).projection(subProjection))
        return this
    }

    fun users(subProjection: ReactingUserConnectionResponseProjection): ReactionGroupResponseProjection = users(null, subProjection)

    fun users(alias: String?, subProjection: ReactingUserConnectionResponseProjection): ReactionGroupResponseProjection {
        fields.add(GraphQLResponseField("users").alias(alias).projection(subProjection))
        return this
    }

    fun users(input: ReactionGroupUsersParametrizedInput, subProjection: ReactingUserConnectionResponseProjection): ReactionGroupResponseProjection = users(null, input, subProjection)

    fun users(alias: String?, input: ReactionGroupUsersParametrizedInput, subProjection: ReactingUserConnectionResponseProjection): ReactionGroupResponseProjection {
        fields.add(GraphQLResponseField("users").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerHasReacted(): ReactionGroupResponseProjection = viewerHasReacted(null)

    fun viewerHasReacted(alias: String?): ReactionGroupResponseProjection {
        fields.add(GraphQLResponseField("viewerHasReacted").alias(alias))
        return this
    }

    fun typename(): ReactionGroupResponseProjection = typename(null)

    fun typename(alias: String?): ReactionGroupResponseProjection {
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
        val that = other as ReactionGroupResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
