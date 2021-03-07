package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdateRefPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdateRefPayloadResponseProjection extends GraphQLResponseProjection {

    public UpdateRefPayloadResponseProjection() {
    }

    @Override
    public UpdateRefPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdateRefPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", 0) + 1);
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateRefPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateRefPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateRefPayloadResponseProjection ref(RefResponseProjection subProjection) {
        return ref(null, subProjection);
    }

    public UpdateRefPayloadResponseProjection ref(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateRefPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateRefPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}