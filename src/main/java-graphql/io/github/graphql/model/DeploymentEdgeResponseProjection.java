package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeploymentEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeploymentEdgeResponseProjection extends GraphQLResponseProjection {

    public DeploymentEdgeResponseProjection() {
    }

    @Override
    public DeploymentEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeploymentEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", projectionDepthOnFields.getOrDefault("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", 0) + 1);
            this.node(new DeploymentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEdgeResponseProjection.DeploymentResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public DeploymentEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public DeploymentEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public DeploymentEdgeResponseProjection node(DeploymentResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public DeploymentEdgeResponseProjection node(String alias, DeploymentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentEdgeResponseProjection typename() {
        return typename(null);
    }

    public DeploymentEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
