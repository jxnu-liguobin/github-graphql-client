package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SearchResultItemConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SearchResultItemConnectionResponseProjection extends GraphQLResponseProjection {

    public SearchResultItemConnectionResponseProjection() {
    }

    @Override
    public SearchResultItemConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SearchResultItemConnectionResponseProjection all$(int maxDepth) {
        this.codeCount();
        if (projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", 0) + 1);
            this.edges(new SearchResultItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", 0)));
        }
        this.issueCount();
        if (projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", 0) + 1);
            this.nodes(new SearchResultItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.repositoryCount();
        this.userCount();
        this.wikiCount();
        this.typename();
        return this;
    }

    public SearchResultItemConnectionResponseProjection codeCount() {
        return codeCount(null);
    }

    public SearchResultItemConnectionResponseProjection codeCount(String alias) {
        fields.add(new GraphQLResponseField("codeCount").alias(alias));
        return this;
    }

    public SearchResultItemConnectionResponseProjection edges(SearchResultItemEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public SearchResultItemConnectionResponseProjection edges(String alias, SearchResultItemEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public SearchResultItemConnectionResponseProjection issueCount() {
        return issueCount(null);
    }

    public SearchResultItemConnectionResponseProjection issueCount(String alias) {
        fields.add(new GraphQLResponseField("issueCount").alias(alias));
        return this;
    }

    public SearchResultItemConnectionResponseProjection nodes(SearchResultItemResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public SearchResultItemConnectionResponseProjection nodes(String alias, SearchResultItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public SearchResultItemConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public SearchResultItemConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public SearchResultItemConnectionResponseProjection repositoryCount() {
        return repositoryCount(null);
    }

    public SearchResultItemConnectionResponseProjection repositoryCount(String alias) {
        fields.add(new GraphQLResponseField("repositoryCount").alias(alias));
        return this;
    }

    public SearchResultItemConnectionResponseProjection userCount() {
        return userCount(null);
    }

    public SearchResultItemConnectionResponseProjection userCount(String alias) {
        fields.add(new GraphQLResponseField("userCount").alias(alias));
        return this;
    }

    public SearchResultItemConnectionResponseProjection wikiCount() {
        return wikiCount(null);
    }

    public SearchResultItemConnectionResponseProjection wikiCount(String alias) {
        fields.add(new GraphQLResponseField("wikiCount").alias(alias));
        return this;
    }

    public SearchResultItemConnectionResponseProjection typename() {
        return typename(null);
    }

    public SearchResultItemConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
