package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SearchResultItemConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SearchResultItemConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): SearchResultItemConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): SearchResultItemConnectionResponseProjection = {
        this.codeCount()
        if (projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", 0) + 1)
            this.edges(new SearchResultItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", 0)))
        }
        this.issueCount()
        if (projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", 0) + 1)
            this.nodes(new SearchResultItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.repositoryCount()
        this.userCount()
        this.wikiCount()
        this.typename()
        this
    }

    def codeCount(): SearchResultItemConnectionResponseProjection = {
        codeCount(null.asInstanceOf[String])
    }

    def codeCount(alias: String): SearchResultItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("codeCount").alias(alias))
        this
    }

    def edges(subProjection: SearchResultItemEdgeResponseProjection): SearchResultItemConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: SearchResultItemEdgeResponseProjection): SearchResultItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def issueCount(): SearchResultItemConnectionResponseProjection = {
        issueCount(null.asInstanceOf[String])
    }

    def issueCount(alias: String): SearchResultItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("issueCount").alias(alias))
        this
    }

    def nodes(subProjection: SearchResultItemResponseProjection): SearchResultItemConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: SearchResultItemResponseProjection): SearchResultItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): SearchResultItemConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): SearchResultItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def repositoryCount(): SearchResultItemConnectionResponseProjection = {
        repositoryCount(null.asInstanceOf[String])
    }

    def repositoryCount(alias: String): SearchResultItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("repositoryCount").alias(alias))
        this
    }

    def userCount(): SearchResultItemConnectionResponseProjection = {
        userCount(null.asInstanceOf[String])
    }

    def userCount(alias: String): SearchResultItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("userCount").alias(alias))
        this
    }

    def wikiCount(): SearchResultItemConnectionResponseProjection = {
        wikiCount(null.asInstanceOf[String])
    }

    def wikiCount(alias: String): SearchResultItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("wikiCount").alias(alias))
        this
    }

    def typename(): SearchResultItemConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SearchResultItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
