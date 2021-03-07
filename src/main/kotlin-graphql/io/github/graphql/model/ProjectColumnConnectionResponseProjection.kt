package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectColumnConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ProjectColumnConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectColumnConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectColumnConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", 0) + 1
            this.edges(ProjectColumnEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", 0) + 1
            this.nodes(ProjectColumnResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: ProjectColumnEdgeResponseProjection): ProjectColumnConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ProjectColumnEdgeResponseProjection): ProjectColumnConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: ProjectColumnResponseProjection): ProjectColumnConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: ProjectColumnResponseProjection): ProjectColumnConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ProjectColumnConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ProjectColumnConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ProjectColumnConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ProjectColumnConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): ProjectColumnConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ProjectColumnConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
