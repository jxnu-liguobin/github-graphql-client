package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ProjectConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0) + 1
            this.edges(ProjectEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectConnectionResponseProjection.ProjectResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", 0) + 1
            this.nodes(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: ProjectEdgeResponseProjection): ProjectConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ProjectEdgeResponseProjection): ProjectConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: ProjectResponseProjection): ProjectConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: ProjectResponseProjection): ProjectConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ProjectConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ProjectConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ProjectConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ProjectConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): ProjectConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ProjectConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
