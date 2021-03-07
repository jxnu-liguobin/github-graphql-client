package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreateRefPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreateRefPayloadResponseProjection extends GraphQLResponseProjection {

    public CreateRefPayloadResponseProjection() {
    }

    @Override
    public CreateRefPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreateRefPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("CreateRefPayloadResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateRefPayloadResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("CreateRefPayloadResponseProjection.RefResponseProjection.ref", 0) + 1);
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateRefPayloadResponseProjection.RefResponseProjection.ref", 0)));
        }
        this.typename();
        return this;
    }

    public CreateRefPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CreateRefPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CreateRefPayloadResponseProjection ref(RefResponseProjection subProjection) {
        return ref(null, subProjection);
    }

    public CreateRefPayloadResponseProjection ref(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection));
        return this;
    }

    public CreateRefPayloadResponseProjection typename() {
        return typename(null);
    }

    public CreateRefPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
