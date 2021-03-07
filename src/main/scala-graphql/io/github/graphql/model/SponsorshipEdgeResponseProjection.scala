package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SponsorshipEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SponsorshipEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): SponsorshipEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): SponsorshipEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", projectionDepthOnFields.getOrDefault("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", 0) + 1)
            this.node(new SponsorshipResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): SponsorshipEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): SponsorshipEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: SponsorshipResponseProjection): SponsorshipEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: SponsorshipResponseProjection): SponsorshipEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): SponsorshipEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SponsorshipEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
