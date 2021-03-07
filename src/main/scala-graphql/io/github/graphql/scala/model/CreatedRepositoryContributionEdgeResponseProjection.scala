package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedRepositoryContributionEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CreatedRepositoryContributionEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedRepositoryContributionEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedRepositoryContributionEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", 0) + 1)
            this.node(new CreatedRepositoryContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): CreatedRepositoryContributionEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): CreatedRepositoryContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryContributionEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryContributionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedRepositoryContributionEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedRepositoryContributionEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[CreatedRepositoryContributionEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
