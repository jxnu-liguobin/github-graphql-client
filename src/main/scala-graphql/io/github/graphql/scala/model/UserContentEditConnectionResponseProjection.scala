package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UserContentEditConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UserContentEditConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserContentEditConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserContentEditConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", 0) + 1)
            this.edges(new UserContentEditEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", 0) + 1)
            this.nodes(new UserContentEditResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: UserContentEditEdgeResponseProjection): UserContentEditConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: UserContentEditEdgeResponseProjection): UserContentEditConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: UserContentEditResponseProjection): UserContentEditConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: UserContentEditResponseProjection): UserContentEditConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): UserContentEditConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): UserContentEditConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): UserContentEditConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): UserContentEditConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): UserContentEditConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserContentEditConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[UserContentEditConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
