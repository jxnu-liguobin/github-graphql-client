package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for TeamMemberConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TeamMemberConnectionResponseProjection extends GraphQLResponseProjection {

    public TeamMemberConnectionResponseProjection() {
    }

    @Override
    public TeamMemberConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TeamMemberConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.TeamMemberEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamMemberConnectionResponseProjection.TeamMemberEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.TeamMemberEdgeResponseProjection.edges", 0) + 1);
            this.edges(new TeamMemberEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.TeamMemberEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamMemberConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1);
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.UserResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public TeamMemberConnectionResponseProjection edges(TeamMemberEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public TeamMemberConnectionResponseProjection edges(String alias, TeamMemberEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public TeamMemberConnectionResponseProjection nodes(UserResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public TeamMemberConnectionResponseProjection nodes(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public TeamMemberConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public TeamMemberConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public TeamMemberConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public TeamMemberConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public TeamMemberConnectionResponseProjection typename() {
        return typename(null);
    }

    public TeamMemberConnectionResponseProjection typename(String alias) {
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
        final TeamMemberConnectionResponseProjection that = (TeamMemberConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
