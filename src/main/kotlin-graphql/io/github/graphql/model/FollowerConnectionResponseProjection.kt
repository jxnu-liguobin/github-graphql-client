package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for FollowerConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class FollowerConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): FollowerConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): FollowerConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("FollowerConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["FollowerConnectionResponseProjection.UserEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("FollowerConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) + 1
            this.edges(UserEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("FollowerConnectionResponseProjection.UserEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("FollowerConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["FollowerConnectionResponseProjection.UserResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("FollowerConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1
            this.nodes(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("FollowerConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("FollowerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["FollowerConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("FollowerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("FollowerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: UserEdgeResponseProjection): FollowerConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: UserEdgeResponseProjection): FollowerConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserResponseProjection): FollowerConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserResponseProjection): FollowerConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): FollowerConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): FollowerConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): FollowerConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): FollowerConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): FollowerConnectionResponseProjection = typename(null)

    fun typename(alias: String?): FollowerConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
