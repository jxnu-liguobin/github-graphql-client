package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReopenPullRequestPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReopenPullRequestPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReopenPullRequestPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReopenPullRequestPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ReopenPullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["ReopenPullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("ReopenPullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReopenPullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): ReopenPullRequestPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): ReopenPullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): ReopenPullRequestPayloadResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): ReopenPullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReopenPullRequestPayloadResponseProjection = typename(null)

    fun typename(alias: String?): ReopenPullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
