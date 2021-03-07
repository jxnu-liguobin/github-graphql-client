package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReactionGroup
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReactionGroupResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReactionGroupResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReactionGroupResponseProjection = {
        this.content()
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactableResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionGroupResponseProjection.ReactableResponseProjection.subject", projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactableResponseProjection.subject", 0) + 1)
            this.subject(new ReactableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactableResponseProjection.subject", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", 0) + 1)
            this.users(new ReactingUserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", 0)))
        }
        this.viewerHasReacted()
        this.typename()
        this
    }

    def content(): ReactionGroupResponseProjection = {
        content(null.asInstanceOf[String])
    }

    def content(alias: String): ReactionGroupResponseProjection = {
        fields.add(new GraphQLResponseField("content").alias(alias))
        this
    }

    def createdAt(): ReactionGroupResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ReactionGroupResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def subject(subProjection: ReactableResponseProjection): ReactionGroupResponseProjection = {
        subject(null.asInstanceOf[String], subProjection)
    }

    def subject(alias: String, subProjection: ReactableResponseProjection): ReactionGroupResponseProjection = {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection))
        this
    }

    def users(subProjection: ReactingUserConnectionResponseProjection): ReactionGroupResponseProjection = {
        users(null.asInstanceOf[String], subProjection)
    }

    def users(alias: String, subProjection: ReactingUserConnectionResponseProjection): ReactionGroupResponseProjection = {
        fields.add(new GraphQLResponseField("users").alias(alias).projection(subProjection))
        this
    }

    def users(input: ReactionGroupUsersParametrizedInput,subProjection: ReactingUserConnectionResponseProjection): ReactionGroupResponseProjection = {
        users(null.asInstanceOf[String], input, subProjection)
    }

    def users(alias: String, input: ReactionGroupUsersParametrizedInput , subProjection: ReactingUserConnectionResponseProjection): ReactionGroupResponseProjection = {
        fields.add(new GraphQLResponseField("users").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerHasReacted(): ReactionGroupResponseProjection = {
        viewerHasReacted(null.asInstanceOf[String])
    }

    def viewerHasReacted(alias: String): ReactionGroupResponseProjection = {
        fields.add(new GraphQLResponseField("viewerHasReacted").alias(alias))
        this
    }

    def typename(): ReactionGroupResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReactionGroupResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
