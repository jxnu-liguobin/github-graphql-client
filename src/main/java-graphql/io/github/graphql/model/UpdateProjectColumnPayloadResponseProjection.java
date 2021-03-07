package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdateProjectColumnPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateProjectColumnPayloadResponseProjection extends GraphQLResponseProjection {

    public UpdateProjectColumnPayloadResponseProjection() {
    }

    @Override
    public UpdateProjectColumnPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdateProjectColumnPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", projectionDepthOnFields.getOrDefault("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) + 1);
            this.projectColumn(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateProjectColumnPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateProjectColumnPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateProjectColumnPayloadResponseProjection projectColumn(ProjectColumnResponseProjection subProjection) {
        return projectColumn(null, subProjection);
    }

    public UpdateProjectColumnPayloadResponseProjection projectColumn(String alias, ProjectColumnResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectColumn").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateProjectColumnPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateProjectColumnPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
