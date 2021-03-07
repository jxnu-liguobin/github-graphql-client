package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeploymentConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class DeploymentConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeploymentConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeploymentConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", 0) + 1
            this.edges(DeploymentEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", 0) + 1
            this.nodes(DeploymentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: DeploymentEdgeResponseProjection): DeploymentConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: DeploymentEdgeResponseProjection): DeploymentConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: DeploymentResponseProjection): DeploymentConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: DeploymentResponseProjection): DeploymentConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): DeploymentConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): DeploymentConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): DeploymentConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): DeploymentConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): DeploymentConnectionResponseProjection = typename(null)

    fun typename(alias: String?): DeploymentConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
