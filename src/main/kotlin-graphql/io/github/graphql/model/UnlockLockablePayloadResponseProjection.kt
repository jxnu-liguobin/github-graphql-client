package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnlockLockablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UnlockLockablePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnlockLockablePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnlockLockablePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", 0) <= maxDepth) {
            projectionDepthOnFields["UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord"] = projectionDepthOnFields.getOrDefault("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", 0) + 1
            this.unlockedRecord(LockableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UnlockLockablePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UnlockLockablePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun unlockedRecord(subProjection: LockableResponseProjection): UnlockLockablePayloadResponseProjection = unlockedRecord(null, subProjection)

    fun unlockedRecord(alias: String?, subProjection: LockableResponseProjection): UnlockLockablePayloadResponseProjection {
        fields.add(GraphQLResponseField("unlockedRecord").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UnlockLockablePayloadResponseProjection = typename(null)

    fun typename(alias: String?): UnlockLockablePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
