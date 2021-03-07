package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedIssueContributionEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreatedIssueContributionEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedIssueContributionEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedIssueContributionEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node"] = projectionDepthOnFields.getOrDefault("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", 0) + 1
            this.node(CreatedIssueContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): CreatedIssueContributionEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): CreatedIssueContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: CreatedIssueContributionResponseProjection): CreatedIssueContributionEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: CreatedIssueContributionResponseProjection): CreatedIssueContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedIssueContributionEdgeResponseProjection = typename(null)

    fun typename(alias: String?): CreatedIssueContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
