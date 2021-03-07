package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnresolveReviewThreadPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UnresolveReviewThreadPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
