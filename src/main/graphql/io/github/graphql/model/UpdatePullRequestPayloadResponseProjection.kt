package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdatePullRequestPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdatePullRequestPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdatePullRequestPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdatePullRequestPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["UpdatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("UpdatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdatePullRequestPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdatePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): UpdatePullRequestPayloadResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): UpdatePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdatePullRequestPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdatePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
