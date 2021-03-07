package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserStatusConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UserStatusConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserStatusConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserStatusConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", 0) + 1)
            this.edges(new UserStatusEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", 0) + 1)
            this.nodes(new UserStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: UserStatusEdgeResponseProjection): UserStatusConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: UserStatusEdgeResponseProjection): UserStatusConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: UserStatusResponseProjection): UserStatusConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: UserStatusResponseProjection): UserStatusConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): UserStatusConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): UserStatusConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): UserStatusConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): UserStatusConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): UserStatusConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserStatusConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
