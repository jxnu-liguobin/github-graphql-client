package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedRepositoryContributionEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CreatedRepositoryContributionEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedRepositoryContributionEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedRepositoryContributionEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node"] = projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", 0) + 1
            this.node(CreatedRepositoryContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): CreatedRepositoryContributionEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): CreatedRepositoryContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryContributionEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedRepositoryContributionEdgeResponseProjection = typename(null)

    fun typename(alias: String?): CreatedRepositoryContributionEdgeResponseProjection {
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
        val that = other as CreatedRepositoryContributionEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
