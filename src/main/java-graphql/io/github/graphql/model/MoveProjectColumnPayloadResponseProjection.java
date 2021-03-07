package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MoveProjectColumnPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class MoveProjectColumnPayloadResponseProjection extends GraphQLResponseProjection {

    public MoveProjectColumnPayloadResponseProjection() {
    }

    @Override
    public MoveProjectColumnPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MoveProjectColumnPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", projectionDepthOnFields.getOrDefault("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0) + 1);
            this.columnEdge(new ProjectColumnEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MoveProjectColumnPayloadResponseProjection.ProjectColumnEdgeResponseProjection.columnEdge", 0)));
        }
        this.typename();
        return this;
    }

    public MoveProjectColumnPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public MoveProjectColumnPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public MoveProjectColumnPayloadResponseProjection columnEdge(ProjectColumnEdgeResponseProjection subProjection) {
        return columnEdge(null, subProjection);
    }

    public MoveProjectColumnPayloadResponseProjection columnEdge(String alias, ProjectColumnEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("columnEdge").alias(alias).projection(subProjection));
        return this;
    }

    public MoveProjectColumnPayloadResponseProjection typename() {
        return typename(null);
    }

    public MoveProjectColumnPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
