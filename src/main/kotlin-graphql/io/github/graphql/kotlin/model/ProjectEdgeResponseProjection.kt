package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ProjectEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ProjectEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
