package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueCommentConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueCommentConnectionResponseProjection extends GraphQLResponseProjection {

    public IssueCommentConnectionResponseProjection() {
    }

    @Override
    public IssueCommentConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueCommentConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", 0) + 1);
            this.edges(new IssueCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", 0) + 1);
            this.nodes(new IssueCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public IssueCommentConnectionResponseProjection edges(IssueCommentEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public IssueCommentConnectionResponseProjection edges(String alias, IssueCommentEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentConnectionResponseProjection nodes(IssueCommentResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public IssueCommentConnectionResponseProjection nodes(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public IssueCommentConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public IssueCommentConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public IssueCommentConnectionResponseProjection typename() {
        return typename(null);
    }

    public IssueCommentConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
