package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeploymentStatusEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeploymentStatusEdgeResponseProjection extends GraphQLResponseProjection {

    public DeploymentStatusEdgeResponseProjection() {
    }

    @Override
    public DeploymentStatusEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeploymentStatusEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", projectionDepthOnFields.getOrDefault("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", 0) + 1);
            this.node(new DeploymentStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusEdgeResponseProjection.DeploymentStatusResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public DeploymentStatusEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public DeploymentStatusEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public DeploymentStatusEdgeResponseProjection node(DeploymentStatusResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public DeploymentStatusEdgeResponseProjection node(String alias, DeploymentStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentStatusEdgeResponseProjection typename() {
        return typename(null);
    }

    public DeploymentStatusEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
