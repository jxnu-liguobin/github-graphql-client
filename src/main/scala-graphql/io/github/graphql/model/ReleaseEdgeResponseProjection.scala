package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReleaseEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReleaseEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReleaseEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReleaseEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", projectionDepthOnFields.getOrDefault("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", 0) + 1)
            this.node(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): ReleaseEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ReleaseEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: ReleaseResponseProjection): ReleaseEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: ReleaseResponseProjection): ReleaseEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReleaseEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReleaseEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
