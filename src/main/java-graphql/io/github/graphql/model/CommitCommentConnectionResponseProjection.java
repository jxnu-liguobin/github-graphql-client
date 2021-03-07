package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CommitCommentConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitCommentConnectionResponseProjection extends GraphQLResponseProjection {

    public CommitCommentConnectionResponseProjection() {
    }

    @Override
    public CommitCommentConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommitCommentConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CommitCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", 0) + 1);
            this.nodes(new CommitCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public CommitCommentConnectionResponseProjection edges(CommitCommentEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CommitCommentConnectionResponseProjection edges(String alias, CommitCommentEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentConnectionResponseProjection nodes(CommitCommentResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CommitCommentConnectionResponseProjection nodes(String alias, CommitCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CommitCommentConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CommitCommentConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CommitCommentConnectionResponseProjection typename() {
        return typename(null);
    }

    public CommitCommentConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
