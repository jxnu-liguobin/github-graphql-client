package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReleaseEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReleaseEdgeResponseProjection extends GraphQLResponseProjection {

    public ReleaseEdgeResponseProjection() {
    }

    @Override
    public ReleaseEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReleaseEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", projectionDepthOnFields.getOrDefault("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", 0) + 1);
            this.node(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseEdgeResponseProjection.ReleaseResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ReleaseEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ReleaseEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ReleaseEdgeResponseProjection node(ReleaseResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ReleaseEdgeResponseProjection node(String alias, ReleaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseEdgeResponseProjection typename() {
        return typename(null);
    }

    public ReleaseEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
