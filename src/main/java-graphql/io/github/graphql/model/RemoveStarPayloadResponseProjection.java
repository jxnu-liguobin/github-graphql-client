package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RemoveStarPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RemoveStarPayloadResponseProjection extends GraphQLResponseProjection {

    public RemoveStarPayloadResponseProjection() {
    }

    @Override
    public RemoveStarPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RemoveStarPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", projectionDepthOnFields.getOrDefault("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) + 1);
            this.starrable(new StarrableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0)));
        }
        this.typename();
        return this;
    }

    public RemoveStarPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public RemoveStarPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public RemoveStarPayloadResponseProjection starrable(StarrableResponseProjection subProjection) {
        return starrable(null, subProjection);
    }

    public RemoveStarPayloadResponseProjection starrable(String alias, StarrableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("starrable").alias(alias).projection(subProjection));
        return this;
    }

    public RemoveStarPayloadResponseProjection typename() {
        return typename(null);
    }

    public RemoveStarPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
