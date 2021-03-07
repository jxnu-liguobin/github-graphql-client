package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatePullRequestPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatePullRequestPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatePullRequestPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatePullRequestPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatePullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): CreatePullRequestPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): CreatePullRequestPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): CreatePullRequestPayloadResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): CreatePullRequestPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatePullRequestPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatePullRequestPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
