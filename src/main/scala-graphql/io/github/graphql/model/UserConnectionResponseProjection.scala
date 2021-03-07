package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UserConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) + 1)
            this.edges(new UserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1)
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: UserEdgeResponseProjection): UserConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: UserEdgeResponseProjection): UserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: UserResponseProjection): UserConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: UserResponseProjection): UserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): UserConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): UserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): UserConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): UserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): UserConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
