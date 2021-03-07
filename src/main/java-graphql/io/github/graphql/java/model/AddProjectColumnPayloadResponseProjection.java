package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for AddProjectColumnPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddProjectColumnPayloadResponseProjection extends GraphQLResponseProjection {

    public AddProjectColumnPayloadResponseProjection() {
    }

    @Override
    public AddProjectColumnPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddProjectColumnPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) + 1);
            this.columnEdge(new ProjectColumnEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0)));
        }
        this.typename();
        return this;
    }

    public AddProjectColumnPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AddProjectColumnPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AddProjectColumnPayloadResponseProjection columnEdge(ProjectColumnEdgeResponseProjection subProjection) {
        return columnEdge(null, subProjection);
    }

    public AddProjectColumnPayloadResponseProjection columnEdge(String alias, ProjectColumnEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("columnEdge").alias(alias).projection(subProjection));
        return this;
    }

    public AddProjectColumnPayloadResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public AddProjectColumnPayloadResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public AddProjectColumnPayloadResponseProjection typename() {
        return typename(null);
    }

    public AddProjectColumnPayloadResponseProjection typename(String alias) {
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
        final AddProjectColumnPayloadResponseProjection that = (AddProjectColumnPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
