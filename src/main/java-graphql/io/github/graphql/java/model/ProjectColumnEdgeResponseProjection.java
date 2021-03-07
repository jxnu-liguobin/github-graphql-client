package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ProjectColumnEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProjectColumnEdgeResponseProjection extends GraphQLResponseProjection {

    public ProjectColumnEdgeResponseProjection() {
    }

    @Override
    public ProjectColumnEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectColumnEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", projectionDepthOnFields.getOrDefault("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", 0) + 1);
            this.node(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnEdgeResponseProjection.ProjectColumnResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ProjectColumnEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProjectColumnEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ProjectColumnEdgeResponseProjection node(ProjectColumnResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProjectColumnEdgeResponseProjection node(String alias, ProjectColumnResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectColumnEdgeResponseProjection typename() {
        return typename(null);
    }

    public ProjectColumnEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ProjectColumnEdgeResponseProjection that = (ProjectColumnEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
