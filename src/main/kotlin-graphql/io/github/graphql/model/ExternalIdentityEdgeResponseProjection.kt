package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ExternalIdentityEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ExternalIdentityEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ExternalIdentityEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ExternalIdentityEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", 0) + 1
            this.node(ExternalIdentityResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): ExternalIdentityEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ExternalIdentityEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: ExternalIdentityResponseProjection): ExternalIdentityEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: ExternalIdentityResponseProjection): ExternalIdentityEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ExternalIdentityEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ExternalIdentityEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
