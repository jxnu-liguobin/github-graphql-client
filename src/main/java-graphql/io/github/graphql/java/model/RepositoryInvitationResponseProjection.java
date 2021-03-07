package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RepositoryInvitation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryInvitationResponseProjection extends GraphQLResponseProjection {

    public RepositoryInvitationResponseProjection() {
    }

    @Override
    public RepositoryInvitationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryInvitationResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", 0) + 1);
            this.invitee(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.invitee", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", 0) + 1);
            this.inviter(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.UserResponseProjection.inviter", 0)));
        }
        this.permission();
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationResponseProjection.RepositoryInfoResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public RepositoryInvitationResponseProjection id() {
        return id(null);
    }

    public RepositoryInvitationResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RepositoryInvitationResponseProjection invitee(UserResponseProjection subProjection) {
        return invitee(null, subProjection);
    }

    public RepositoryInvitationResponseProjection invitee(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("invitee").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryInvitationResponseProjection inviter(UserResponseProjection subProjection) {
        return inviter(null, subProjection);
    }

    public RepositoryInvitationResponseProjection inviter(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inviter").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryInvitationResponseProjection permission() {
        return permission(null);
    }

    public RepositoryInvitationResponseProjection permission(String alias) {
        fields.add(new GraphQLResponseField("permission").alias(alias));
        return this;
    }

    public RepositoryInvitationResponseProjection repository(RepositoryInfoResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public RepositoryInvitationResponseProjection repository(String alias, RepositoryInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryInvitationResponseProjection typename() {
        return typename(null);
    }

    public RepositoryInvitationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RepositoryInvitationResponseProjection that = (RepositoryInvitationResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
