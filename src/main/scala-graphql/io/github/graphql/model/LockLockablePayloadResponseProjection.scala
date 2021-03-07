package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for LockLockablePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class LockLockablePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): LockLockablePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): LockLockablePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", 0) <= maxDepth) {
            projectionDepthOnFields.put("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", projectionDepthOnFields.getOrDefault("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", 0) + 1)
            this.lockedRecord(new LockableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): LockLockablePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): LockLockablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def lockedRecord(subProjection: LockableResponseProjection): LockLockablePayloadResponseProjection = {
        lockedRecord(null.asInstanceOf[String], subProjection)
    }

    def lockedRecord(alias: String, subProjection: LockableResponseProjection): LockLockablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("lockedRecord").alias(alias).projection(subProjection))
        this
    }

    def typename(): LockLockablePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LockLockablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
