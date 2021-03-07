package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CommitConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CommitConnectionResponseProjection extends GraphQLResponseProjection {

    public CommitConnectionResponseProjection() {
    }

    @Override
    public CommitConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommitConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CommitEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitConnectionResponseProjection.CommitResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitResponseProjection.nodes", 0) + 1);
            this.nodes(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public CommitConnectionResponseProjection edges(CommitEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CommitConnectionResponseProjection edges(String alias, CommitEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CommitConnectionResponseProjection nodes(CommitResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CommitConnectionResponseProjection nodes(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CommitConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CommitConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CommitConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CommitConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CommitConnectionResponseProjection typename() {
        return typename(null);
    }

    public CommitConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
