package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for TeamMemberEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TeamMemberEdgeResponseProjection extends GraphQLResponseProjection {

    public TeamMemberEdgeResponseProjection() {
    }

    @Override
    public TeamMemberEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TeamMemberEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        this.memberAccessResourcePath();
        this.memberAccessUrl();
        if (projectionDepthOnFields.getOrDefault("TeamMemberEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamMemberEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("TeamMemberEdgeResponseProjection.UserResponseProjection.node", 0) + 1);
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamMemberEdgeResponseProjection.UserResponseProjection.node", 0)));
        }
        this.role();
        this.typename();
        return this;
    }

    public TeamMemberEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public TeamMemberEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public TeamMemberEdgeResponseProjection memberAccessResourcePath() {
        return memberAccessResourcePath(null);
    }

    public TeamMemberEdgeResponseProjection memberAccessResourcePath(String alias) {
        fields.add(new GraphQLResponseField("memberAccessResourcePath").alias(alias));
        return this;
    }

    public TeamMemberEdgeResponseProjection memberAccessUrl() {
        return memberAccessUrl(null);
    }

    public TeamMemberEdgeResponseProjection memberAccessUrl(String alias) {
        fields.add(new GraphQLResponseField("memberAccessUrl").alias(alias));
        return this;
    }

    public TeamMemberEdgeResponseProjection node(UserResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public TeamMemberEdgeResponseProjection node(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public TeamMemberEdgeResponseProjection role() {
        return role(null);
    }

    public TeamMemberEdgeResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public TeamMemberEdgeResponseProjection typename() {
        return typename(null);
    }

    public TeamMemberEdgeResponseProjection typename(String alias) {
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
        final TeamMemberEdgeResponseProjection that = (TeamMemberEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
