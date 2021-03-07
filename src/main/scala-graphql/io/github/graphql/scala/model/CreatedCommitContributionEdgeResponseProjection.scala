package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedCommitContributionEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CreatedCommitContributionEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
