package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreateProjectPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreateProjectPayloadResponseProjection extends GraphQLResponseProjection {

    public CreateProjectPayloadResponseProjection() {
    }

    @Override
    public CreateProjectPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreateProjectPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)));
        }
        this.typename();
        return this;
    }

    public CreateProjectPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CreateProjectPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CreateProjectPayloadResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public CreateProjectPayloadResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public CreateProjectPayloadResponseProjection typename() {
        return typename(null);
    }

    public CreateProjectPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
