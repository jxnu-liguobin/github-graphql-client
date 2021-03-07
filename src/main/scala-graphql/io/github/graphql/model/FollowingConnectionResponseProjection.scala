package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for FollowingConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class FollowingConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): FollowingConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): FollowingConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) + 1)
            this.edges(new UserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("FollowingConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1)
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: UserEdgeResponseProjection): FollowingConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: UserEdgeResponseProjection): FollowingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: UserResponseProjection): FollowingConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: UserResponseProjection): FollowingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): FollowingConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): FollowingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): FollowingConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): FollowingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): FollowingConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): FollowingConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
