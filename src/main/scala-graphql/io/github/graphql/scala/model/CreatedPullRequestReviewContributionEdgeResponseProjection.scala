package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedPullRequestReviewContributionEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CreatedPullRequestReviewContributionEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedPullRequestReviewContributionEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedPullRequestReviewContributionEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", 0) + 1)
            this.node(new CreatedPullRequestReviewContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionEdgeResponseProjection.CreatedPullRequestReviewContributionResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): CreatedPullRequestReviewContributionEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): CreatedPullRequestReviewContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: CreatedPullRequestReviewContributionResponseProjection): CreatedPullRequestReviewContributionEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: CreatedPullRequestReviewContributionResponseProjection): CreatedPullRequestReviewContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedPullRequestReviewContributionEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedPullRequestReviewContributionEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[CreatedPullRequestReviewContributionEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
