package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SecurityAdvisoryEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SecurityAdvisoryEdgeResponseProjection extends GraphQLResponseProjection {

    public SecurityAdvisoryEdgeResponseProjection() {
    }

    @Override
    public SecurityAdvisoryEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SecurityAdvisoryEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", projectionDepthOnFields.getOrDefault("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", 0) + 1);
            this.node(new SecurityAdvisoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public SecurityAdvisoryEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public SecurityAdvisoryEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public SecurityAdvisoryEdgeResponseProjection node(SecurityAdvisoryResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public SecurityAdvisoryEdgeResponseProjection node(String alias, SecurityAdvisoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public SecurityAdvisoryEdgeResponseProjection typename() {
        return typename(null);
    }

    public SecurityAdvisoryEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
