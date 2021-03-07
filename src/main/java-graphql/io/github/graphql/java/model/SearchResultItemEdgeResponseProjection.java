package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for SearchResultItemEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SearchResultItemEdgeResponseProjection extends GraphQLResponseProjection {

    public SearchResultItemEdgeResponseProjection() {
    }

    @Override
    public SearchResultItemEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SearchResultItemEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", 0) + 1);
            this.node(new SearchResultItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.SearchResultItemResponseProjection.node", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", 0) + 1);
            this.textMatches(new TextMatchResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemEdgeResponseProjection.TextMatchResponseProjection.textMatches", 0)));
        }
        this.typename();
        return this;
    }

    public SearchResultItemEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public SearchResultItemEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public SearchResultItemEdgeResponseProjection node(SearchResultItemResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public SearchResultItemEdgeResponseProjection node(String alias, SearchResultItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public SearchResultItemEdgeResponseProjection textMatches(TextMatchResponseProjection subProjection) {
        return textMatches(null, subProjection);
    }

    public SearchResultItemEdgeResponseProjection textMatches(String alias, TextMatchResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("textMatches").alias(alias).projection(subProjection));
        return this;
    }

    public SearchResultItemEdgeResponseProjection typename() {
        return typename(null);
    }

    public SearchResultItemEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SearchResultItemEdgeResponseProjection that = (SearchResultItemEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
