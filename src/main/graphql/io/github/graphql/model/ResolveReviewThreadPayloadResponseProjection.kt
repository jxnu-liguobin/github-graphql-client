package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ResolveReviewThreadPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ResolveReviewThreadPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ResolveReviewThreadPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ResolveReviewThreadPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) <= maxDepth) {
            projectionDepthOnFields["ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread"] = projectionDepthOnFields.getOrDefault("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) + 1
            this.thread(PullRequestReviewThreadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): ResolveReviewThreadPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): ResolveReviewThreadPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun thread(subProjection: PullRequestReviewThreadResponseProjection): ResolveReviewThreadPayloadResponseProjection = thread(null, subProjection)

    fun thread(alias: String?, subProjection: PullRequestReviewThreadResponseProjection): ResolveReviewThreadPayloadResponseProjection {
        fields.add(GraphQLResponseField("thread").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ResolveReviewThreadPayloadResponseProjection = typename(null)

    fun typename(alias: String?): ResolveReviewThreadPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
