package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for LanguageConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LanguageConnectionResponseProjection extends GraphQLResponseProjection {

    public LanguageConnectionResponseProjection() {
    }

    @Override
    public LanguageConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LanguageConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", 0) + 1);
            this.edges(new LanguageEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", 0) + 1);
            this.nodes(new LanguageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.totalSize();
        this.typename();
        return this;
    }

    public LanguageConnectionResponseProjection edges(LanguageEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public LanguageConnectionResponseProjection edges(String alias, LanguageEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public LanguageConnectionResponseProjection nodes(LanguageResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public LanguageConnectionResponseProjection nodes(String alias, LanguageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public LanguageConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public LanguageConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public LanguageConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public LanguageConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public LanguageConnectionResponseProjection totalSize() {
        return totalSize(null);
    }

    public LanguageConnectionResponseProjection totalSize(String alias) {
        fields.add(new GraphQLResponseField("totalSize").alias(alias));
        return this;
    }

    public LanguageConnectionResponseProjection typename() {
        return typename(null);
    }

    public LanguageConnectionResponseProjection typename(String alias) {
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
        final LanguageConnectionResponseProjection that = (LanguageConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
