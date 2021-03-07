package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateSubscriptionPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateSubscriptionPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateSubscriptionPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateSubscriptionPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable"] = projectionDepthOnFields.getOrDefault("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", 0) + 1
            this.subscribable(SubscribableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateSubscriptionPayloadResponseProjection.SubscribableResponseProjection.subscribable", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdateSubscriptionPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateSubscriptionPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun subscribable(subProjection: SubscribableResponseProjection): UpdateSubscriptionPayloadResponseProjection = subscribable(null, subProjection)

    fun subscribable(alias: String?, subProjection: SubscribableResponseProjection): UpdateSubscriptionPayloadResponseProjection {
        fields.add(GraphQLResponseField("subscribable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdateSubscriptionPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateSubscriptionPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
