package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CommitEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommitEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommitEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CommitEdgeResponseProjection.CommitResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["CommitEdgeResponseProjection.CommitResponseProjection.node"] = projectionDepthOnFields.getOrDefault("CommitEdgeResponseProjection.CommitResponseProjection.node", 0) + 1
            this.node(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitEdgeResponseProjection.CommitResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): CommitEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): CommitEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: CommitResponseProjection): CommitEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: CommitResponseProjection): CommitEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CommitEdgeResponseProjection = typename(null)

    fun typename(alias: String?): CommitEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
