package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for FollowingConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class FollowingConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): FollowingConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): FollowingConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) + 1
            this.edges(UserEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["FollowingConnectionResponseProjection.UserResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1
            this.nodes(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: UserEdgeResponseProjection): FollowingConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: UserEdgeResponseProjection): FollowingConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserResponseProjection): FollowingConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserResponseProjection): FollowingConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): FollowingConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): FollowingConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): FollowingConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): FollowingConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): FollowingConnectionResponseProjection = typename(null)

    fun typename(alias: String?): FollowingConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
