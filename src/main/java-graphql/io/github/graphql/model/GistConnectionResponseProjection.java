package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for GistConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class GistConnectionResponseProjection extends GraphQLResponseProjection {

    public GistConnectionResponseProjection() {
    }

    @Override
    public GistConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GistConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", 0) + 1);
            this.edges(new GistEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistConnectionResponseProjection.GistResponseProjection.nodes", projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistResponseProjection.nodes", 0) + 1);
            this.nodes(new GistResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.GistResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public GistConnectionResponseProjection edges(GistEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public GistConnectionResponseProjection edges(String alias, GistEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public GistConnectionResponseProjection nodes(GistResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public GistConnectionResponseProjection nodes(String alias, GistResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public GistConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public GistConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public GistConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public GistConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public GistConnectionResponseProjection typename() {
        return typename(null);
    }

    public GistConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
