package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdateProjectCardPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdateProjectCardPayloadResponseProjection extends GraphQLResponseProjection {

    public UpdateProjectCardPayloadResponseProjection() {
    }

    @Override
    public UpdateProjectCardPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdateProjectCardPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", projectionDepthOnFields.getOrDefault("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) + 1);
            this.projectCard(new ProjectCardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateProjectCardPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateProjectCardPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateProjectCardPayloadResponseProjection projectCard(ProjectCardResponseProjection subProjection) {
        return projectCard(null, subProjection);
    }

    public UpdateProjectCardPayloadResponseProjection projectCard(String alias, ProjectCardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectCard").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateProjectCardPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateProjectCardPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
