package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RepositoryCollaboratorConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RepositoryCollaboratorConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryCollaboratorConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryCollaboratorConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", 0) + 1)
            this.edges(new RepositoryCollaboratorEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1)
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: RepositoryCollaboratorEdgeResponseProjection): RepositoryCollaboratorConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: RepositoryCollaboratorEdgeResponseProjection): RepositoryCollaboratorConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: UserResponseProjection): RepositoryCollaboratorConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: UserResponseProjection): RepositoryCollaboratorConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): RepositoryCollaboratorConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): RepositoryCollaboratorConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): RepositoryCollaboratorConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): RepositoryCollaboratorConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): RepositoryCollaboratorConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryCollaboratorConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[RepositoryCollaboratorConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
