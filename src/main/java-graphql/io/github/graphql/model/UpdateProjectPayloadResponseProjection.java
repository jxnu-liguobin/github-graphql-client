package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdateProjectPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdateProjectPayloadResponseProjection extends GraphQLResponseProjection {

    public UpdateProjectPayloadResponseProjection() {
    }

    @Override
    public UpdateProjectPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdateProjectPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateProjectPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateProjectPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateProjectPayloadResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public UpdateProjectPayloadResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateProjectPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateProjectPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
