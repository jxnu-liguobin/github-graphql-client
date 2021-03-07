package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for LinkRepositoryToProjectPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class LinkRepositoryToProjectPayloadResponseProjection extends GraphQLResponseProjection {

    public LinkRepositoryToProjectPayloadResponseProjection() {
    }

    @Override
    public LinkRepositoryToProjectPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LinkRepositoryToProjectPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public LinkRepositoryToProjectPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public LinkRepositoryToProjectPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public LinkRepositoryToProjectPayloadResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public LinkRepositoryToProjectPayloadResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public LinkRepositoryToProjectPayloadResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public LinkRepositoryToProjectPayloadResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public LinkRepositoryToProjectPayloadResponseProjection typename() {
        return typename(null);
    }

    public LinkRepositoryToProjectPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
