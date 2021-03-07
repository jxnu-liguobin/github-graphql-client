package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UpdateSubscriptionPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateSubscriptionPayloadResponseProjection extends GraphQLResponseProjection {

    public UpdateSubscriptionPayloadResponseProjection() {
    }

    @Override
    public UpdateSubscriptionPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdateSubscriptionPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", projectionDepthOnFields.getOrDefault("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", 0) + 1);
            this.subscribable(new SubscribableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateSubscriptionPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateSubscriptionPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateSubscriptionPayloadResponseProjection subscribable(SubscribableResponseProjection subProjection) {
        return subscribable(null, subProjection);
    }

    public UpdateSubscriptionPayloadResponseProjection subscribable(String alias, SubscribableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subscribable").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateSubscriptionPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateSubscriptionPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
