package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for UserStatusConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UserStatusConnectionResponseProjection extends GraphQLResponseProjection {

    public UserStatusConnectionResponseProjection() {
    }

    @Override
    public UserStatusConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserStatusConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", 0) + 1);
            this.edges(new UserStatusEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", 0) + 1);
            this.nodes(new UserStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.UserStatusResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public UserStatusConnectionResponseProjection edges(UserStatusEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public UserStatusConnectionResponseProjection edges(String alias, UserStatusEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public UserStatusConnectionResponseProjection nodes(UserStatusResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public UserStatusConnectionResponseProjection nodes(String alias, UserStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public UserStatusConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public UserStatusConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public UserStatusConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public UserStatusConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public UserStatusConnectionResponseProjection typename() {
        return typename(null);
    }

    public UserStatusConnectionResponseProjection typename(String alias) {
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
        final UserStatusConnectionResponseProjection that = (UserStatusConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
