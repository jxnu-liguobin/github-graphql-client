package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RepositoryInvitationEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RepositoryInvitationEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryInvitationEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryInvitationEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", projectionDepthOnFields.getOrDefault("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", 0) + 1)
            this.node(new RepositoryInvitationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): RepositoryInvitationEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): RepositoryInvitationEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RepositoryInvitationResponseProjection): RepositoryInvitationEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RepositoryInvitationResponseProjection): RepositoryInvitationEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): RepositoryInvitationEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryInvitationEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[RepositoryInvitationEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
