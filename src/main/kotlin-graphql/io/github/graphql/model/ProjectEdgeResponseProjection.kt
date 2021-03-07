package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ProjectEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectEdgeResponseProjection.ProjectResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0) + 1
            this.node(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): ProjectEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ProjectEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: ProjectResponseProjection): ProjectEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: ProjectResponseProjection): ProjectEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ProjectEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ProjectEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
