package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectColumnEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ProjectColumnEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectColumnEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectColumnEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", 0) + 1
            this.node(ProjectColumnResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): ProjectColumnEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ProjectColumnEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: ProjectColumnResponseProjection): ProjectColumnEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: ProjectColumnResponseProjection): ProjectColumnEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ProjectColumnEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ProjectColumnEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
