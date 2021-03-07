package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedIssueContributionEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatedIssueContributionEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedIssueContributionEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedIssueContributionEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", 0) + 1)
            this.node(new CreatedIssueContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): CreatedIssueContributionEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): CreatedIssueContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: CreatedIssueContributionResponseProjection): CreatedIssueContributionEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: CreatedIssueContributionResponseProjection): CreatedIssueContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedIssueContributionEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedIssueContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
