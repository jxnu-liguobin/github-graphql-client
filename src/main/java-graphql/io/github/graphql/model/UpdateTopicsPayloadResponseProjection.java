package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdateTopicsPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateTopicsPayloadResponseProjection extends GraphQLResponseProjection {

    public UpdateTopicsPayloadResponseProjection() {
    }

    @Override
    public UpdateTopicsPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdateTopicsPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        this.invalidTopicNames();
        if (projectionDepthOnFields.getOrDefault("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateTopicsPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateTopicsPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateTopicsPayloadResponseProjection invalidTopicNames() {
        return invalidTopicNames(null);
    }

    public UpdateTopicsPayloadResponseProjection invalidTopicNames(String alias) {
        fields.add(new GraphQLResponseField("invalidTopicNames").alias(alias));
        return this;
    }

    public UpdateTopicsPayloadResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public UpdateTopicsPayloadResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateTopicsPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateTopicsPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
