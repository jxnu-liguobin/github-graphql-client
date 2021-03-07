package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for GistCommentConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class GistCommentConnectionResponseProjection extends GraphQLResponseProjection {

    public GistCommentConnectionResponseProjection() {
    }

    @Override
    public GistCommentConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GistCommentConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", 0) + 1);
            this.edges(new GistCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", 0) + 1);
            this.nodes(new GistCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.GistCommentResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public GistCommentConnectionResponseProjection edges(GistCommentEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public GistCommentConnectionResponseProjection edges(String alias, GistCommentEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public GistCommentConnectionResponseProjection nodes(GistCommentResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public GistCommentConnectionResponseProjection nodes(String alias, GistCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public GistCommentConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public GistCommentConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public GistCommentConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public GistCommentConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public GistCommentConnectionResponseProjection typename() {
        return typename(null);
    }

    public GistCommentConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
