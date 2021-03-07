package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for AddStarPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddStarPayloadResponseProjection extends GraphQLResponseProjection {

    public AddStarPayloadResponseProjection() {
    }

    @Override
    public AddStarPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddStarPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", projectionDepthOnFields.getOrDefault("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) + 1);
            this.starrable(new StarrableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0)));
        }
        this.typename();
        return this;
    }

    public AddStarPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AddStarPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AddStarPayloadResponseProjection starrable(StarrableResponseProjection subProjection) {
        return starrable(null, subProjection);
    }

    public AddStarPayloadResponseProjection starrable(String alias, StarrableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("starrable").alias(alias).projection(subProjection));
        return this;
    }

    public AddStarPayloadResponseProjection typename() {
        return typename(null);
    }

    public AddStarPayloadResponseProjection typename(String alias) {
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
        final AddStarPayloadResponseProjection that = (AddStarPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
