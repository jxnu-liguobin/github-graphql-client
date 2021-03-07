package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeleteProjectColumnPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeleteProjectColumnPayloadResponseProjection extends GraphQLResponseProjection {

    public DeleteProjectColumnPayloadResponseProjection() {
    }

    @Override
    public DeleteProjectColumnPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeleteProjectColumnPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        this.deletedColumnId();
        if (projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0)));
        }
        this.typename();
        return this;
    }

    public DeleteProjectColumnPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeleteProjectColumnPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeleteProjectColumnPayloadResponseProjection deletedColumnId() {
        return deletedColumnId(null);
    }

    public DeleteProjectColumnPayloadResponseProjection deletedColumnId(String alias) {
        fields.add(new GraphQLResponseField("deletedColumnId").alias(alias));
        return this;
    }

    public DeleteProjectColumnPayloadResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public DeleteProjectColumnPayloadResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public DeleteProjectColumnPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeleteProjectColumnPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
