package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserStatusConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UserStatusConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserStatusConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserStatusConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", 0) + 1
            this.edges(UserStatusEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", 0) + 1
            this.nodes(UserStatusResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: UserStatusEdgeResponseProjection): UserStatusConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: UserStatusEdgeResponseProjection): UserStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserStatusResponseProjection): UserStatusConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserStatusResponseProjection): UserStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): UserStatusConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): UserStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): UserStatusConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): UserStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): UserStatusConnectionResponseProjection = typename(null)

    fun typename(alias: String?): UserStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
