package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MergeBranchPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MergeBranchPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MergeBranchPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MergeBranchPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", 0) <= maxDepth) {
            projectionDepthOnFields["MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit"] = projectionDepthOnFields.getOrDefault("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", 0) + 1
            this.mergeCommit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): MergeBranchPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): MergeBranchPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun mergeCommit(subProjection: CommitResponseProjection): MergeBranchPayloadResponseProjection = mergeCommit(null, subProjection)

    fun mergeCommit(alias: String?, subProjection: CommitResponseProjection): MergeBranchPayloadResponseProjection {
        fields.add(GraphQLResponseField("mergeCommit").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): MergeBranchPayloadResponseProjection = typename(null)

    fun typename(alias: String?): MergeBranchPayloadResponseProjection {
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
        val that = other as MergeBranchPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
