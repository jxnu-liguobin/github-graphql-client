package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AppEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class AppEdgeResponseProjection extends GraphQLResponseProjection {

    public AppEdgeResponseProjection() {
    }

    @Override
    public AppEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AppEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("AppEdgeResponseProjection.AppResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("AppEdgeResponseProjection.AppResponseProjection.node", projectionDepthOnFields.getOrDefault("AppEdgeResponseProjection.AppResponseProjection.node", 0) + 1);
            this.node(new AppResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AppEdgeResponseProjection.AppResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public AppEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public AppEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public AppEdgeResponseProjection node(AppResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public AppEdgeResponseProjection node(String alias, AppResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public AppEdgeResponseProjection typename() {
        return typename(null);
    }

    public AppEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
