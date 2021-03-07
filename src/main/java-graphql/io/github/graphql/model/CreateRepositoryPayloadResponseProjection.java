package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreateRepositoryPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreateRepositoryPayloadResponseProjection extends GraphQLResponseProjection {

    public CreateRepositoryPayloadResponseProjection() {
    }

    @Override
    public CreateRepositoryPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreateRepositoryPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("CreateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CreateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public CreateRepositoryPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CreateRepositoryPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CreateRepositoryPayloadResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public CreateRepositoryPayloadResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public CreateRepositoryPayloadResponseProjection typename() {
        return typename(null);
    }

    public CreateRepositoryPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
