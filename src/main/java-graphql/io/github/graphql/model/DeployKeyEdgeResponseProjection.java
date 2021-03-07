package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeployKeyEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeployKeyEdgeResponseProjection extends GraphQLResponseProjection {

    public DeployKeyEdgeResponseProjection() {
    }

    @Override
    public DeployKeyEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeployKeyEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", projectionDepthOnFields.getOrDefault("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", 0) + 1);
            this.node(new DeployKeyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyEdgeResponseProjection.DeployKeyResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public DeployKeyEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public DeployKeyEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public DeployKeyEdgeResponseProjection node(DeployKeyResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public DeployKeyEdgeResponseProjection node(String alias, DeployKeyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public DeployKeyEdgeResponseProjection typename() {
        return typename(null);
    }

    public DeployKeyEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
