package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MergePullRequestPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MergePullRequestPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MergePullRequestPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MergePullRequestPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("MergePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["MergePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("MergePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MergePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): MergePullRequestPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): MergePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): MergePullRequestPayloadResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): MergePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): MergePullRequestPayloadResponseProjection = typename(null)

    fun typename(alias: String?): MergePullRequestPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
