package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RepositoryTopicEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RepositoryTopicEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryTopicEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryTopicEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", projectionDepthOnFields.getOrDefault("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", 0) + 1)
            this.node(new RepositoryTopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): RepositoryTopicEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): RepositoryTopicEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RepositoryTopicResponseProjection): RepositoryTopicEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RepositoryTopicResponseProjection): RepositoryTopicEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): RepositoryTopicEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryTopicEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[RepositoryTopicEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
