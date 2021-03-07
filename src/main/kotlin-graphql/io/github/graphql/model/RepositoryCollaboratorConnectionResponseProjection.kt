package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryCollaboratorConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RepositoryCollaboratorConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryCollaboratorConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryCollaboratorConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", 0) + 1
            this.edges(RepositoryCollaboratorEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1
            this.nodes(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: RepositoryCollaboratorEdgeResponseProjection): RepositoryCollaboratorConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: RepositoryCollaboratorEdgeResponseProjection): RepositoryCollaboratorConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserResponseProjection): RepositoryCollaboratorConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserResponseProjection): RepositoryCollaboratorConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): RepositoryCollaboratorConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): RepositoryCollaboratorConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): RepositoryCollaboratorConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): RepositoryCollaboratorConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): RepositoryCollaboratorConnectionResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryCollaboratorConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
