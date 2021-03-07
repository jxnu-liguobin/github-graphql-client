package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UserContentEditConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UserContentEditConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserContentEditConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserContentEditConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", 0) + 1
            this.edges(UserContentEditEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", 0) + 1
            this.nodes(UserContentEditResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: UserContentEditEdgeResponseProjection): UserContentEditConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: UserContentEditEdgeResponseProjection): UserContentEditConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserContentEditResponseProjection): UserContentEditConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserContentEditResponseProjection): UserContentEditConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): UserContentEditConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): UserContentEditConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): UserContentEditConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): UserContentEditConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): UserContentEditConnectionResponseProjection = typename(null)

    fun typename(alias: String?): UserContentEditConnectionResponseProjection {
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
        val that = other as UserContentEditConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
