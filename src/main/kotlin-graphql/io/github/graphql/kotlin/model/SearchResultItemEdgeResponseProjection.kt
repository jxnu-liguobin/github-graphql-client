package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SearchResultItemEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SearchResultItemEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SearchResultItemEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SearchResultItemEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node"] = projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", 0) + 1
            this.node(SearchResultItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", 0) <= maxDepth) {
            projectionDepthOnFields["SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches"] = projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", 0) + 1
            this.textMatches(TextMatchResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): SearchResultItemEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): SearchResultItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: SearchResultItemResponseProjection): SearchResultItemEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: SearchResultItemResponseProjection): SearchResultItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun textMatches(subProjection: TextMatchResponseProjection): SearchResultItemEdgeResponseProjection = textMatches(null, subProjection)

    fun textMatches(alias: String?, subProjection: TextMatchResponseProjection): SearchResultItemEdgeResponseProjection {
        fields.add(GraphQLResponseField("textMatches").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SearchResultItemEdgeResponseProjection = typename(null)

    fun typename(alias: String?): SearchResultItemEdgeResponseProjection {
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
        val that = other as SearchResultItemEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
