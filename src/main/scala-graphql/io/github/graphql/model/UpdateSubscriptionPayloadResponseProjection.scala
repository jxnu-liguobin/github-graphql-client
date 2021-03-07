package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateSubscriptionPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateSubscriptionPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdateSubscriptionPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdateSubscriptionPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", projectionDepthOnFields.getOrDefault("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", 0) + 1)
            this.subscribable(new SubscribableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdateSubscriptionPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdateSubscriptionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def subscribable(subProjection: SubscribableResponseProjection): UpdateSubscriptionPayloadResponseProjection = {
        subscribable(null.asInstanceOf[String], subProjection)
    }

    def subscribable(alias: String, subProjection: SubscribableResponseProjection): UpdateSubscriptionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("subscribable").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdateSubscriptionPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdateSubscriptionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
