package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for LanguageEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class LanguageEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): LanguageEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): LanguageEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("LanguageEdgeResponseProjection.LanguageResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("LanguageEdgeResponseProjection.LanguageResponseProjection.node", projectionDepthOnFields.getOrDefault("LanguageEdgeResponseProjection.LanguageResponseProjection.node", 0) + 1)
            this.node(new LanguageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LanguageEdgeResponseProjection.LanguageResponseProjection.node", 0)))
        }
        this.size()
        this.typename()
        this
    }

    def cursor(): LanguageEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): LanguageEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: LanguageResponseProjection): LanguageEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: LanguageResponseProjection): LanguageEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def size(): LanguageEdgeResponseProjection = {
        size(null.asInstanceOf[String])
    }

    def size(alias: String): LanguageEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("size").alias(alias))
        this
    }

    def typename(): LanguageEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LanguageEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
