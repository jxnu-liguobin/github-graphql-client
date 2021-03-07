package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SecurityAdvisoryConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SecurityAdvisoryConnectionResponseProjection extends GraphQLResponseProjection {

    public SecurityAdvisoryConnectionResponseProjection() {
    }

    @Override
    public SecurityAdvisoryConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SecurityAdvisoryConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", 0) + 1);
            this.edges(new SecurityAdvisoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", 0) + 1);
            this.nodes(new SecurityAdvisoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public SecurityAdvisoryConnectionResponseProjection edges(SecurityAdvisoryEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public SecurityAdvisoryConnectionResponseProjection edges(String alias, SecurityAdvisoryEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public SecurityAdvisoryConnectionResponseProjection nodes(SecurityAdvisoryResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public SecurityAdvisoryConnectionResponseProjection nodes(String alias, SecurityAdvisoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public SecurityAdvisoryConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public SecurityAdvisoryConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public SecurityAdvisoryConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public SecurityAdvisoryConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public SecurityAdvisoryConnectionResponseProjection typename() {
        return typename(null);
    }

    public SecurityAdvisoryConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
