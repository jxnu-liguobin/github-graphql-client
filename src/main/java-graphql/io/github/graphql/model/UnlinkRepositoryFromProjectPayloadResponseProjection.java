package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UnlinkRepositoryFromProjectPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnlinkRepositoryFromProjectPayloadResponseProjection extends GraphQLResponseProjection {

    public UnlinkRepositoryFromProjectPayloadResponseProjection() {
    }

    @Override
    public UnlinkRepositoryFromProjectPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnlinkRepositoryFromProjectPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlinkRepositoryFromProjectPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlinkRepositoryFromProjectPayloadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public UnlinkRepositoryFromProjectPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UnlinkRepositoryFromProjectPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UnlinkRepositoryFromProjectPayloadResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public UnlinkRepositoryFromProjectPayloadResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public UnlinkRepositoryFromProjectPayloadResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public UnlinkRepositoryFromProjectPayloadResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public UnlinkRepositoryFromProjectPayloadResponseProjection typename() {
        return typename(null);
    }

    public UnlinkRepositoryFromProjectPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
