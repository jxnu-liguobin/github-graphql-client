package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedCommitContributionEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatedCommitContributionEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedCommitContributionEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedCommitContributionEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", 0) + 1)
            this.node(new CreatedCommitContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): CreatedCommitContributionEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): CreatedCommitContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: CreatedCommitContributionResponseProjection): CreatedCommitContributionEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: CreatedCommitContributionResponseProjection): CreatedCommitContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedCommitContributionEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedCommitContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
