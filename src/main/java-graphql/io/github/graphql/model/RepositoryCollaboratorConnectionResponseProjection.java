package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RepositoryCollaboratorConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryCollaboratorConnectionResponseProjection extends GraphQLResponseProjection {

    public RepositoryCollaboratorConnectionResponseProjection() {
    }

    @Override
    public RepositoryCollaboratorConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryCollaboratorConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RepositoryCollaboratorEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.RepositoryCollaboratorEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1);
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.UserResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryCollaboratorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public RepositoryCollaboratorConnectionResponseProjection edges(RepositoryCollaboratorEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RepositoryCollaboratorConnectionResponseProjection edges(String alias, RepositoryCollaboratorEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryCollaboratorConnectionResponseProjection nodes(UserResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RepositoryCollaboratorConnectionResponseProjection nodes(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryCollaboratorConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RepositoryCollaboratorConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryCollaboratorConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RepositoryCollaboratorConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RepositoryCollaboratorConnectionResponseProjection typename() {
        return typename(null);
    }

    public RepositoryCollaboratorConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
