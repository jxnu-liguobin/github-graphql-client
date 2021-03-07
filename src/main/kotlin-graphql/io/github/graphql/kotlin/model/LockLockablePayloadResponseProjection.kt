package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LockLockablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LockLockablePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LockLockablePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LockLockablePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", 0) <= maxDepth) {
            projectionDepthOnFields["LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord"] = projectionDepthOnFields.getOrDefault("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", 0) + 1
            this.lockedRecord(LockableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): LockLockablePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): LockLockablePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun lockedRecord(subProjection: LockableResponseProjection): LockLockablePayloadResponseProjection = lockedRecord(null, subProjection)

    fun lockedRecord(alias: String?, subProjection: LockableResponseProjection): LockLockablePayloadResponseProjection {
        fields.add(GraphQLResponseField("lockedRecord").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): LockLockablePayloadResponseProjection = typename(null)

    fun typename(alias: String?): LockLockablePayloadResponseProjection {
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
        val that = other as LockLockablePayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
