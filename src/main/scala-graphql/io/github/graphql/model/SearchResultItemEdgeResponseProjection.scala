package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SearchResultItemEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SearchResultItemEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): SearchResultItemEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): SearchResultItemEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", 0) + 1)
            this.node(new SearchResultItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", 0) + 1)
            this.textMatches(new TextMatchResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", 0)))
        }
        this.typename()
        this
    }

    def cursor(): SearchResultItemEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): SearchResultItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: SearchResultItemResponseProjection): SearchResultItemEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: SearchResultItemResponseProjection): SearchResultItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def textMatches(subProjection: TextMatchResponseProjection): SearchResultItemEdgeResponseProjection = {
        textMatches(null.asInstanceOf[String], subProjection)
    }

    def textMatches(alias: String, subProjection: TextMatchResponseProjection): SearchResultItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("textMatches").alias(alias).projection(subProjection))
        this
    }

    def typename(): SearchResultItemEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SearchResultItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
