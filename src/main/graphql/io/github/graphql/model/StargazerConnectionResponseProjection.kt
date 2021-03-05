package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for StargazerConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class StargazerConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): StargazerConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): StargazerConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", 0) + 1
            this.edges(StargazerEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["StargazerConnectionResponseProjection.UserResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1
            this.nodes(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: StargazerEdgeResponseProjection): StargazerConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: StargazerEdgeResponseProjection): StargazerConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserResponseProjection): StargazerConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserResponseProjection): StargazerConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): StargazerConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): StargazerConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): StargazerConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): StargazerConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): StargazerConnectionResponseProjection = typename(null)

    fun typename(alias: String?): StargazerConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
