package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ChangeUserStatusPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ChangeUserStatusPayloadResponseProjection extends GraphQLResponseProjection {

    public ChangeUserStatusPayloadResponseProjection() {
    }

    @Override
    public ChangeUserStatusPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ChangeUserStatusPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", projectionDepthOnFields.getOrDefault("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", 0) + 1);
            this.status(new UserStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", 0)));
        }
        this.typename();
        return this;
    }

    public ChangeUserStatusPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public ChangeUserStatusPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public ChangeUserStatusPayloadResponseProjection status(UserStatusResponseProjection subProjection) {
        return status(null, subProjection);
    }

    public ChangeUserStatusPayloadResponseProjection status(String alias, UserStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("status").alias(alias).projection(subProjection));
        return this;
    }

    public ChangeUserStatusPayloadResponseProjection typename() {
        return typename(null);
    }

    public ChangeUserStatusPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
