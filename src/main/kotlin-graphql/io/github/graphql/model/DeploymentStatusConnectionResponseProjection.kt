package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeploymentStatusConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class DeploymentStatusConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeploymentStatusConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeploymentStatusConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", 0) + 1
            this.edges(DeploymentStatusEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", 0) + 1
            this.nodes(DeploymentStatusResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: DeploymentStatusEdgeResponseProjection): DeploymentStatusConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: DeploymentStatusEdgeResponseProjection): DeploymentStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: DeploymentStatusResponseProjection): DeploymentStatusConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: DeploymentStatusResponseProjection): DeploymentStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): DeploymentStatusConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): DeploymentStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): DeploymentStatusConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): DeploymentStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): DeploymentStatusConnectionResponseProjection = typename(null)

    fun typename(alias: String?): DeploymentStatusConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
