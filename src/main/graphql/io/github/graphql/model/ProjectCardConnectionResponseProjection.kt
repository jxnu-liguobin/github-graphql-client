package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectCardConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ProjectCardConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectCardConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectCardConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", 0) + 1
            this.edges(ProjectCardEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", 0) + 1
            this.nodes(ProjectCardResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: ProjectCardEdgeResponseProjection): ProjectCardConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ProjectCardEdgeResponseProjection): ProjectCardConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: ProjectCardResponseProjection): ProjectCardConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: ProjectCardResponseProjection): ProjectCardConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ProjectCardConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ProjectCardConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ProjectCardConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ProjectCardConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): ProjectCardConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ProjectCardConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
