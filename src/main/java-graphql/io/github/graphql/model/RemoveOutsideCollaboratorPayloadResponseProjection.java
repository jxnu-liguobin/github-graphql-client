package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RemoveOutsideCollaboratorPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RemoveOutsideCollaboratorPayloadResponseProjection extends GraphQLResponseProjection {

    public RemoveOutsideCollaboratorPayloadResponseProjection() {
    }

    @Override
    public RemoveOutsideCollaboratorPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RemoveOutsideCollaboratorPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", projectionDepthOnFields.getOrDefault("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", 0) + 1);
            this.removedUser(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveOutsideCollaboratorPayloadResponseProjection.UserResponseProjection.removedUser", 0)));
        }
        this.typename();
        return this;
    }

    public RemoveOutsideCollaboratorPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public RemoveOutsideCollaboratorPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public RemoveOutsideCollaboratorPayloadResponseProjection removedUser(UserResponseProjection subProjection) {
        return removedUser(null, subProjection);
    }

    public RemoveOutsideCollaboratorPayloadResponseProjection removedUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("removedUser").alias(alias).projection(subProjection));
        return this;
    }

    public RemoveOutsideCollaboratorPayloadResponseProjection typename() {
        return typename(null);
    }

    public RemoveOutsideCollaboratorPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
