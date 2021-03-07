package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnresolveReviewThreadPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UnresolveReviewThreadPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UnresolveReviewThreadPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UnresolveReviewThreadPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", projectionDepthOnFields.getOrDefault("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) + 1)
            this.thread(new PullRequestReviewThreadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnresolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UnresolveReviewThreadPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UnresolveReviewThreadPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def thread(subProjection: PullRequestReviewThreadResponseProjection): UnresolveReviewThreadPayloadResponseProjection = {
        thread(null.asInstanceOf[String], subProjection)
    }

    def thread(alias: String, subProjection: PullRequestReviewThreadResponseProjection): UnresolveReviewThreadPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("thread").alias(alias).projection(subProjection))
        this
    }

    def typename(): UnresolveReviewThreadPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UnresolveReviewThreadPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
