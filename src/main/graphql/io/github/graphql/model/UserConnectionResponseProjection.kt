package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UserConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["UserConnectionResponseProjection.UserEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) + 1
            this.edges(UserEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["UserConnectionResponseProjection.UserResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1
            this.nodes(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: UserEdgeResponseProjection): UserConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: UserEdgeResponseProjection): UserConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserResponseProjection): UserConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserResponseProjection): UserConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): UserConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): UserConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): UserConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): UserConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): UserConnectionResponseProjection = typename(null)

    fun typename(alias: String?): UserConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
