package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnresolveReviewThreadPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UnresolveReviewThreadPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnresolveReviewThreadPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnresolveReviewThreadPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) <= maxDepth) {
            projectionDepthOnFields["UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread"] = projectionDepthOnFields.getOrDefault("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) + 1
            this.thread(PullRequestReviewThreadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UnresolveReviewThreadPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UnresolveReviewThreadPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun thread(subProjection: PullRequestReviewThreadResponseProjection): UnresolveReviewThreadPayloadResponseProjection = thread(null, subProjection)

    fun thread(alias: String?, subProjection: PullRequestReviewThreadResponseProjection): UnresolveReviewThreadPayloadResponseProjection {
        fields.add(GraphQLResponseField("thread").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UnresolveReviewThreadPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UnresolveReviewThreadPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
