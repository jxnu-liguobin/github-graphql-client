package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Reaction
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReactionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReactionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReactionResponseProjection = {
        this.content()
        this.createdAt()
        this.databaseId()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ReactionResponseProjection.ReactableResponseProjection.reactable", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionResponseProjection.ReactableResponseProjection.reactable", projectionDepthOnFields.getOrDefault("ReactionResponseProjection.ReactableResponseProjection.reactable", 0) + 1)
            this.reactable(new ReactableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionResponseProjection.ReactableResponseProjection.reactable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ReactionResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def content(): ReactionResponseProjection = {
        content(null.asInstanceOf[String])
    }

    def content(alias: String): ReactionResponseProjection = {
        fields.add(new GraphQLResponseField("content").alias(alias))
        this
    }

    def createdAt(): ReactionResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ReactionResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): ReactionResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): ReactionResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): ReactionResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReactionResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def reactable(subProjection: ReactableResponseProjection): ReactionResponseProjection = {
        reactable(null.asInstanceOf[String], subProjection)
    }

    def reactable(alias: String, subProjection: ReactableResponseProjection): ReactionResponseProjection = {
        fields.add(new GraphQLResponseField("reactable").alias(alias).projection(subProjection))
        this
    }

    def user(subProjection: UserResponseProjection): ReactionResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): ReactionResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReactionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReactionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReactionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
