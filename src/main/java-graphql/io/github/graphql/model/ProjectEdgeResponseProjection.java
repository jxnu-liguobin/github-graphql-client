package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ProjectEdgeResponseProjection extends GraphQLResponseProjection {

    public ProjectEdgeResponseProjection() {
    }

    @Override
    public ProjectEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectEdgeResponseProjection.ProjectResponseProjection.node", projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0) + 1);
            this.node(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ProjectEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProjectEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ProjectEdgeResponseProjection node(ProjectResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProjectEdgeResponseProjection node(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectEdgeResponseProjection typename() {
        return typename(null);
    }

    public ProjectEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
