package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ExternalIdentityEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ExternalIdentityEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
