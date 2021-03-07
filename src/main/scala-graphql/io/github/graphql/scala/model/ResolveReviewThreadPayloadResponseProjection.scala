package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ResolveReviewThreadPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ResolveReviewThreadPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): ResolveReviewThreadPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): ResolveReviewThreadPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", projectionDepthOnFields.getOrDefault("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0) + 1)
            this.thread(new PullRequestReviewThreadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResolveReviewThreadPayloadResponseProjection.PullRequestReviewThreadResponseProjection.thread", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): ResolveReviewThreadPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): ResolveReviewThreadPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def thread(subProjection: PullRequestReviewThreadResponseProjection): ResolveReviewThreadPayloadResponseProjection = {
        thread(null.asInstanceOf[String], subProjection)
    }

    def thread(alias: String, subProjection: PullRequestReviewThreadResponseProjection): ResolveReviewThreadPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("thread").alias(alias).projection(subProjection))
        this
    }

    def typename(): ResolveReviewThreadPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ResolveReviewThreadPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ResolveReviewThreadPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
