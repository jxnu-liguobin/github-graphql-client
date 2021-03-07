package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserContentEditConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UserContentEditConnectionResponseProjection extends GraphQLResponseProjection {

    public UserContentEditConnectionResponseProjection() {
    }

    @Override
    public UserContentEditConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserContentEditConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", 0) + 1);
            this.edges(new UserContentEditEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", 0) + 1);
            this.nodes(new UserContentEditResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.UserContentEditResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public UserContentEditConnectionResponseProjection edges(UserContentEditEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public UserContentEditConnectionResponseProjection edges(String alias, UserContentEditEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public UserContentEditConnectionResponseProjection nodes(UserContentEditResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public UserContentEditConnectionResponseProjection nodes(String alias, UserContentEditResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public UserContentEditConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public UserContentEditConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public UserContentEditConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public UserContentEditConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public UserContentEditConnectionResponseProjection typename() {
        return typename(null);
    }

    public UserContentEditConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
