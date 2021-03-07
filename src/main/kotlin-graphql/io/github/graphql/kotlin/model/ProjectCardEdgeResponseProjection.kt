package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ProjectCardEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ProjectCardEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectCardEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectCardEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", 0) + 1
            this.node(ProjectCardResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): ProjectCardEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ProjectCardEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: ProjectCardResponseProjection): ProjectCardEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: ProjectCardResponseProjection): ProjectCardEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ProjectCardEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ProjectCardEdgeResponseProjection {
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
        val that = other as ProjectCardEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
