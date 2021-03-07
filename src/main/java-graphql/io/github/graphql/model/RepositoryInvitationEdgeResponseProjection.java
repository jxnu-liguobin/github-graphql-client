package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RepositoryInvitationEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RepositoryInvitationEdgeResponseProjection extends GraphQLResponseProjection {

    public RepositoryInvitationEdgeResponseProjection() {
    }

    @Override
    public RepositoryInvitationEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryInvitationEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", projectionDepthOnFields.getOrDefault("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", 0) + 1);
            this.node(new RepositoryInvitationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RepositoryInvitationEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RepositoryInvitationEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RepositoryInvitationEdgeResponseProjection node(RepositoryInvitationResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RepositoryInvitationEdgeResponseProjection node(String alias, RepositoryInvitationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryInvitationEdgeResponseProjection typename() {
        return typename(null);
    }

    public RepositoryInvitationEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
