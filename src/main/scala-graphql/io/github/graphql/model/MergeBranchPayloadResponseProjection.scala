package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MergeBranchPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MergeBranchPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): MergeBranchPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): MergeBranchPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", projectionDepthOnFields.getOrDefault("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", 0) + 1)
            this.mergeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): MergeBranchPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): MergeBranchPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def mergeCommit(subProjection: CommitResponseProjection): MergeBranchPayloadResponseProjection = {
        mergeCommit(null.asInstanceOf[String], subProjection)
    }

    def mergeCommit(alias: String, subProjection: CommitResponseProjection): MergeBranchPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("mergeCommit").alias(alias).projection(subProjection))
        this
    }

    def typename(): MergeBranchPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MergeBranchPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
