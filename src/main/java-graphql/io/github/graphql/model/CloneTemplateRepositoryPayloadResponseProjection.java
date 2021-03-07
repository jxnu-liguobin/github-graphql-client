package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CloneTemplateRepositoryPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CloneTemplateRepositoryPayloadResponseProjection extends GraphQLResponseProjection {

    public CloneTemplateRepositoryPayloadResponseProjection() {
    }

    @Override
    public CloneTemplateRepositoryPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CloneTemplateRepositoryPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public CloneTemplateRepositoryPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CloneTemplateRepositoryPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CloneTemplateRepositoryPayloadResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public CloneTemplateRepositoryPayloadResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public CloneTemplateRepositoryPayloadResponseProjection typename() {
        return typename(null);
    }

    public CloneTemplateRepositoryPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
