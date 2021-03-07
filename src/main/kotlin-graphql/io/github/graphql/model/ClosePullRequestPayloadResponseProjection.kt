package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ClosePullRequestPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ClosePullRequestPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ClosePullRequestPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ClosePullRequestPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ClosePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["ClosePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("ClosePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ClosePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): ClosePullRequestPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): ClosePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): ClosePullRequestPayloadResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): ClosePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ClosePullRequestPayloadResponseProjection = typename(null)

    fun typename(alias: String?): ClosePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
