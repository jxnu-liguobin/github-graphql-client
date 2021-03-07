package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryTopicEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RepositoryTopicEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryTopicEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryTopicEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", 0) + 1
            this.node(RepositoryTopicResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RepositoryTopicEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RepositoryTopicEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RepositoryTopicResponseProjection): RepositoryTopicEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RepositoryTopicResponseProjection): RepositoryTopicEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RepositoryTopicEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryTopicEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
