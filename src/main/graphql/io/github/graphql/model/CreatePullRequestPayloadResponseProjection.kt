package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatePullRequestPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreatePullRequestPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatePullRequestPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatePullRequestPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): CreatePullRequestPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): CreatePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): CreatePullRequestPayloadResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): CreatePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatePullRequestPayloadResponseProjection = typename(null)

    fun typename(alias: String?): CreatePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
