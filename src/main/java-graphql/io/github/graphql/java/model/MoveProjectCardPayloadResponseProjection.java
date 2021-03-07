package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for MoveProjectCardPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MoveProjectCardPayloadResponseProjection extends GraphQLResponseProjection {

    public MoveProjectCardPayloadResponseProjection() {
    }

    @Override
    public MoveProjectCardPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MoveProjectCardPayloadResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", projectionDepthOnFields.getOrDefault("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0) + 1);
            this.cardEdge(new ProjectCardEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MoveProjectCardPayloadResponseProjection.ProjectCardEdgeResponseProjection.cardEdge", 0)));
        }
        this.clientMutationId();
        this.typename();
        return this;
    }

    public MoveProjectCardPayloadResponseProjection cardEdge(ProjectCardEdgeResponseProjection subProjection) {
        return cardEdge(null, subProjection);
    }

    public MoveProjectCardPayloadResponseProjection cardEdge(String alias, ProjectCardEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cardEdge").alias(alias).projection(subProjection));
        return this;
    }

    public MoveProjectCardPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public MoveProjectCardPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public MoveProjectCardPayloadResponseProjection typename() {
        return typename(null);
    }

    public MoveProjectCardPayloadResponseProjection typename(String alias) {
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
        final MoveProjectCardPayloadResponseProjection that = (MoveProjectCardPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
