package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedCommitContributionEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CreatedCommitContributionEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedCommitContributionEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedCommitContributionEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node"] = projectionDepthOnFields.getOrDefault("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", 0) + 1
            this.node(CreatedCommitContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): CreatedCommitContributionEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): CreatedCommitContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: CreatedCommitContributionResponseProjection): CreatedCommitContributionEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: CreatedCommitContributionResponseProjection): CreatedCommitContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedCommitContributionEdgeResponseProjection = typename(null)

    fun typename(alias: String?): CreatedCommitContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
