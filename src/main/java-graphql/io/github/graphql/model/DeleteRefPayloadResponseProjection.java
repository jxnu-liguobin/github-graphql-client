package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeleteRefPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeleteRefPayloadResponseProjection extends GraphQLResponseProjection {

    public DeleteRefPayloadResponseProjection() {
    }

    @Override
    public DeleteRefPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeleteRefPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        this.typename();
        return this;
    }

    public DeleteRefPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeleteRefPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeleteRefPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeleteRefPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
