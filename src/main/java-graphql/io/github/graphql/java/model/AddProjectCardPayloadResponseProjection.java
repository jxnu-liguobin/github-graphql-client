package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for AddProjectCardPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddProjectCardPayloadResponseProjection extends GraphQLResponseProjection {

    public AddProjectCardPayloadResponseProjection() {
    }

    @Override
    public AddProjectCardPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddProjectCardPayloadResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) + 1);
            this.cardEdge(new ProjectCardEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0)));
        }
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) + 1);
            this.projectColumn(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0)));
        }
        this.typename();
        return this;
    }

    public AddProjectCardPayloadResponseProjection cardEdge(ProjectCardEdgeResponseProjection subProjection) {
        return cardEdge(null, subProjection);
    }

    public AddProjectCardPayloadResponseProjection cardEdge(String alias, ProjectCardEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cardEdge").alias(alias).projection(subProjection));
        return this;
    }

    public AddProjectCardPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AddProjectCardPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AddProjectCardPayloadResponseProjection projectColumn(ProjectColumnResponseProjection subProjection) {
        return projectColumn(null, subProjection);
    }

    public AddProjectCardPayloadResponseProjection projectColumn(String alias, ProjectColumnResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectColumn").alias(alias).projection(subProjection));
        return this;
    }

    public AddProjectCardPayloadResponseProjection typename() {
        return typename(null);
    }

    public AddProjectCardPayloadResponseProjection typename(String alias) {
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
        final AddProjectCardPayloadResponseProjection that = (AddProjectCardPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
