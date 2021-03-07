package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnlockLockablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UnlockLockablePayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
