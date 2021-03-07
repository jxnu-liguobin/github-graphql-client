package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedPullRequestContributionEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CreatedPullRequestContributionEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedPullRequestContributionEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedPullRequestContributionEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", 0) + 1)
            this.node(new CreatedPullRequestContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): CreatedPullRequestContributionEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): CreatedPullRequestContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestContributionEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedPullRequestContributionEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedPullRequestContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CreatedPullRequestContributionEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
