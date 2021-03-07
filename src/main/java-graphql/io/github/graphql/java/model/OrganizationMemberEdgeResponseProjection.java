package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for OrganizationMemberEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class OrganizationMemberEdgeResponseProjection extends GraphQLResponseProjection {

    public OrganizationMemberEdgeResponseProjection() {
    }

    @Override
    public OrganizationMemberEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrganizationMemberEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        this.hasTwoFactorEnabled();
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", 0) + 1);
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberEdgeResponseProjection.UserResponseProjection.node", 0)));
        }
        this.role();
        this.typename();
        return this;
    }

    public OrganizationMemberEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public OrganizationMemberEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public OrganizationMemberEdgeResponseProjection hasTwoFactorEnabled() {
        return hasTwoFactorEnabled(null);
    }

    public OrganizationMemberEdgeResponseProjection hasTwoFactorEnabled(String alias) {
        fields.add(new GraphQLResponseField("hasTwoFactorEnabled").alias(alias));
        return this;
    }

    public OrganizationMemberEdgeResponseProjection node(UserResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public OrganizationMemberEdgeResponseProjection node(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationMemberEdgeResponseProjection role() {
        return role(null);
    }

    public OrganizationMemberEdgeResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public OrganizationMemberEdgeResponseProjection typename() {
        return typename(null);
    }

    public OrganizationMemberEdgeResponseProjection typename(String alias) {
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
        final OrganizationMemberEdgeResponseProjection that = (OrganizationMemberEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
