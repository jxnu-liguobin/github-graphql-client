package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReactingUserConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReactingUserConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReactingUserConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReactingUserConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", 0) + 1
            this.edges(ReactingUserEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ReactingUserConnectionResponseProjection.UserResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1
            this.nodes(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: ReactingUserEdgeResponseProjection): ReactingUserConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ReactingUserEdgeResponseProjection): ReactingUserConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserResponseProjection): ReactingUserConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserResponseProjection): ReactingUserConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ReactingUserConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ReactingUserConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ReactingUserConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ReactingUserConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): ReactingUserConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ReactingUserConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
