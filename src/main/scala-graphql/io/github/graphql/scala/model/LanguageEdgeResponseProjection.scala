package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LanguageEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[LanguageEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
