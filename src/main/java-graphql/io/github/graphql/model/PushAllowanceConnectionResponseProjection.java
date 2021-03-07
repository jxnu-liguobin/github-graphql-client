package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PushAllowanceConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PushAllowanceConnectionResponseProjection extends GraphQLResponseProjection {

    public PushAllowanceConnectionResponseProjection() {
    }

    @Override
    public PushAllowanceConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PushAllowanceConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PushAllowanceEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", 0) + 1);
            this.nodes(new PushAllowanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PushAllowanceConnectionResponseProjection edges(PushAllowanceEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PushAllowanceConnectionResponseProjection edges(String alias, PushAllowanceEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PushAllowanceConnectionResponseProjection nodes(PushAllowanceResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PushAllowanceConnectionResponseProjection nodes(String alias, PushAllowanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PushAllowanceConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PushAllowanceConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PushAllowanceConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PushAllowanceConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PushAllowanceConnectionResponseProjection typename() {
        return typename(null);
    }

    public PushAllowanceConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
