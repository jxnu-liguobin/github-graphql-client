package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectCardEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ProjectCardEdgeResponseProjection extends GraphQLResponseProjection {

    public ProjectCardEdgeResponseProjection() {
    }

    @Override
    public ProjectCardEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectCardEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", projectionDepthOnFields.getOrDefault("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", 0) + 1);
            this.node(new ProjectCardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardEdgeResponseProjection.ProjectCardResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ProjectCardEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProjectCardEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ProjectCardEdgeResponseProjection node(ProjectCardResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProjectCardEdgeResponseProjection node(String alias, ProjectCardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardEdgeResponseProjection typename() {
        return typename(null);
    }

    public ProjectCardEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
