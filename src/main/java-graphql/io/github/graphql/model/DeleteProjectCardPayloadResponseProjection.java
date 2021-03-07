package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeleteProjectCardPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeleteProjectCardPayloadResponseProjection extends GraphQLResponseProjection {

    public DeleteProjectCardPayloadResponseProjection() {
    }

    @Override
    public DeleteProjectCardPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeleteProjectCardPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", projectionDepthOnFields.getOrDefault("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", 0) + 1);
            this.column(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", 0)));
        }
        this.deletedCardId();
        this.typename();
        return this;
    }

    public DeleteProjectCardPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeleteProjectCardPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeleteProjectCardPayloadResponseProjection column(ProjectColumnResponseProjection subProjection) {
        return column(null, subProjection);
    }

    public DeleteProjectCardPayloadResponseProjection column(String alias, ProjectColumnResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("column").alias(alias).projection(subProjection));
        return this;
    }

    public DeleteProjectCardPayloadResponseProjection deletedCardId() {
        return deletedCardId(null);
    }

    public DeleteProjectCardPayloadResponseProjection deletedCardId(String alias) {
        fields.add(new GraphQLResponseField("deletedCardId").alias(alias));
        return this;
    }

    public DeleteProjectCardPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeleteProjectCardPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
