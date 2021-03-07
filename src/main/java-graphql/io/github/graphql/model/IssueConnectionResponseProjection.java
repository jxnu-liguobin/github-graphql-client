package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueConnectionResponseProjection extends GraphQLResponseProjection {

    public IssueConnectionResponseProjection() {
    }

    @Override
    public IssueConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", 0) + 1);
            this.edges(new IssueEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueConnectionResponseProjection.IssueResponseProjection.nodes", projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueResponseProjection.nodes", 0) + 1);
            this.nodes(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public IssueConnectionResponseProjection edges(IssueEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public IssueConnectionResponseProjection edges(String alias, IssueEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public IssueConnectionResponseProjection nodes(IssueResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public IssueConnectionResponseProjection nodes(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public IssueConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public IssueConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public IssueConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public IssueConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public IssueConnectionResponseProjection typename() {
        return typename(null);
    }

    public IssueConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
